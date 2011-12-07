package siq
trait FerryData2Scala extends FerryCore with Results{
  def ferrydata2scala[T]( f : Any )(m:Manifest[T]) : T = {
    import ferry._
    extract( new Result( f ))( m )
  }
}