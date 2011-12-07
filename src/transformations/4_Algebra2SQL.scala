package siq
trait Algebra2SQL extends FerryCore2Algebra {
  import algebra._
  val debug_ferrycore_algebra_association: scala.collection.mutable.ListMap[Relation,ferry.Expression] // for better debug info in sql
//  val t = algebra2sql _
  case class NestedSQL( sql:String, columns:List[String], nested:List[(String,NestedSQL)] )
/*  def flatten_algebra( relation:Relation ) : List[Relation] = (relation match{
    case bin:BinaryRelationOperator => relation :: flatten_algebra(bin.left) ::: flatten_algebra(bin.right)
    case un:UnaryRelationOperator => relation :: flatten_algebra(un.relation)
    case _:LiteralTable[_] => List(relation)
    case _:Table => List(relation)
  })*/

  // complete gaps of unregistered relations which were subexpressions when transformin a ferry expression
  def complete_debug_ferrycore_algebra_association( parent:Relation, child:Relation ){
    if( !debug_ferrycore_algebra_association.isDefinedAt(child) ){
      debug_ferrycore_algebra_association.update(child, debug_ferrycore_algebra_association(parent) )
    }
  }

  def linearize_dependencies( relation:Relation, already : List[Relation] = List(), parent_debug:Relation= null ) : List[Relation] = {
    if(!already.contains(relation)) {
      complete_debug_ferrycore_algebra_association( parent_debug, relation )
      relation :: {
        relation match{
          case bin:BinaryRelationOperator => {
            val right = linearize_dependencies( bin.right,already, relation )
            val left  = linearize_dependencies( bin.left, right++already, relation )
            left ++ right
          }
          case un:UnaryRelationOperator => linearize_dependencies(un.relation,already, relation)
          case _:LiteralTable[_] => List()
          case _:Table => List()
        }
      }
    } else List()
  }

  def relation2sql( relation:Relation ) = {
    val relations = linearize_dependencies(relation).reverse
    "\nWITH\n\ntdummy(x) AS (Values (1),(2))"+
      relations.map{
        case _:Table => ""
        case relation =>
      ",\n\n" + "-- " + relation.getOperatorName + " (created for ferry "+ debug_ferrycore_algebra_association(relation).getExpressionName +")\n" + //debug line
      "%s(%s) AS\n(%s)".format(
        relation.name
        ,relation.schema.mkString(",")
        ,operator2sql(relation)
      )}.filter( s => !(s=="") ).mkString("") +
      "\n\n"+
      "SELECT * FROM "+relation.name+"\n-- "+("-"*77)+"\n"
  }

  def algebra2sql( from:Nested ) : NestedSQL = {
    val sql = relation2sql( from.relation )
    NestedSQL( sql, from.relation.schema, from.itbls.map(_._1) zip from.itbls.map(_._2).map(algebra2sql _) )
  }
  def expression2sql( from:Expression ) : String = {
    def t = expression2sql _
    from match {
      case Variable( name ) => name
      case Operator( symbol, left, right ) => t(left) + " " + symbol + " " + t(right)
    }
  }

  def operator2sql( from: Relation ) : String = {
    def escape( value: Any ) : String = value match {
      case i:Int => i.toString
      case s:String   => "('" + s.replace("\\","\\\\").replace("'","\\'") + "'" + "::text)"  // FIXME: POSTGRES requires this cast, but is this comprehensive?
      case s:Char   => escape (s.toString)
      case b:Boolean => (if(b) 1 else 0).toString
    }
    (from match {
      case p@Projection( _, relation ) => "SELECT %s FROM %s".format(
        ( relation.qualify_columns(p.renames.map(_._1)), p.renames.map(_._2) ).zipped.map{
            case( from, to ) => from + " AS " + to
        }.mkString(", ")
        , relation.name
      )
      case Filter( predicate, relation ) => "SELECT * FROM %s WHERE %s".format(
        relation.name,
        expression2sql(predicate)
      )
      case OperatorApplication( as, symbol, left, right, relation ) => "SELECT *,%s FROM %s".format(
        left+" "+symbol+" "+right+" AS "+as,
        relation.name
      )
      case CartesianProduct( left, right ) => "SELECT %s FROM %s".format(
        (left.qualified_schema ++ right.qualified_schema).mkString(","),
        left.name + "," + right.name
      )
      case Join( predicate, left, right ) => "SELECT * FROM " + left.name +","+ right.name + " WHERE " + expression2sql( predicate )
      case DisjointUnion( left, right ) => "SELECT * FROM " + left.name + " UNION ALL SELECT * FROM " + right.name
      case Difference( left, right ) => "SELECT * FROM " + left.name + " EXCEPT ALL SELECT * FROM " + right.name
      case Attach( value, as, relation ) => "SELECT %s FROM %s".format(
        escape(value) +" AS "+ as + "," + relation.qualified_schema.mkString(",")
        , relation.name
      )
      case RowRank( as, orderBy, relation ) => // TODO: check this, not sure if right in Kaichaun Wen's Thesis
        "SELECT DENSE_RANK() OVER (ORDER BY %s) AS %s, %s FROM %s".format(
          orderBy.mkString(","),
          as,
          relation.qualify_columns(relation.schema).mkString(","),
          relation.name
        )
      case RowNumber( as, orderBy, relation, partitionBy ) => // TODO: check this, not sure if right in Kaichaun Wen's Thesis
        "SELECT ROW_NUMBER() OVER (%sORDER BY %s) AS %s, %s FROM %s".format(
          (partitionBy match {
            case Some(x) => "PARTITION BY "+x.mkString(",")+" "
            case _ => ""
          }),
          orderBy.mkString(","),
          as,
          relation.qualify_columns(relation.schema).mkString(","),
          relation.name
        )
      case Aggregation( operator, aggregate, as_, select, groupBy, relation ) =>
        ("SELECT "+operator+"("+aggregate+") AS "+as_ +", %s FROM %s GROUP BY %s").format(
          select.mkString(","),
          relation.name,
          groupBy.mkString(",")
        )
      case LiteralTable( data, schema ) => "VALUES %s".format( data.map( x => x match {
        case p:Product => "(%s)".format( p.productIterator.map(escape _).mkString(",") )
        case _ => "("+escape(x)+")"
      }).mkString(", "))
      case t:Table => t.name
    })
  }
}