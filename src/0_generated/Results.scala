/* this file has been auto-generated */

package siq

trait IResults extends IModuleBase with OverloadHack{
  case class Result[T]( value:Any )
  implicit def extract[A]( r:Result[A] )( implicit m: Manifest[A] ) : A
}
trait Results extends IResults{
  private val _tupleRegex  = new scala.util.matching.Regex("^(scala.Tuple[0-9]*\\[.*\\])$")
  private val _schemaRegex = new scala.util.matching.Regex("^([^\\[]*siq\\.ISchema\\$[^\\]]*)$")
  private def isTuple( m:Manifest[_] ) = m.toString match { case _tupleRegex(_) => true; case _ => false }
  private def isSchema( m:Manifest[_] ) = m.toString match { case _schemaRegex(_) => true; case _ => false }
  def createModelInstance( m:Manifest[_], values:scala.collection.mutable.Stack[Any] ) : AnyRef
  //def getSchemaManifest( name:String ) : Manifest[_]
  /**
   * flattens stack for upcoming tuples
   */
  private def _stackified( x:Any )(m:Manifest[_]) = scala.collection.mutable.Stack(
      (if( isSchema(m) || isTuple(m) ) x.asInstanceOf[List[_]] else List(x))
      : _*
  )

    def getValue( values:scala.collection.mutable.Stack[Any] )( implicit manifest:Manifest[_] ) : Any = {
    /*val parsed_value = */(manifest.toString match {
      case "java.lang.String" => values.pop.toString
      case "Int"    => values.pop.toString.toDouble.toInt
      case "Double" => values.pop.toString.toDouble
      case _ => {
        if( isTuple(manifest) ){
          //      val v = value.asInstanceOf[List[Any]]
          val mt = manifest.typeArguments.asInstanceOf[List[Manifest[_]]]
          mt.size match {
            case 1 => Tuple1( getValue(values)(mt(0)) )
            case 2 => Tuple2( getValue(values)(mt(0)), getValue(values)(mt(1)) )
            case 3 => Tuple3( getValue(values)(mt(0)), getValue(values)(mt(1)), getValue(values)(mt(2)) )
            case 4 => Tuple4( getValue(values)(mt(0)), getValue(values)(mt(1)), getValue(values)(mt(2)), getValue(values)(mt(3)) )
            case 5 => Tuple5( getValue(values)(mt(0)), getValue(values)(mt(1)), getValue(values)(mt(2)), getValue(values)(mt(3)), getValue(values)(mt(4)) )
            case 6 => Tuple6( getValue(values)(mt(0)), getValue(values)(mt(1)), getValue(values)(mt(2)), getValue(values)(mt(3)), getValue(values)(mt(4)), getValue(values)(mt(5)) )
            case 7 => Tuple7( getValue(values)(mt(0)), getValue(values)(mt(1)), getValue(values)(mt(2)), getValue(values)(mt(3)), getValue(values)(mt(4)), getValue(values)(mt(5)), getValue(values)(mt(6)) )
            case 8 => Tuple8( getValue(values)(mt(0)), getValue(values)(mt(1)), getValue(values)(mt(2)), getValue(values)(mt(3)), getValue(values)(mt(4)), getValue(values)(mt(5)), getValue(values)(mt(6)), getValue(values)(mt(7)) )
            case 9 => Tuple9( getValue(values)(mt(0)), getValue(values)(mt(1)), getValue(values)(mt(2)), getValue(values)(mt(3)), getValue(values)(mt(4)), getValue(values)(mt(5)), getValue(values)(mt(6)), getValue(values)(mt(7)), getValue(values)(mt(8)) )
            case 10 => Tuple10( getValue(values)(mt(0)), getValue(values)(mt(1)), getValue(values)(mt(2)), getValue(values)(mt(3)), getValue(values)(mt(4)), getValue(values)(mt(5)), getValue(values)(mt(6)), getValue(values)(mt(7)), getValue(values)(mt(8)), getValue(values)(mt(9)) )
          }
        } else if( manifest.toString.startsWith("scala.collection.Iterable") ){
          values.pop.asInstanceOf[List[_]].map( x => {
            val nestedType = manifest.typeArguments(0)
            getValue( _stackified(x)(nestedType) )( nestedType )
          })
        } else if(isSchema(manifest)){
          //val args = List(1,"test")
          //println(manifest.erasure.getConstructor(classOf[Int],classOf[String]).toString)
          //manifest.erasure.getDeclaredConstructors.head.newInstance( null, 2.asInstanceOf[AnyRef], "test" ) //List(1,"test",3).map( x => x.asInstanceOf[AnyRef] ).toSeq:_*)
          createModelInstance( manifest, values )
        } else throw new Exception("unexpected column type: "+manifest.toString)
      }
    })
  }
  implicit def extract[A]( r:Result[A] )( implicit m: Manifest[A] ) = {
    getValue( _stackified(r.value)(m) )( m ).asInstanceOf[A]
  }
}
