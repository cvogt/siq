package siq.lms

trait Base extends EmbeddedControls {
  type Rep[+T]
//  def unit[T](x: T): Rep[T]
}

trait BaseExp extends Base with Expressions {
  type Rep[+T] = Exp[T]
  def unit[T](x: T) = Const(x)
}

trait Expressions {

  abstract class Exp[+T] // constants/symbols (atomic)

  case class Const[T](x: T) extends Exp[T]

  case class Sym[T](val id: Int, val def_ : Any) extends Exp[T]{
    override def toString = this match { case Def(d) => d.toString }
  }

  var nVars = 0
  def fresh[T](deff: Any) = Sym[T]({ nVars += 1; nVars -1 }, deff)
  trait Def[+T] // operations (composite)

  case class TP[T](sym: Sym[T], rhs: Def[T]) 

  var globalDefs: List[TP[_]] = Nil

  def findDefinition[T](s: Sym[T]): Option[TP[T]] =
    globalDefs.find(_.sym == s).asInstanceOf[Option[TP[T]]]

  def findDefinition[T](d: Def[T]): Option[TP[T]] =
    globalDefs.find(_.rhs == d).asInstanceOf[Option[TP[T]]]

  def findOrCreateDefinition[T](d: Def[T]): TP[T] =
    findDefinition[T](d).getOrElse {
      createDefinition(fresh[T](d), d)
    }

  def createDefinition[T](s: Sym[T], d: Def[T]): TP[T] = {
    val f = TP(s, d)
    globalDefs = globalDefs:::List(f)
    f
  }

  implicit def toAtom[T](d: Def[T]): Exp[T] = {
    findOrCreateDefinition(d).sym
  }

  object Def {
    def unapply[T](e: Exp[T]): Option[Def[T]] = e match { // really need to test for sym?
      case s @ Sym(_,_) =>
        findDefinition(s).map(_.rhs)
      case _ =>
        None
    }
  }
/*
  // dependencies
  def syms(e: Any): List[Sym[Any]] = e match {
    case s: Sym[Any] => List(s)
    case p: Product => p.productIterator.toList.flatMap(syms(_))
    case _ => Nil
  }

  def dep(e: Exp[Any]): List[Sym[Any]] = e match {
    case Def(d: Product) => syms(d)
    case _ => Nil
  }
*/
}