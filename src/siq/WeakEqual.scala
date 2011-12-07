package siq

trait IWeakEqual extends IModuleBase with OverloadHack {
  def __equal[T,S](a: Rep[T], b: Rep[S])
    (implicit ev: T => ValidType, ev2: T => Rep[T], ev3: S => ValidType, ev4: S => Rep[S], o: Overloaded1)
    : Rep[Boolean]
  def __equal[T,S](a:T, b: Rep[S])
    (implicit ev: T => ValidType, ev2: T => Rep[T], ev3: S => ValidType, ev4: S => Rep[S], o: Overloaded2)
    : Rep[Boolean]
  def __equal[T,S](a:Rep[T], b: S)
    (implicit ev: T => ValidType, ev2: T => Rep[T], ev3: S => ValidType, ev4: S => Rep[S], o: Overloaded3)
    : Rep[Boolean]
}

trait WeakEqual  extends ModuleBase with IWeakEqual {
  case class `==(Any,Any)`(x: Exp[Any], y: Exp[Any]) extends Node[Boolean]( "==" )
  def __equal[T,S](a: Rep[T], b: Rep[S])
    (implicit ev: T => ValidType, ev2: T => Rep[T], ev3: S => ValidType, ev4: S => Rep[S], o: Overloaded1)
    : Rep[Boolean] = `==(Any,Any)`(a,b)
  def __equal[T,S](a:T, b: Rep[S])
    (implicit ev: T => ValidType, ev2: T => Rep[T], ev3: S => ValidType, ev4: S => Rep[S], o: Overloaded2)
    : Rep[Boolean] = `==(Any,Any)`(a,b)
  def __equal[T,S](a:Rep[T], b: S)
    (implicit ev: T => ValidType, ev2: T => Rep[T], ev3: S => ValidType, ev4: S => Rep[S], o: Overloaded3)
    : Rep[Boolean] = `==(Any,Any)`(a,b)

  case class Not( r:Exp[Boolean] ) extends Def[Boolean]
}
