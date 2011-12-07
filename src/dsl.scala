package siq
object dsl{
  val dsl_old: IFerry2Result with ISchema = new Ferry2Result with Schema{}
  val dsl : IScalaIntegratedQuery = new ScalaIntegratedQuery
}
trait IScalaIntegratedQuery extends ISchema with IModules{
  protected def query[T]( r:Rep[T], debug : Boolean )( implicit manifest: Manifest[T] ) : T
  case class Shipable[T /*<% Rep[T]*/]( r:Iterable[T] ){
    def todb = liftIterable( r )
  }
  implicit def todb[T /*<% Rep[T]*/] = liftIterable[T] _
  implicit def ship_enable[T /*<% Rep[T]*/]( r:Iterable[T] ) = Shipable(r)
  case class Queryable[T]( r:Rep[T] )( m: Manifest[T] ){
    def fromdb(debug:Boolean = false) : T = query(r,debug)(m)
    def fromdb : T = fromdb(false)
  }
  implicit def query_enable[T]( r:Rep[T] )( implicit m: Manifest[T] ) = Queryable(r)(m)
  def fromdb[T]( r:Rep[T], debug:Boolean=false )( implicit m: Manifest[T] ) = Queryable(r)(m).fromdb(debug)
  def dumpgraph[T](r:Rep[T], filename:String = "graph.gv", show_sql:Boolean=false, show_ferry:Boolean=true, show_intermediate:Boolean=true, intermediate_max:Int=20)( implicit manifest: Manifest[T] ) :Rep[T]
  case class GraphDumpable[T]( r:Rep[T] ){
    def dumpgraph(filename:String = "graph.gv", show_sql:Boolean=false, show_ferry:Boolean=true, show_intermediate:Boolean=true, intermediate_max:Int=20)( implicit manifest: Manifest[T] ):Rep[T] =
        IScalaIntegratedQuery.this.dumpgraph(r, filename, show_sql, show_ferry, show_intermediate, intermediate_max )(manifest)
  }
  implicit def graph_dump_enable[T]( r:Rep[T] ) = GraphDumpable(r)
}
class ScalaIntegratedQuery extends IScalaIntegratedQuery
    with Schema
    with SIQ2FerryCore
    with FerryCore2Algebra
    with Algebra2SQL
    with SQL2RelationalData
    with RelationalData2FerryData
    with FerryData2Scala
    with RelationalData2Graph
    /* with Results*/{
  var debug : Boolean = false
  private def _implementation_type[T]( manifest : Manifest[T] ) = if( manifest.toString.startsWith("scala.collection.Iterable")) ferry.ImplementationTypes.TABLE else ferry.ImplementationTypes.ROW
  def dumpgraph[T](r:Rep[T], filename:String, show_sql:Boolean=false, show_ferry:Boolean=true, show_intermediate:Boolean=true, intermediate_max:Int=20)( implicit manifest: Manifest[T] ) :Rep[T] = {
    val ferrycore = siq2ferrycore( r, _implementation_type(manifest) )
    val algebra   = ferrycore2algebra( ferrycore )
    algebra2graph( algebra, filename, show_sql, show_ferry, show_intermediate, intermediate_max )
    r
  }
  protected def query[T]( r:Rep[T], debug:Boolean = false )( implicit manifest: Manifest[T] ) : T = {
    this.debug = debug
    if(debug){
      println("-"*80)
      println("SIQ:")
      println(r)
      println("-"*80)
    }
    val ferrycore = siq2ferrycore( r, _implementation_type(manifest) )
    if(debug){
      println("Ferry Core:")
      println(ferrycore)
      println("-"*80)
    }

    val algebra   = ferrycore2algebra( ferrycore )
    if(debug){
      println("Relational Algebra:")
      println(algebra)
      println("-"*80)
    }

    val sql       = algebra2sql( algebra )
    if(debug){
      println("SQL:")
      println(sql)
      println("-"*80)
    }

    val relational_data = sql2relationaldata( sql )
    //return null.asInstanceOf[T];
    if(debug){
      println("Result (via postgres jdbc):")
      println("")
      println(relational_data)
      println("-"*80)
      println("Expected Ferry Type:")
      println("")
      println( ferrycore.type_ )
      println("-"*80)
    }
    val ferry_data = relationaldata2ferrydata( relational_data, ferrycore.type_ )
    if(debug){
      println("Ferry Result:")
      println("")
      println(ferry_data)
      println("-"*80)
    }
    val data = ferrydata2scala[T]( ferry_data )(manifest)
    if(debug){
      println("Scala Result:")
      println("")
      println(data)
      println("-"*80)
    }
    data
/*    val result_data = result.map(_.drop(2))
    val data = if( algebra.relation.type_.asInstanceOf[ferry.FerryCoreTypes.list].element == ferry.FerryCoreTypes.atomic ) result_data.flatten else result_data
    extract( new Result( data ) )*/
  }
}
