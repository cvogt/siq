/* this file has been auto-generated */

package siq

trait IStringOps extends IModuleBase{
  def infix_<( x: Rep[String], y: Rep[String] )(implicit module_num: Overloaded2): Rep[Boolean]
  def infix_>( x: Rep[String], y: Rep[String] )(implicit module_num: Overloaded2): Rep[Boolean]
  def infix_<=( x: Rep[String], y: Rep[String] )(implicit module_num: Overloaded2): Rep[Boolean]
  def infix_>=( x: Rep[String], y: Rep[String] )(implicit module_num: Overloaded2): Rep[Boolean]
  def infix_+( x: Rep[String], y: Rep[AnyVal] )(implicit module_num: Overloaded2, overload: Overloaded5): Rep[String]
  def infix_+( x: Rep[AnyVal], y: Rep[String] )(implicit module_num: Overloaded2, overload: Overloaded6): Rep[String]
  def infix_+( x: Rep[String], y: Rep[String] )(implicit module_num: Overloaded2, overload: Overloaded7): Rep[String]
}
trait StringOps extends ModuleBase with IStringOps{

  case class `<(String,String)` ( x: Exp[String], y: Exp[String] ) extends Node[Boolean]( "<" )
  case class `>(String,String)` ( x: Exp[String], y: Exp[String] ) extends Node[Boolean]( ">" )
  case class `<=(String,String)`( x: Exp[String], y: Exp[String] ) extends Node[Boolean]( "<=" )
  case class `>=(String,String)`( x: Exp[String], y: Exp[String] ) extends Node[Boolean]( ">=" )
  case class `+(String,AnyVal)` ( x: Exp[String], y: Exp[AnyVal] ) extends Node[String]( "+" )
  case class `+(AnyVal,String)` ( x: Exp[AnyVal], y: Exp[String] ) extends Node[String]( "+" )
  case class `+(String,String)` ( x: Exp[String], y: Exp[String] ) extends Node[String]( "+" )

  def infix_<( x: Exp[String], y: Exp[String] )(implicit module_num: Overloaded2) = ( `<(String,String)` (x,y) ) // apply transform() here
  def infix_>( x: Exp[String], y: Exp[String] )(implicit module_num: Overloaded2) = ( `>(String,String)` (x,y) ) // apply transform() here
  def infix_<=( x: Exp[String], y: Exp[String] )(implicit module_num: Overloaded2) = ( `<=(String,String)`(x,y) ) // apply transform() here
  def infix_>=( x: Exp[String], y: Exp[String] )(implicit module_num: Overloaded2) = ( `>=(String,String)`(x,y) ) // apply transform() here
  def infix_+( x: Exp[String], y: Exp[AnyVal] )(implicit module_num: Overloaded2, overload: Overloaded5) = ( `+(String,AnyVal)` (x,y) ) // apply transform() here
  def infix_+( x: Exp[AnyVal], y: Exp[String] )(implicit module_num: Overloaded2, overload: Overloaded6) = ( `+(AnyVal,String)` (x,y) ) // apply transform() here
  def infix_+( x: Exp[String], y: Exp[String] )(implicit module_num: Overloaded2, overload: Overloaded7) = ( `+(String,String)` (x,y) ) // apply transform() here

  def StringIdentityMapper(args: TransformationArgs) = args.node match{
    case `<(String,String)` ( x, y ) => `<(String,String)` ( args.mapper(x), args.mapper(y) )
    case `>(String,String)` ( x, y ) => `>(String,String)` ( args.mapper(x), args.mapper(y) )
    case `<=(String,String)`( x, y ) => `<=(String,String)`( args.mapper(x), args.mapper(y) )
    case `>=(String,String)`( x, y ) => `>=(String,String)`( args.mapper(x), args.mapper(y) )
    case `+(String,AnyVal)` ( x, y ) => `+(String,AnyVal)` ( args.mapper(x), args.mapper(y) )
    case `+(AnyVal,String)` ( x, y ) => `+(AnyVal,String)` ( args.mapper(x), args.mapper(y) )
    case `+(String,String)` ( x, y ) => `+(String,String)` ( args.mapper(x), args.mapper(y) )
    case _ => throw new NoMappingException()
  }
  addIdentityMappings( StringIdentityMapper _ )
}
