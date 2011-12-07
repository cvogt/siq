/* this file has been auto-generated */

package siq

trait IBooleanOps extends IModuleBase{
  def infix_&&( x: Rep[Boolean], y: Rep[Boolean] )(implicit module_num: Overloaded1): Rep[Boolean]
  def infix_||( x: Rep[Boolean], y: Rep[Boolean] )(implicit module_num: Overloaded1): Rep[Boolean]
}
trait BooleanOps extends ModuleBase with IBooleanOps{

  case class `&&(Boolean,Boolean)`( x: Exp[Boolean], y: Exp[Boolean] ) extends Node[Boolean]( "&&" )
  case class `||(Boolean,Boolean)`( x: Exp[Boolean], y: Exp[Boolean] ) extends Node[Boolean]( "||" )

  def infix_&&( x: Exp[Boolean], y: Exp[Boolean] )(implicit module_num: Overloaded1) = ( `&&(Boolean,Boolean)`(x,y) ) // apply transform() here
  def infix_||( x: Exp[Boolean], y: Exp[Boolean] )(implicit module_num: Overloaded1) = ( `||(Boolean,Boolean)`(x,y) ) // apply transform() here

  def BooleanIdentityMapper(args: TransformationArgs) = args.node match{
    case `&&(Boolean,Boolean)`( x, y ) => `&&(Boolean,Boolean)`( args.mapper(x), args.mapper(y) )
    case `||(Boolean,Boolean)`( x, y ) => `||(Boolean,Boolean)`( args.mapper(x), args.mapper(y) )
    case _ => throw new NoMappingException()
  }
  addIdentityMappings( BooleanIdentityMapper _ )
}
