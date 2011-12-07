package siq
trait FerryCore{
  /**
   * The Ferry Core AST including type and implementation type inference
   * the inference is however simplified to not distinguish atomic types
   * as this is already handled by SIQ in the upper layer
   */
  object ferry{
    object FerryCoreTypes{
      abstract class FerryCoreType
      object atomic extends FerryCoreType{
        override def toString = "atomic"
      }
      object variable extends FerryCoreType{
        override def toString = "variable"
      }
      case class list ( element: FerryCoreType ) extends FerryCoreType
      case class tuple( elements: List[FerryCoreType] ) extends FerryCoreType
    }
    object ImplementationTypes extends Enumeration{
      type ImplementationType = Value
      val ROW, TABLE, ROW_TABLE = Value
    }
    import FerryCoreTypes._
    import ImplementationTypes._

    abstract class Expression(
      val type_ : FerryCoreType,
      val implementation_type : ImplementationType
    ){
      val both_types = (type_,implementation_type)
      val getExpressionName = getClass.toString.reverse.takeWhile(_!='$').reverse
      override def equals(other: Any) = other match {
        case a:AnyRef => this eq a
        case _ => false
      }
    }

    case class Box( boxee:Expression ) extends Expression( boxee.type_, ROW )
    case class Unbox( unboxee:Expression ) extends Expression( unboxee.type_, TABLE )

    case class Literal[T]( value : T ) extends Expression( atomic, ROW )

    case class OperatorApplication(
      operator : String,
      lhs : Expression,
      rhs : Expression
    ) extends Expression ( atomic, ROW )
/*
      // needed to distinguish atomic types
      operator match {
        case "and" | "or" => bool
        case "+" | "-" | "*" | "/" => int
        case "==" | "!=" => bool
        case "<" | ">" | "<=" | ">=" => bool
        case _ => throw new Exception("unknown operator "+operator)
      }
*/

    case class FerryTuple(
      values : List[Expression]
    ) extends Expression( tuple(values.map(_.type_)), ROW )
//    ) extends Expression( tuple(values.map(_.type_)), ROW )

    case class FerryList[T]( ///  <: Expression
      values : List[T], // FerryCore lists have only one or zero elements. Really, no kiddin.
      element_type : FerryCoreType = atomic
    ) extends Expression( if(values.size > 0) list(element_type) else list(variable), TABLE )
//    ) extends Expression( if(items.isDefined) items.get.type_ else variable, TABLE )

    case class TableReference(
      name     : String,
      columns  : List[(String,String)],
      keys     : List[List[String]],
      order    : List[String]
    ) extends Expression( list(tuple( 1 to columns.size map (x=>atomic) toList )), TABLE )

    case class PositionalAccess(
      tuple : Expression,
      position: Int
    ) extends Expression( tuple.type_.asInstanceOf[tuple].elements(position-1), ROW )

    case class Let(
      variable : String,
      value : Expression
    ) extends Expression( value.type_, value.implementation_type )

    case class VariableAccess(
      name : String,
      type__ : FerryCoreType,
      implementation_type_ : ImplementationType
    ) extends Expression( type__, implementation_type_ )

    case class If(
      predicate : Expression,
      then_ : Expression,
      else_ : Option[Expression] = None
    ) extends Expression( then_.type_ , then_.implementation_type )

    case class For(
      variable : String,
      in : Expression,
      returned: Expression,
      orderBy : List[(Expression,String)] = List()
    ) extends Expression( list(returned.type_), TABLE )

    type BuiltInFunction = Expression

    case class Append(
      left : Expression,
      right : Expression
    ) extends BuiltInFunction( if(left.type_.asInstanceOf[list].element != variable) left.type_ else right.type_, TABLE )

    case class Concat(
      lists : Expression
    ) extends BuiltInFunction(lists.type_.asInstanceOf[list].element, TABLE )

    case class Take(
      n : Int,
      list : Expression
    ) extends BuiltInFunction( list.type_, TABLE )

    case class Drop(
      n : Int,
      list : Expression
    ) extends BuiltInFunction( list.type_, TABLE )

    case class Nth(
      n : Int,
      list : Expression
    ) extends BuiltInFunction( list.type_.asInstanceOf[list].element, ROW )

    case class Unordered(
      list : Expression
    ) extends BuiltInFunction( list.type_, TABLE )

    case class Distinct(
      list : Expression
    ) extends BuiltInFunction( list.type_, TABLE )

    case class Length(
      list : Expression
    ) extends BuiltInFunction( atomic, ROW )

    case class Sum(
      list : Expression
    ) extends BuiltInFunction( atomic, ROW )

    case class Min(
      list : Expression
    ) extends BuiltInFunction( atomic, ROW )

    case class Max(
      list : Expression
    ) extends BuiltInFunction( atomic, ROW )

    case class The(
      list : Expression
    ) extends BuiltInFunction( list.type_.asInstanceOf[list].element, ROW )

// TODO: add groupWtih
/*
    case class GroupWith(
      ,
      list : Expression
    ) extends BuiltInFunction( list.type_.asInstanceOf[list].element, TABLE )
*/

  }
}