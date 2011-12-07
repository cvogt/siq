package siq

import scala.io.Source

trait IFerry2Result extends ISIQ2Ferry with IResults
{
  def query[R]( r:Rep[R] ) : Result[R]
  case class Shipable[T /*<% Rep[T]*/]( r:Iterable[T] ){
    def todb = liftIterable( r )
  }
  def todb[T /*<% Rep[T]*/] = liftIterable[T] _
  implicit def ship_enable[T /*<% Rep[T]*/]( r:Iterable[T] ) = Shipable(r)
  case class Queryable[T]( r:Rep[T] )( m: Manifest[T] ){
    def exec = extract[T]( query( r ))(m)
    def fromdb : T = extract[T]( query( r ))(m)
    def fromdb(debug:Boolean = false) : T = fromdb
    def dumpgraph() = r
  }
  implicit def query_enable[T]( r:Rep[T] )( implicit m: Manifest[T] ) = Queryable(r)(m)
  def exec[T]( r:Rep[T] )( implicit m: Manifest[T] ) = Queryable(r)(m).exec
  def fromdb[T]( r:Rep[T] )( implicit m: Manifest[T] ) = Queryable(r)(m).fromdb
}
trait Ferry2Result extends IFerry2Result with SIQ2Ferry with Results{
  val debug = false
  def query[R]( r:Exp[R] ) = {
    //val wd = new java.io.File("D:\\documents\\studies\\Diplomarbeit\\tom schreiber")
    val wd = new java.io.File("D:\\documents\\studies\\Diplomarbeit\\tom schreiber")//\\FerryDB\\FerryDB\\_distribution.jar\\ferrydb")
    println("-"*80)
    def pipe( input : String, cmds : List[String] ) : String = cmds match {
      case cmd :: tail => {
        //println(cmd)
        if(debug){
          println(input)
          println("-"*80)
        }
        val process = Runtime.getRuntime.exec(cmd,null,wd)
        val stdin = process.getOutputStream
        stdin.write( input.getBytes )
        stdin.close

        val output = Source.fromInputStream( process.getInputStream ).mkString("")

        if( process.getErrorStream.available() > 0 ){
          // check stderr and raise if not empty
          throw new Exception(
            "Got the following on the stderr:\r\n\r\n" +
            Source.fromInputStream( process.getErrorStream ).mkString("") + "\r\n\r\n          when running \r\n\r\n" +
            cmd + "\r\n\r\n          piping in: \r\n\r\n" + input + "\r\n\r\n"

          )
        }

        process.destroy
        pipe( output, tail )
      }
      case Nil => input
    }
    val cmds = List(
      "ferryc -o1 -o2 -o3 -groupByAsMacro +RTS -K256000000 -RTS",
      "\"C:\\Program Files\\MonetDB\\MonetDB4\\bin\\pf.exe\" -lIS -o _",
      "cmd /c ferrydb.bat",
      "cmd /c jsonify.bat"
    )
    //print (pipe(genFerry(r), cmds))
    var ferryQuery = genFerry(r)
    /*ferryQuery = "" +
      "(let q1519150812 = " +
      "  (let countries_budgets = table countries_budgets (country string, branch string, amount int) with keys ((country, branch))" +
      "    in for c1 in countries_budgets group by countries_budges.country return (c1.country,c1.branch,c1.amount)" +
      "  ) in for i1519150812 in q1519150812 return (i1519150812.1,i1519150812.3,(" +
      "    let q288216526 = i1519150812.2 in for i288216526 in q288216526 return i288216526)" +
      "  )" +
      ")"
    ferryQuery = "" +
      "let countries_budgets = table countries_budgets (country string, branch string, amount int) with keys ((country, branch))" +
      "    in for c1 in countries_budgets group by countries_budgets.country return c1.1"
    */
    val __ferryQuery = " (let outer ="+
      "(let countries_budgets = table countries_budgets (country string, branch string, amount int) with keys ((country, branch))" +
      " in for c1 in countries_budgets group by c1.country return c1)" +
      " in for outerElem in outer return (outerElem.2,outerElem.2))"
// this works:
    val _ferryQuery = "" +
" (let outer = (let countries_budgets = table countries_budgets (country string, branch string, amount int) with keys"+
" ((country, branch)) in for c1 in countries_budgets group by c1.country"+
" return c1) in for outerElem in outer"+
" return (the(outerElem.1),sum(outerElem.3),(for x in zip(outerElem.2,outerElem.3) return (x.1,x.2,(((x.2)*100)/(sum(outerElem.3)))))))"

        val ferryQuery2 = "" +
" let countries_budgets = table countries_budgets (country string, branch string, amount int) with keys"+
" ((country, branch)) in for c1 in countries_budgets return c1"

    val ferryQueryX = """(let q632050702 = (
    let q19533676 = table LINEITEM (L_PARTKEY int, L_SHIPMODE string, L_TAX int, L_RETURNFLAG string, L_RECEIPTDATE string, L_COMMITDATE string, L_SHIPINSTRUCT string, L_COMMENT string, L_LINESTATUS string, L_EXTENDEDPRICE int, L_SUPPKEY int, L_SHIPDATE string, L_ORDERKEY int, L_DISCOUNT int, L_LINENUMBER int, L_QUANTITY int
) with keys ((L_ORDERKEY, L_LINENUMBER)) in for i19533676 in q19533676 where i19533676.12 >= "1993-01-01"
return (i19533676.1,i19533676.2,i19533676.3,i19533676.4,i19533676.5,i19533676.6,i19533676.7,i19533676.8,i19533676.9,i19533676.10,i19533676.11,i19533676.12,i19533676.13,i19533676.14,i19533676.15,i19533676.16)) in for i632050702 in q632050702
return (i632050702.10 * i632050702.14))"""
    val ferryQuery12 = """(let q1691174601 =
	(let q4999541 = table employee (id int, name string, workgroup_id int) with keys ((id))
	 in for i4999541 in q4999541 group by i4999541.3 return (i4999541.1,i4999541.2,i4999541.3))
in for i1691174601 in q1691174601
	return
		(let q1086364253 = i1691174601.2
		in for i1086364253 in q1086364253 order by i1086364253 ascending
			return i1086364253))"""

    val ferryQuery1234 = """let t = table employee( id int, name string ) with keys((id)) in for x in t where x.id >= 3 return x"""

    val ferryQueryasdf_ = """
    (let q6613606 = table employee (id int, name string, workgroup_id int) with keys ((id))
        , q28995049 =
        (let q28705408 = table workgroup (id int, name string) with keys ((id))
            in for i28705408 in q28705408
            where (i6613606.3 == i28705408.1)
            return (i28705408.1,i28705408.2)
        )
        in for i6613606 in q6613606, i28995049 in q28995049
        return (i6613606.2,i28995049.2)
    )"""
    val ferryQueryasdf = """
    concat(let q6613606 = table employee (id int, name string, workgroup_id int) with keys ((id))
        in for i6613606 in q6613606
        return (let q28995049 =
          (let q28705408 = table workgroup (id int, name string) with keys ((id))
            in for i28705408 in q28705408
            where (i6613606.3 == i28705408.1)
            return (i28705408.1,i28705408.2)
          )
          in for i28995049 in q28995049
          return (i6613606.2,i28995049.2)
    ))"""
    val ferryQueryABC = """let e = table employee (id int, name string, workgroup_id int) with keys ((id)) in (e,e)"""
    val json = pipe(ferryQuery, cmds)

    // the list stuff works around the scala json parser not being able to parse "3", but ["3"]
    val Some(rawRawResults) = scala.util.parsing.json.JSON.parseFull("["+json+"]").asInstanceOf[Option[_]]
    val rawResults = rawRawResults.asInstanceOf[List[_]].head
    //val rawResults = List( List(List(1,"Peter"),"Peter"),List(List(1,"Peter"),"Peter"),List(List(1,"Peter"),"Peter") )
    //println( rawResults )
    new Result[R]( rawResults )
  }
}
