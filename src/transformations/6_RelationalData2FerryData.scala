package siq
import scala.collection.immutable.ListMap
trait RelationalData2FerryData extends SQL2RelationalData{
  case class FerryRow( iter : Any, pos: Any, data:Map[String,Any] )
  def relationaldata2ferrydata( nested_data : NestedRelationalData, ferrytype : ferry.FerryCoreTypes.FerryCoreType, iter: Any = "1" ) : Any = {
    import ferry._
    import ferry.FerryCoreTypes._
    def t = relationaldata2ferrydata _

    // rows maps the value of the "pos" column to a map of "item*" columns
    val rows = ListMap( nested_data.data.filter(_("iter") == iter).map(
      row => (
        row("pos"),
        {
          val data = ListMap((row - "iter" - "pos").toList.sortBy( _._1.substring(4).toInt ) :_*) // is the sortBy parameter correct?
          assert( data.keys.forall(_.startsWith("item")), data.keys.toString )
          data
        }
      )
    ) : _* )
    if( nested_data.nested.size == 0 ){
      ferrytype match {
        case a if a == atomic => rows("1")("item1")
        case list(t) if t == atomic => rows.values.map(_.values.toList).flatten.toList
        case list(tuple(_)) => rows.values.map(_.values.toList).toList
        case tuple(_) => rows("1").values.toList
        case _ => throw new Exception()
      }
    }else{
      def handle_tuple_element( e: (FerryCoreType,(String,Any)) ) = e match { case (type_,(column,value)) =>
        type_ match {
          case t if t == atomic => value
          case list(_) | tuple(_) => relationaldata2ferrydata( nested_data.nested(column), type_, value )
        }
      }
      (ferrytype match {
        case tuple(element_types) => element_types zip rows("1") map (handle_tuple_element)
        case list(element_type)   => rows.map{ case (pos,row) =>
          element_type match {
            case _:list => relationaldata2ferrydata( nested_data.nested("item1"), element_type, row("item1") )
            case tuple(element_types) => ((element_types zip row) map(handle_tuple_element)).toList
          }
        }
      }).toList
    }
  }
}