package siq

trait IStrongEqual extends IModuleBase with OverloadHack {
  def __equal[T <% ValidType](a: Rep[T], b: Rep[T]): Rep[Boolean]
  def __equal[T](a:T, b: Rep[T])(implicit ev: T => ValidType, ev2: T => Rep[T], o: Overloaded1) : Rep[Boolean]
  def __equal[T](a:Rep[T], b: T)(implicit ev: T => ValidType, ev2: T => Rep[T], o: Overloaded2) : Rep[Boolean]
}

trait StrongEqual  extends ModuleBase with IStrongEqual {
  case class `==(Any,Any)`(x: Exp[Any], y: Exp[Any]) extends Node[Boolean]( "==" )
  def __equal[T <% ValidType](a: Exp[T], b: Exp[T]): Exp[Boolean] = `==(Any,Any)`(a,b)
  def __equal[T](a:T, b: Rep[T])(implicit ev: T => ValidType, ev2: T => Rep[T], o: Overloaded1) : Rep[Boolean] = `==(Any,Any)`(a,b)
  def __equal[T](a:Rep[T], b: T)(implicit ev: T => ValidType, ev2: T => Rep[T], o: Overloaded2) : Rep[Boolean] = `==(Any,Any)`(a,b)
}
