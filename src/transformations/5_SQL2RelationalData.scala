package siq
trait SQL2RelationalData extends Algebra2SQL{
  var debug : Boolean
  // Import JDBC package from standard Java SDK
  import java.sql.{Connection, DriverManager, ResultSet}
  // Load the driver
  Class.forName(classOf[org.postgresql.Driver].getName).newInstance
  case class NestedRelationalData( data:List[Map[String,String]], columns:List[String], nested:Map[String,NestedRelationalData] )
  def sql2relationaldata( nested : NestedSQL ) : NestedRelationalData = { // FIXME: return type
    val connection = DriverManager getConnection "jdbc:postgresql://localhost/siq?user=siq&password=siq&characterEncoding=UTF8jdbc:postgresql://localhost/siq?user=siq&password=siq&characterEncoding=UTF8"
    connection.setAutoCommit(false)
    var results = List[Map[String,String]]()
    try{
      val statement = connection createStatement (ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
      //statement.setFetchSize(1);
//      val startTime = System.currentTimeMillis()
      val rs = statement executeQuery nested.sql
//      println("SQL: " + (System.currentTimeMillis() - startTime))
//      val startTime2 = System.currentTimeMillis()
      while (rs next) {
        results = {
          var result = List[String]()
          try{
            for( i<-Range(1,999) ){
              result = rs.getString(i) :: result
            }
          } catch{ case _ => () }
          nested.columns zip result.reverse toMap
        } :: results
      }
//      println("Results: " + (System.currentTimeMillis() - startTime2))
      statement close
    } catch {
      case e:org.postgresql.util.PSQLException => throw new Exception( (if(true || !this.debug) nested + "\n" else "") + e.getMessage)
    } finally { connection close }
    NestedRelationalData( results.reverse, nested.columns, nested.nested.map(_._1) zip nested.nested.map(_._2).map(sql2relationaldata _) toMap )
  }
}
