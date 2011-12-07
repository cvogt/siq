package siq
import lms._

trait IModuleBase extends Base with OverloadHack{
  def print_manifest[T](v:T)( implicit m:Manifest[T] ){ println(m) }
  def get_manifest[T](v:T)( implicit m:Manifest[T] ) = m

  // valid types type class
  abstract class ValidType
  implicit def validInt( v:Int ) : ValidType = null
  implicit def validString( v:String ) : ValidType = null
  implicit def validBoolean( v:Boolean ) : ValidType = null

  def infix_todb( v:Boolean ) : Rep[Boolean]
  def infix_todb[ T <% ValidType ]( v:T ) : Rep[T]
//  def Rep( b:Boolean ) : Rep[Boolean]

  trait Implicits{
    //implicit def unitAnyVal[T <: AnyVal]( v: T ) : Rep[T]
    implicit def unitInt( v: Int ) : Rep[Int]
    implicit def unitString( v: String ) : Rep[String]
  }
  val implicits : Implicits
}

trait ModuleBase extends IModuleBase with BaseExp{
  def rep2def[T]( r:Rep[T] ) : Def[T] = {
    val Def(d) = r
    d
    //val Some(TP(_,e)) = findDefinition( r.asInstanceOf[Sym[T]] )
    //e
    //r.asInstanceOf[Sym[T]].deff.asInstanceOf[Def[T]]
  }

  abstract class Node[T]( val operator : String )(implicit m:Manifest[T]) extends Def[T]{
    val x:Exp[Any]
    val y:Exp[Any]
    val manifest : Manifest[T] = m
  }
//  def Rep( b:Boolean ) : Rep[Boolean] = Const(b)
  def infix_todb[ T <% ValidType ]( v:T ) : Rep[T] = Const(v)
  def infix_todb( v:Boolean ) : Rep[Boolean] = Const(v)
  val implicits = new Implicits{
//    implicit def unitAnyVal[T <: AnyVal]( v: T ) = unit(v)
    implicit def unitInt( v: Int ) = Const(v)
    implicit def unitString( v: String ) = Const(v)
  }
  class NoMappingException extends Exception
  type Transformation = TransformationArgs => Def[_]
  private var identity_node_mappings = List[Transformation]()
  def addIdentityMappings[T]( m : Transformation ){
    identity_node_mappings = identity_node_mappings ++ List[Transformation](m) // FIXME
  }

  case class TransformationArgs(
    node : Def[_],
    id : Int,
    _mapper_lambda : Exp[_] => Exp[_]
  ){
    def mapper[T]( e:Exp[T] ) = _mapper_lambda(e).asInstanceOf[Exp[T]]
  }

  private var transformations = List[Transformation]()
  def addTransformations[T]( mappings : Transformation ){
    transformations = transformations :+ mappings
  }
  
  type DefStringMapping = DefGeneratorArgs => String
  private var def_string_mappings = Map[String, List[DefStringMapping] ]()
  def addDefStringMappings[T]( target: String, mappings : DefStringMapping ){
    if( !def_string_mappings.contains(target) ){
      def_string_mappings = def_string_mappings.updated( target, List[DefStringMapping]() )
    }
    def_string_mappings = def_string_mappings.updated( target, (def_string_mappings(target) :+ mappings) )
  }

  type ConstStringMapping = Any => String
  private var const_string_mappings = Map[String, List[ConstStringMapping] ]()
  def addConstStringMappings[T]( target: String, mappings : ConstStringMapping ){
    if( !const_string_mappings.contains(target) ){
      const_string_mappings = const_string_mappings.updated( target, List[ConstStringMapping]() )
    }
    const_string_mappings = const_string_mappings.updated( target, (const_string_mappings(target) :+ mappings) )
  }

  private def sym2def[T]( s:Sym[T] ) : Def[T] = findDefinition(s) match{
    case Some(TP(_,x)) => x
    case _ => throw new Exception()
  }
  def no_mapping() = throw new NoMappingException()
  // FIXME: refactor Sym,Const pattern matching from the following two functions into one helper function
  def transform[T]( r: Exp[T]/*, node_mapper:(Def[_],Exp[_] => Exp[_]) = no_mapping()*/ ) : Exp[T] = {
    def transform_closure(depth: Int = 0)( r: Exp[_] ) : Exp[_] = {
      if(depth > 100){
        throw new Exception("siq-error: nesting too deep")
      }
      r match {
        case s@Sym(id,_)   => {
          for( node_mapper <- transformations ){
            try{
              return toAtom(node_mapper( TransformationArgs(sym2def(s), s.id, transform_closure(depth+1)) )) // FIXME: why is toAtom needed here?
            }catch{
              case e: NoMappingException => () // or should use MatchError here? this could mask errors
              case e@_ => throw e
            }
          }
          for( identity <- identity_node_mappings ){
            try{
              return toAtom(identity( TransformationArgs(sym2def(s), s.id, transform_closure(depth+1)) ))
            }catch{
              case e: NoMappingException => () // or should use MatchError here? this could mask errors
              case e@_ => throw e
            }
          }
          throw new Exception("identity mapping not found for node: "+sym2def(s).toString+" (this should never happen)")
        }
        case Const(x)  => Const(x)
        case _ => throw new Exception("not a symbol or const")
      }
    }
    transform_closure(0)( r ).asInstanceOf[Exp[T]] // <- this leads to a runtime exception when a transformation has different return type than parameter type (which should never be the case)
  }
  case class DefGeneratorArgs(
    node : Def[_],
    mapper : Exp[_] => String,
    depth : Int
  ){
    def render_function( name:String ) = node match{
      case p:Product => name+"( " + mapper(p.productElement(0).asInstanceOf[Exp[_]]) + "," + mapper(p.productElement(1).asInstanceOf[Exp[_]]) + " )"
      case _ => throw new Exception("cannot render function")
    }
    def render_operator( name:String ) = node match{
      case p:Product => "( " + mapper(p.productElement(0).asInstanceOf[Exp[_]]) + " "+name+" " + mapper(p.productElement(1).asInstanceOf[Exp[_]]) + " )"
      case _ => throw new Exception("cannot render operator")
    }
    //def render_operator() : String = render_operator( node match { case n:Node[_,_,_] => n.operator; case _ => throw new Exception("no default") })
  }
  case class ConstGeneratorArgs(
    const : Any,
    mapper : Exp[_] => String,
    depth : Int
  )

  def render( target:String, r: Exp[_], const_mapper: ConstGeneratorArgs => String ) : String = {
    def transform_closure( depth: Int = 0 )( r: Exp[_] ) : String = {
      val returnme = r match {
        case s@Sym(id,_)   => {
          for( node_mapper <- def_string_mappings(target) ){
            try{
              return node_mapper( DefGeneratorArgs(sym2def(s), transform_closure(depth+1), depth) )
            }catch{
              case e: NoMappingException => () // or should use MatchError here? this could mask errors
              case e@_ => throw e
            }
          }
          throw new Exception("no rendering rule for node: "+sym2def(s).toString+" (please add one in your generator)")
        }
        case c@Const(_)  => const_mapper(ConstGeneratorArgs(c.x,transform_closure(depth+1), depth))
        case _ => throw new Exception("not a symbol or const: "+r.toString)
      }
      returnme
    }
    transform_closure(0)(r)
  }
}
