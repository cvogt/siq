package siq

trait ISIQ2Ferry extends IModules{
  def genFerry  ( x: Rep[_] ):String
  def printFerry( x: Rep[_] )= println(genFerry(x))
}
trait SIQ2Ferry extends ISIQ2Ferry with Modules{
  object FerryHelpers{
    def render_projection( p:Exp[_], tables : List[Rep[Iterable[_]]], mapper: Exp[_] => String ) : String = p match {
      case Const(x)  => mapper(p)
      case _:Sym[_]  => rep2def(p) match {
        case t:LiftedTuple[_] => {
          "(" + (for( item_rep <- rep2def(p).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[Product].productIterator ) yield {/*println(item_rep.toString);*/render_projection( item_rep.asInstanceOf[Rep[_]], tables, mapper )}).mkString(",") + ")"
        }
        case _ => mapper(p.asInstanceOf[Sym[_]])
      }
    }

    def tables2string( q:Comprehension[_], mapper: Exp[_] => String ) = {
      val tables = List(q.inner)
      tables.map( table_rep => { val table = rep2generator[Any](table_rep);  table match {
        case _ => "q"+ (table.key) + " = " + mapper(table_rep)// + "("+table.toString+")"
      }}).mkString(", ") + " in for " + tables.map( table_rep => { val table = rep2generator[Any](table_rep);  table match {
        case t:Table[_] => "i" + table.key + " in " + "q" + table.key
        case _ => "i"+ (table.key) + " in " + "q"+ (table.key)
      }}).mkString(", ") +
          (if(q.filter.isDefined)" where "+ mapper(q.filter.get) else "") +
          (if(q.groupBy.isDefined) " group by " + mapper(q.groupBy.get) else "") +
          //(if(q.orderBy.isDefined) " order by " + mapper(q.orderBy.get) + " " /*+ FIXME: (if( q.order == ascending ) "ascending" else "descending")*/  else "") +
          "\nreturn "+ render_projection( q.element_raw, tables, mapper )
  }
  def table2string( table: Table[_] )
      = "table " + table.name + " (" + table.columns.map(
      c => c.name + " " + c.type_.toLowerCase
    ).mkString(", ") + ")" +
    " with keys ((" + table.keys.map( c => c.name ).mkString(", ") + "))"
  }
  addTransformations( args => args.node match{
    //case n:Node[t] => Node[t]( n.operator, n.x, n.y )
    case c: Column[_] => c
    //case q: Comprehension[t] => Comprehension[t](q.tables,q.element,args.mapper(q.filter))//,args.mapper(q.orderBy)) // FIXME: q.projection is not pushed through optimizer
    case _ => no_mapping()
  })
  addDefStringMappings( "Ferry", args => args.node match{
    // ferry supported operators: "not" (unary), "*", "/", "+", "-" , "%", "contains", "==", "!=", "<=", "<", ">=", ">", "and", "or" 
    case `+(Int,Int)`(l,r) => args.mapper(l) +"+"+ args.mapper(r)
    case Length(i) => "count("+args.mapper(i)+")"
    case _:Zip => "zip"+args.mapper(args.node.asInstanceOf[Zip].target)+""
    case One(i) => "the("+args.mapper(i)+")"
    case Sum(i) => "sum("+args.mapper(i)+")"
    case Flatten(i) => "concat("+args.mapper(i)+")"
    case Grouped(i) => {args.mapper(i)}
    case LiteralTable(i) => "[" + (i.map( x => x match{
      case _:Product => "("+x.asInstanceOf[Product].productIterator.map(Const(_)).map(args.mapper).mkString(",")+")"
      case _=> args.mapper(Const(x))
    }).mkString(",")) +  "]"
    case t:Table[_] => FerryHelpers.table2string(args.node.asInstanceOf[Table[_]].asInstanceOf[Table[_]])
    case f:FieldReference => rep2def(args.node.asInstanceOf[FieldReference].referree) match{
       case _:LiftedTuple[_] => "("+(rep2def(args.node.asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.productIterator.map(x => args.mapper(x.asInstanceOf[Rep[_]])).mkString(","))+")"
       case _ => "i"+{
         val it = args.node.asInstanceOf[FieldReference].iterable
         rep2def(it) match {
           case _:Generator[_] => rep2def(it).asInstanceOf[Generator[_]].key
           case _ => args.mapper(it)//"<"+rep2def(it).toString+">"
         }
       }+(if(args.node.asInstanceOf[FieldReference].position != 0) "."+args.node.asInstanceOf[FieldReference].position else "") //(if(args.node.asInstanceOf[FieldReference].position != 0) "."+args.node.asInstanceOf[FieldReference].position else "")// + " ("+rep2def(args.node.asInstanceOf[FieldReference].referree)+" "+args.node.asInstanceOf[FieldReference].generator+")"
    }
    case q: GeneratorReference => args.mapper(q.fieldref)
    case q: Comprehension[_] => "(let " + FerryHelpers.tables2string( q, args.mapper ) + ")" // format( args.mapper(q.projection), q.tables.map(t=>t.name+" "+t.alias).mkString(", "), args.mapper(q.filter), args.mapper(q.orderBy) )
    case n:Node[_] => '(' + args.mapper( n.x ) +' '+ (n.operator match{
      case "&&" => "and"
      case "||" => "or"
      case _ => n.operator
    }) +' '+ args.mapper( n.y ) + ')'
    case l: LiftedSchema[_,_] => "(" + (args.node.asInstanceOf[LiftedSchema[_,_]].schema.asInstanceOf[Product].productIterator.map(a => args.mapper(a.asInstanceOf[Rep[_]])).mkString(", ")) + ")"
    case _:LiftedTuple[_] =>     "(" + (args.node.asInstanceOf[LiftedTuple[_]].p.productIterator.map(x => args.mapper(x.asInstanceOf[Rep[_]])).mkString(","))+")"
    case _ => no_mapping()
  })
  def genFerry( r:Rep[_] ) = render( "Ferry", r, args => args.const match{
    case _:Int     => args.const.toString
    case _:Char    => '"' + (args.const.toString).replace("\\","\\\\").replace("\"","\\\"") + '"'
    case _:String  => '"' + (args.const.toString).replace("\\","\\\\").replace("\"","\\\"") + '"'
    case _:Boolean => "true"
    case _ => throw new Exception("unexpected: "+args.const.toString)
  })
}
