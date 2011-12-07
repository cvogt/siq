package siq

case class Operator(
  operator : String,
  lhs : String,
  rhs : String,
  return_ : String
){
  def nodeClass = "`%s(%s,%s)`".format( operator, lhs, rhs )
}
case class Module(
  name : String,
  val operators : List[Operator]
)

object DslSpec{
  def str2ops( default_lhs : String, default_rhs : String = "", default_return : String = "", ops:List[String] = List[String]() ) = ops.map( s => Operator(s,default_lhs,if(default_rhs != "")default_rhs else default_lhs,if(default_return != "")default_return else default_lhs) )
  val modules = List(
    Module( "Arith",
      str2ops("Int", ops=(List("+", "-", "*", "/", "%"))):::
        List(
          Operator( "<", "Int", "Int", "Boolean" ),
          Operator( ">", "Int", "Int", "Boolean" )
          ,Operator( "<=", "Int", "Int", "Boolean" ),
          Operator( ">=", "Int", "Int", "Boolean" )
        )
    ),
/*    Module( "Iterable", List(
      Operator( "contains", "Iterable[_]", "Any", "Boolean" )
    )),*/
    Module( "Boolean",
      str2ops("Boolean", ops=List("&&", "||"))
    ),
    Module( "String", List(
      Operator( "<", "String", "String", "Boolean" ),
      Operator( ">", "String", "String", "Boolean" ),
      Operator( "<=", "String", "String", "Boolean" ),
      Operator( ">=", "String", "String", "Boolean" ),
      Operator( "+", "String", "AnyVal", "String" ),
      Operator( "+", "AnyVal", "String", "String" ),
      Operator( "+", "String", "String", "String" )
    ))
  )
}

//"not" (unary), "*", "/", "+", "-" , "%", "contains", "==", "!=", "<=", "<", ">=", ">", "and", "or" */
