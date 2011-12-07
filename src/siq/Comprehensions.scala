package siq

trait IComprehensions extends IModuleBase with ITuples { //FIXME: s/BaseExp/Base/
  // methods for iterables of any type
  implicit def rep2igenerator[T]( r: Rep[Iterable[T]] ) : IGenerator[T]
  trait IGenerator[+T]{
    def orderBy( orders : (Rep[T] => Order)* ) : Rep[Iterable[T]]
    def map[R]( f : Rep[T] => Rep[R] ) : Rep[Iterable[R]]
    def flatMap[R]( f : Rep[T] => Rep[Iterable[R]] ) : Rep[Iterable[R]]
    def withFilter( f : Rep[T] => Rep[Boolean] ) : Rep[Iterable[T]]
  }

  trait Order
  abstract class IOrderable{
    def asc : Order
    def desc : Order
  }
  implicit def order_enable[T <% ValidType]( r:Rep[T] ) : IOrderable
  implicit def defaultOrder[T <% ValidType]( r:Rep[T] ) : Order
  // future? implicit def defaultOrder[T <% Rep[Any]]( r:T ) : Order

  // transfer scala iterable into literal db table
//  def todb[T <% Rep[_ >: T]]( i:Iterable[T] ) : Rep[Iterable[T]]
  //implicit def liftIterableOfReps[T]( i:Iterable[Rep[T]] ) : Rep[Iterable[T]]
  implicit def liftIterable[T/* <% Rep[T]*/]( i:Iterable[T] ) : Rep[Iterable[T]]
  //implicit def liftOther[T,I <: Iterable[T]]( i:I ) : Rep[I] = liftIterable(i).asInstanceOf[Rep[I]]

  // base stuff for db schema
  trait SchemaBase extends Product

  // operations on comprehensions
  def infix_length( r:Rep[Iterable[_]] ) : Rep[Int]
  def infix_size( r:Rep[Iterable[_]] ) = infix_length(r)
  def infix_sum( r:Rep[Iterable[Int]] ) : Rep[Int]
  def infix_distinct( r:Rep[Iterable[Int]] )(implicit o:Overloaded1) : Rep[Iterable[Int]]
  def infix_distinct( r:Rep[Iterable[String]] )(implicit o:Overloaded2) : Rep[Iterable[String]]
  def infix_distinct( r:Rep[Iterable[Boolean]] )(implicit o:Overloaded3) : Rep[Iterable[Boolean]]
  def infix_one[T]( r:Rep[Iterable[T]] ) : Rep[T]
  def infix_flatten[T]( r:Rep[Iterable[Iterable[T]]] ) : Rep[Iterable[T]]
  //def infix_toString( r:Rep[_] ) : Rep[String]
}

trait Comprehensions extends IComprehensions with ModuleBase with Tuples{
  implicit def rep2igenerator[T]( r: Rep[Iterable[T]] ) = (rep2def(r) match {
    case _:FieldReference => rep2def(rep2def(r).asInstanceOf[FieldReference].referree.asInstanceOf[Rep[Iterable[T]]])
    case _ => rep2def(r)
  }).asInstanceOf[IGenerator[T]]
  protected var _query_counter = 0
  abstract class Generator[+T](
    val element_raw : Rep[T]
  ) extends Def[Iterable[T]] with IGenerator[T]{
    val element_references:Rep[T] = replace_with_references[T](element_raw,this)
    val key = {_query_counter = _query_counter + 1;_query_counter}.toString
    def orderBy( orders : (Rep[T] => Order)* ) = {
      new Comprehension[T](
        this
        , element_references
        , orderBy = orders.toList.map( _(element_references) )
      )
    }
    def map[S]( f : Rep[T] => Rep[S] ) = {
      new Comprehension[S](
        this
        , f( element_references )
      )
    }
    def flatMap[S]( f : Rep[T] => Rep[Iterable[S]] ) = {
      this.map( f ).flatten
    }
    def withFilter( f : Rep[T] => Rep[Boolean] ) = {
      new Comprehension[T](
        this
        , element_references
        , filter = Some(f(element_references))
      )
    }
  }
  case class Ascending(r:Rep[Any]) extends Order
  case class Descending(r:Rep[Any]) extends Order

  class Orderable( r:Rep[Any] ) extends IOrderable{
    def asc : Order = Ascending(r)
    def desc : Order = Descending(r)
  }
  implicit def defaultOrder[T <% ValidType]( r:Rep[T] ) : Order = Ascending(r:Rep[T])
  //future? implicit def defaultOrder[T <% Rep[Any]]( r:T ) : Order = Ascending(r:Rep[Any])
  implicit def order_enable[T <% ValidType]( r:Rep[T] ) : Orderable = new Orderable(r)

