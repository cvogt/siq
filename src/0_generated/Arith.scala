/* this file has been auto-generated */

package siq

trait IArithOps extends IModuleBase{
  def infix_+( x: Rep[Int], y: Rep[Int] )(implicit module_num: Overloaded0): Rep[Int]
  def infix_-( x: Rep[Int], y: Rep[Int] )(implicit module_num: Overloaded0): Rep[Int]
  def infix_*( x: Rep[Int], y: Rep[Int] )(implicit module_num: Overloaded0): Rep[Int]
  def infix_/( x: Rep[Int], y: Rep[Int] )(implicit module_num: Overloaded0): Rep[Int]
  def infix_%( x: Rep[Int], y: Rep[Int] )(implicit module_num: Overloaded0): Rep[Int]
  def infix_<( x: Rep[Int], y: Rep[Int] )(implicit module_num: Overloaded0): Rep[Boolean]
  def infix_>( x: Rep[Int], y: Rep[Int] )(implicit module_num: Overloaded0): Rep[Boolean]
  def infix_<=( x: Rep[Int], y: Rep[Int] )(implicit module_num: Overloaded0): Rep[Boolean]
  def infix_>=( x: Rep[Int], y: Rep[Int] )(implicit module_num: Overloaded0): Rep[Boolean]
}
trait ArithOps extends ModuleBase with IArithOps{

  case class `+(Int,Int)` ( x: Exp[Int], y: Exp[Int] ) extends Node[Int]( "+" )
  case class `-(Int,Int)` ( x: Exp[Int], y: Exp[Int] ) extends Node[Int]( "-" )
  case class `*(Int,Int)` ( x: Exp[Int], y: Exp[Int] ) extends Node[Int]( "*" )
  case class `/(Int,Int)` ( x: Exp[Int], y: Exp[Int] ) extends Node[Int]( "/" )
  case class `%(Int,Int)` ( x: Exp[Int], y: Exp[Int] ) extends Node[Int]( "%" )
  case class `<(Int,Int)` ( x: Exp[Int], y: Exp[Int] ) extends Node[Boolean]( "<" )
  case class `>(Int,Int)` ( x: Exp[Int], y: Exp[Int] ) extends Node[Boolean]( ">" )
  case class `<=(Int,Int)`( x: Exp[Int], y: Exp[Int] ) extends Node[Boolean]( "<=" )
  case class `>=(Int,Int)`( x: Exp[Int], y: Exp[Int] ) extends Node[Boolean]( ">=" )

  def infix_+( x: Exp[Int], y: Exp[Int] )(implicit module_num: Overloaded0) = ( `+(Int,Int)` (x,y) ) // apply transform() here
  def infix_-( x: Exp[Int], y: Exp[Int] )(implicit module_num: Overloaded0) = ( `-(Int,Int)` (x,y) ) // apply transform() here
  def infix_*( x: Exp[Int], y: Exp[Int] )(implicit module_num: Overloaded0) = ( `*(Int,Int)` (x,y) ) // apply transform() here
  def infix_/( x: Exp[Int], y: Exp[Int] )(implicit module_num: Overloaded0) = ( `/(Int,Int)` (x,y) ) // apply transform() here
  def infix_%( x: Exp[Int], y: Exp[Int] )(implicit module_num: Overloaded0) = ( `%(Int,Int)` (x,y) ) // apply transform() here
  def infix_<( x: Exp[Int], y: Exp[Int] )(implicit module_num: Overloaded0) = ( `<(Int,Int)` (x,y) ) // apply transform() here
  def infix_>( x: Exp[Int], y: Exp[Int] )(implicit module_num: Overloaded0) = ( `>(Int,Int)` (x,y) ) // apply transform() here
  def infix_<=( x: Exp[Int], y: Exp[Int] )(implicit module_num: Overloaded0) = ( `<=(Int,Int)`(x,y) ) // apply transform() here
  def infix_>=( x: Exp[Int], y: Exp[Int] )(implicit module_num: Overloaded0) = ( `>=(Int,Int)`(x,y) ) // apply transform() here

  def ArithIdentityMapper(args: TransformationArgs) = args.node match{
    case `+(Int,Int)` ( x, y ) => `+(Int,Int)` ( args.mapper(x), args.mapper(y) )
    case `-(Int,Int)` ( x, y ) => `-(Int,Int)` ( args.mapper(x), args.mapper(y) )
    case `*(Int,Int)` ( x, y ) => `*(Int,Int)` ( args.mapper(x), args.mapper(y) )
    case `/(Int,Int)` ( x, y ) => `/(Int,Int)` ( args.mapper(x), args.mapper(y) )
    case `%(Int,Int)` ( x, y ) => `%(Int,Int)` ( args.mapper(x), args.mapper(y) )
    case `<(Int,Int)` ( x, y ) => `<(Int,Int)` ( args.mapper(x), args.mapper(y) )
    case `>(Int,Int)` ( x, y ) => `>(Int,Int)` ( args.mapper(x), args.mapper(y) )
    case `<=(Int,Int)`( x, y ) => `<=(Int,Int)`( args.mapper(x), args.mapper(y) )
    case `>=(Int,Int)`( x, y ) => `>=(Int,Int)`( args.mapper(x), args.mapper(y) )
    case _ => throw new NoMappingException()
  }
  addIdentityMappings( ArithIdentityMapper _ )
}
