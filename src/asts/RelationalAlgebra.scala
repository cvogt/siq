package siq
trait RelationalAlgebra{
  object algebra{
    // helper functions
    abstract class freshName{
      var counter : Int = 0
      protected def next = {counter+=1;counter}
    }
    object freshTableName extends freshName{
      def apply() = 't'+next.toString
    }
    private def listify( tuple_or_list : Any ) : Iterable[_] =
      (tuple_or_list match {
          case s:String => List(s)
          case l:Iterable[_] => l
          case p:Product => p.productIterator
        }).toList

    /**
     * allows short hand notation for projection using list or tuple
     */
    private def make_shorthand_explicit( shorthand_renames : Any ) = {
      listify(shorthand_renames).flatMap{
        case t@(_,_) => t match{
          case (a:Iterable[String],b:Iterable[String]) => (a,b).zipped.toList
          case (a:String,b:Iterable[String]) => b.map( (a,_) )
          case (a:String,b:String)=> List( (a,b) )
        }
        case i:Iterable[String] => (i,i).zipped.toList
        case x:String => List( (x,x) )
      }.toList
    }

    // the AST only implements a pragmatic subset of the real requirements to ease debugging during development
    def require_schemata_disjoint(left:List[String],right:List[String]) = require(
      List() == (left intersect right)
      ,left.toString + " disjoint " + right.toString
    )

/*    def require_schema_contains_all_columns(relation:Relation,columns:List[String]) = require(
      columns.forall( relation.schema.contains(_) )
      , relation.schema.toString + " contains all "+ columns.toString
    )
*/

    /**
     * Tabelleninformationsknoten (q, cols, itbls) as called in Tom's Thesis
     * not part of relational algebra, but in here for pragmatic reasons
     * cols is actually not placed in here, but in every Relation as val data_columns
     */
    case class Nested(
      relation : Relation,
      itbls : List[(String,Nested)] = List()
    )

     // AST
    trait Node
    abstract class Relation(
      // unqualified column names
      val schema : List[String],
      data_columns_ : Option[List[String]] = None,
      val name : String = freshTableName()
    ) extends Node{
      def qualify_columns( columns : Iterable[String] ) = columns.map( name+"."+_ ).toList
      val qualified_schema = qualify_columns( schema ).toList
      val data_columns = data_columns_.getOrElse( schema.filter(_.startsWith("item")) ).toList
      val getOperatorName = getClass.toString.reverse.takeWhile(_!='$').reverse
      override def equals(other: Any) = other match {
        case a:AnyRef => this eq a
        case _ => false
      }
    }
    trait UnaryRelationOperator{
      val relation:Relation
    }
    trait BinaryRelationOperator{
      val left:Relation
      val right:Relation
    }
    trait Expression extends Node

    abstract class ResultType
    object TupleResult extends ResultType
    object ListResult extends ResultType

    case class Projection( // including rename
      shorthand_renames : Any, // !! beware of accidentally passing (a->b), which results NOT in a rename, but projection of two columns
      relation : Relation
    ) extends Relation( make_shorthand_explicit(shorthand_renames).map(_._2) ) with UnaryRelationOperator{
      val renames : List[(String,String)] = make_shorthand_explicit(shorthand_renames)
    }

    case class Filter(
      predicate : Expression,
      relation : Relation
    ) extends Relation( relation.schema ) with UnaryRelationOperator

    case class CartesianProduct(
      left : Relation,
      right : Relation
    ) extends Relation( left.schema ::: right.schema ) with BinaryRelationOperator{
      require_schemata_disjoint( left.schema, right.schema )
    }

    case class Join(
      predicate : Expression,
      left : Relation,
      right : Relation
    ) extends Relation( left.schema ::: right.schema ) with BinaryRelationOperator{
      require_schemata_disjoint( left.schema, right.schema )
    }

    case class DisjointUnion(
      left : Relation,
      right : Relation
    ) extends Relation (left.schema) with BinaryRelationOperator{
      require( left.schema == right.schema, left.schema.toString +" == "+right.schema.toString )
    }

    case class Difference(
      left : Relation,
      right : Relation
    ) extends Relation (left.schema) with BinaryRelationOperator{
      require( left.schema == right.schema, left.schema.toString +" == "+right.schema.toString )
    }

    case class Distinct(
      relation : Relation
    ) extends Relation( relation.schema ) with UnaryRelationOperator

    case class Attach(
      value : Any,
      as : String,
      relation : Relation
    ) extends Relation( as :: relation.schema ) with UnaryRelationOperator{
      require( !relation.schema.contains(as) )
    }

    case class RowRank(
      as : String,
      orderBy : List[String],
      relation : Relation
    ) extends Relation( as :: relation.schema ) with UnaryRelationOperator{
      require( !relation.schema.contains(as) )
    }

    case class RowNumber(
      as : String,
      orderBy : List[String],
      relation : Relation,
      partintionBy : Option[List[String]] = None
    ) extends Relation( as :: relation.schema ) with UnaryRelationOperator{
      require( !relation.schema.contains(as), "!" + relation.schema.toString + " contains " + as )
    }

    case class Operator(
      symbol : String,
      left : Expression,
      right : Expression
    ) extends Expression

    case class OperatorApplication( // this thing seems so verbose (see trans rules). Can't we realize this smarter?
      as : String,
      symbol : String,
      left : String,
      right : String,
      relation : Relation
    ) extends Relation( relation.schema :+ as ) with UnaryRelationOperator

    case class Variable(
      name : String
    ) extends Expression

    case class Aggregation(
      operator : String,
      aggregate : String,
      as_ : String,
      select : List[String],
      groupBy : List[String],
      relation : Relation
    ) extends Relation( as_ :: select ) with UnaryRelationOperator

    case class Table(
      schema_ : List[String],
      name_ : String,
      keys     : List[List[String]]
    ) extends Relation(schema_,Some(schema_),name_)

    case class LiteralTable[T](
      data : Iterable[T],
      schema_ : List[String]
    ) extends Relation(schema_)


 }
}