  // as convenience for internal use
  def rep2generator[T]( r: Rep[Iterable[T]] ) : Generator[T] = rep2igenerator(r).asInstanceOf[Generator[T]]

  // Node to represent a comprehensions
  case class Comprehension[R] (
    var inner : Rep[Iterable[_]],
    val element_ : Rep[R],
    val filter : Option[Rep[Boolean]] = None,
    val orderBy : List[Order] = List(),
    val groupBy : Option[Rep[_]] = None
  ) extends Generator[R](element_)


  //implicit def liftIterableOfReps[T](i:Iterable[Rep[T]]) =
  implicit def liftIterable[T/* <% Rep[T]*/]( i:Iterable[T] ) = toAtom(LiteralTable[T](
    i
  )) // FIXME: restrict to only list of values and list of tuples of values with viewbounds
//  case class Reference[T]( generator:Generator[_] ) extends Def[T]
  case class LiteralTable[T/* <% Rep[T]*/]( i: Iterable[T] ) extends Generator[T]({
    // FIXME: this is very VERY hacky
    val values = i.toList
    if(values.size > 0 && values(0).isInstanceOf[Product])
      toAtom(
        new LiftedTuple(new Product{
          val list = values(0).asInstanceOf[Product].productIterator.map(x => toAtom(new Def[T]{})).toList
          def productElement(n: Int) = list(n)
          def productArity = list.size
          def canEqual( that:Any ) = false
        })
      )
    else new Def[T]{}
  }){
    val values = i.toList
    def unapply( a:Any ) = Some(Tuple1(values))
  }

  // base stuff for db schema
  abstract class Table[+T <: Product](
   val name   : String,
   val element_ : Rep[T]
  ) extends Generator[T](
    element_
  )/* with Table[T]*/{
    val columns : Array[Column[_]]
    val keys : Array[Column[_]]
    override def toString = "Table(%s)".format(name)
  }
  case class Column[T](
    name : String = null,
    type_ : String = null
  ) extends Def[T]
  case class LiftedSchema[ T<:SchemaBase, P<:Product ]( schema:T ) extends LiftedTuple[P](schema)

  // base stuff for tuple arity dependent operations (in trait Tuples)
  trait Zip{
    val target:Rep[Any]
  }
  case class Zipped[T](
    field : Rep[Iterable[T]]
  ) extends Def[T]
  case class Grouped[T]( // FIXME: get rid of the column attr
    column : Rep[T]
  ) extends Generator[T]( column )

  // base stuff for Tuples.replace_with_references
  class Counter( var count : Int )
  case class FieldReference(
      iterable : Rep[Iterable[_]],
      position : Int,
      referree : Rep[_]
    ) extends Def[Any]

  class GeneratorReference(
     element__ : Rep[Iterable[_]],
     val fieldref : Rep[Iterable[_]]
  ) extends Comprehension[Any] (
    null,
    rep2generator[Any](element__).element_references
  )

  case class Length( iterable:Rep[Iterable[_]] ) extends Def[Int]
  def infix_length( r:Rep[Iterable[_]] ) = Length(r)
  case class Sum( iterable:Rep[Iterable[Int]] ) extends Def[Int]
  def infix_sum( r:Rep[Iterable[Int]] ) = Sum(r)
  case class Distinct[T]( iterable:Rep[Iterable[T]] ) extends Generator[T](
    rep2generator(iterable).element_raw
  )
  def infix_distinct( r:Rep[Iterable[Int]] )(implicit o:Overloaded1) = Distinct(r)
  def infix_distinct( r:Rep[Iterable[String]] )(implicit o:Overloaded2) = Distinct(r)
  def infix_distinct( r:Rep[Iterable[Boolean]] )(implicit o:Overloaded3) = Distinct(r)
  case class One[T]( iterable:Rep[Iterable[T]] ) extends Def[T]
  def infix_one[T]( r:Rep[Iterable[T]] ) = One[T](r)
  case class Flatten[T]( iterable:Rep[Iterable[Iterable[T]]] ) extends Generator[T](
    rep2generator(rep2generator(iterable).element_raw).element_raw
  )
  def infix_flatten[T]( r:Rep[Iterable[Iterable[T]]] ) = Flatten[T](r)
  //case class ToString( r:Rep[_] ) extends Def[String]
  //def infix_toString ( r:Rep[_] ) : Rep[String] = ToString( r )
}
