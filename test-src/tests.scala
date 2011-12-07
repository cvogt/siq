package siq
import Predef.{any2stringadd => _, _} // prohibit automatic toString conversion of objects when + method is used
object tests {
  def main( args:Array[String] ) {
    {
      import dsl.dsl._
      import dsl.dsl.tables._
      import dsl.dsl.implicits._
      {
        /*
          Customers by Country with paritioning in market segments, example output:
          Customers in Total: 150
          INDONESIA                 9 (6.0%)
            AUTOMOBILE 2 (22.2%)
            BUILDING   1 (11.1%)
            FURNITURE  1 (11.1%)
            ...
          CANADA                    9 (6.0%)
          ...
        */
        {
          // lifted function, based on parameter types
          def percent( part:Rep[Iterable[_]], whole:Rep[Iterable[_]] ) = {
            val permill = part.length * 1000 / whole.length
            (permill / 10) +"."+ (permill % 10)
          }
          // database query definition
          val q1 = (for(
                n <- nation
              ) yield {
                val nation_customers = customer.withFilter( _.nationkey == n.nationkey )
                val segments = nation_customers.map(_.mktsegment).distinct.orderBy(x=>x)
                val customers_by_segment = for( segment <- nation_customers.map(_.mktsegment).distinct.orderBy(x=>x) ) yield {
                  val segment_customers = nation_customers.withFilter( _.mktsegment == segment )
                  (
                    segment
                    , segment_customers.length
                    , percent( segment_customers, nation_customers )
                  )
                }
                (
                  n.name
                  ,nation_customers.length
                  ,percent( nation_customers, customer )
                  ,customers_by_segment
                 )
              }).orderBy(_._2 desc)
          // execute query
          val (customer_length,per_nation) = tuple( customer.length, q1 ).fromdb()
          // ---- print results ----
          println("-"*40)
          println(" Customers in Total: " + customer_length)
          println("-"*40)
          println( per_nation.map( e => {
            val (name,number,percent,by_segment) = e
            " %s %s (%s%%)\n".format( name,number,percent) +
            by_segment.map( s => {
              val (segment,number,percent) = s
              "    %s %s (%s%%)".format(segment,number,percent)
            }).mkString("\n")
          }).mkString("\n"))
        }
        // --------------------------------------------
        {
          // this is all executed in the db
          // filter employees using a scala collection
          val q1 = for( id <- List(1,2,3,4,5).todb
                           ;e <- employee
                           ;if e.id == id
          ) yield e

          // join workgroup table
          val q2 = for( e <- q1
                        ;w <- workgroup
                        ;if e.workgroup_id == w.id
          ) yield (e,w)


          // sort by workgroup names, given an ordering (different api than scala collection)
          val q3 = q2.orderBy(_._2.name desc, _._1.name)

          // project to the employees, execute and print
          println( q3.map(_._1).fromdb() )
        }

        // --------------------------------------------
        // a random bunch of queries

        customer.withFilter(_.custkey < 5).map(x => customer.withFilter(_.custkey < 5).map(_.name)).fromdb().foreach(println)
        customer.withFilter(_.custkey==2).map(x => (1.todb,customer.withFilter(_.custkey == 1).map(_.name))).fromdb().foreach(println)

        println( List(1,2).todb.map( i => employee.withFilter(_.workgroup_id == i) ).map(_.length).fromdb() )

        println((
          for( w <- workgroup ) yield employee.withFilter(_.workgroup_id == w.id)
          //for (w <- workgroup; e <- employee; if e.workgroup_id == w.id) yield (e,w)
        ).fromdb())

        println(( for( x <- List(1,2,3).todb ) yield x).fromdb() )
        println( employee.fromdb() )
        println(( for( e <- employee ) yield e.name).fromdb() )
        println(( for( e <- employee.orderBy(_.name asc) ) yield e.name).fromdb() )
        println(( for( e <- employee.orderBy(_.workgroup_id desc, _.name asc) ) yield e).fromdb() )
        println(( for( e <- employee.orderBy(_.name desc) ) yield e.name).fromdb() )
        println(( for( e <- employee ) yield e.name).fromdb() )
        // fixed! fails as required: println(( for( e <- employee ) yield e).orderBy(_ asc).fromdb() )
        println(( for( w <- workgroup ) yield employee.map( e=> (tuple(e.id,e.name),e.workgroup_id) )).fromdb() )
        println(( for( w <- workgroup ) yield employee.map(_.name)).fromdb() )
        println(( for( w <- workgroup ) yield employee.withFilter(x => 1 == w.id)).fromdb() )
        println(( for( x <- List("d","e","f").todb ) yield
                   (for (z <- List("a","b","c")) yield z)).fromdb() )
        println(( for( x <- List("d","e","f").todb ) yield
                   (for (z <- List("a","b","c").todb) yield x)).fromdb() )

        println(( for( x <- List("b","a").todb ) yield
                 (for (z <- List("a","b").todb; if z == x ) yield z)).fromdb() )

        // lifting scala lists with tuples is only implemented hackishly
        println(( for( x <- List(("a","b"),("b","a")).todb ) yield x).fromdb(/*debug=true*/) )
        println(( for( x <- List(("a","b"),("b","a")).todb ) yield x._2).fromdb(/*debug=true*/) )
        println(( for( w <- workgroup; e<-employee; if e.workgroup_id == w.id) yield e).fromdb() )
        println(( for( w <- workgroup; e<-employee; if e.workgroup_id == w.id) yield (w,e)).fromdb() )
        println(( for( w <- workgroup ) yield employee.withFilter(_.workgroup_id == w.id)).fromdb() )

        // test viral positional access
        println(( employee.map( e => (tuple(e.id,e.name),e.workgroup_id) ).map( x => (x._1,x._1._2,x._2)) ).fromdb())

        // CURRENTLY NOT SUPPORTED: heterogeneous tuple (mixed Reps and normal types, needs explicit cast)
        //println(( for( e <- employee ) yield (1,e.name)).fromdb() )

      // NOT SUPPORTED YET:
      // .map{ case(e,w) => w.name desc }

      //(for( x <- List(1,2,3).todb ) yield liftOther(List(1,2,3)))
      //(for( x <- List(1,2,3).todb ) yield tupleize((1,List(1,2,3):Iterable[Int])))
      }
      {
        // a type class for Rep's the lower bound >:T allows Lists to be converted to Rep[Iterable]
        // these lines just test if it compiles, switching to view bounds could improve implementation in the future
        def conv[T <% Rep[_ >: T]]( t:T ) = ()
        conv( 5 )
        conv( List(1,2,3) )
      }
    }
    //implicit def tupleize[T1 <% Rep[T1],T2 <% Rep[T2]]( t:(T1,T2) ) : Rep[(T1,T2)] = tuple2rep2((t._1,t._2));
    return ();

    // the following tests are rather old and are mainly in here to avoid regressions with compilation
    {
    import dsl.dsl_old._
    import dsl.dsl_old.tables._
    import dsl.dsl_old.implicits._
    println("old ferryc based tests");
    {
      (for( w <- workgroup ) yield employee.withFilter(_.workgroup_id == w.id) ).fromdb
      return ();
      println((for( x <- List(1,2,3).todb ) yield x).fromdb)
      println(employee.fromdb)
      println((for( e <- employee ) yield e.name).fromdb)
    }
    {
      fromdb(Tuple2( employee, employee ));
      // fails: Tuple2( employee, employee ).fromdb;
    }

    {
      val q = for( e <- employee; w <- workgroup;if e.workgroup_id == w.id ) yield (e.name,w.name)
      q.fromdb.foreach( println(_) )
    }
    {
      val q = for( e <- employee; w <- workgroup ) yield tuple2rep2(e,w)
      q.fromdb.foreach( println(_) )
    }
    {
      val q = for( e <- employee; w <- workgroup ) yield (e.id,w)
      q.fromdb.foreach( println(_) )
    }
    {
      val q = for( c <- customer.orderBy(_.nationkey).groupBy(_.nationkey) ) yield {
        val country_orders =  for( o <- orders; x <- zip(c.custkey, c.mktsegment); if o.custkey == x._1 ) yield (x._2,o.totalprice)
        val total_price = country_orders.map(_._2).sum
        (
          c.nationkey.one,
          c.nationkey.length,
          total_price
        )
      }
      q.fromdb.foreach( println(_) )
    }
/*
    {
      val q = for( c <- CUSTOMER.orderBy(_.C_NATIONKEY).groupBy(_.C_NATIONKEY) ) yield (
        c.C_NATIONKEY.one,
        c.C_NATIONKEY.length,
        zip( c.C_CUSTKEY, c.C_MKTSEGMENT ).groupBy(_._2).map( x => (
          x._2.one,
          x._1,
          for( o <- ORDERS; custkey <- x._1 if o.O_CUSTKEY == custkey ) yield (custkey,o.O_TOTALPRICE)
        ))  //         (for( x <- c.C_MKTSEGMENT) yield (x,x.(x.length*100)/c._1.length) )
      )
      q.fromdb.foreach( println(_) )
    }
*/

    /*
    printDsl( (7.0:Rep[Double]) + 7.0 )
    printDsl( dsl.unit(7.0) + 7.0 )
    printDsl( dsl.unit(7.0) == "Chris" )
    printDsl( (dsl.unit(7.0):Rep[Double]) + (7:Rep[Double]) == dsl.unit(9) + "Chris" )
    printDsl( for( e <- employee ) yield "test" )
    printDsl( for( e <- employee ) yield e.name )
    printDsl( for( e <- employee; f <- employee ; if e.name == f.name && e.id <> f.id ) yield e.id + " has same name as " + f.id  )
    printDsl( for( e <- employee; w <- workgroup ; if e.workgroup_id == w.id ) yield e.name + " is in group " + w.name )
    printDsl( 7 + 7 == (9:Rep[Double]) )

    printDsl( for( e <- employee if e.name == "test" ) yield "test" )
    printDsl( for( (e:EmployeeSchemaBase) <- employee if e.name == "test" orderBy e.name + e.id ) yield "test" )
    */
/*
    // TODO:
    val e = employee
    val e2 = e.map( b => (b,b._2) )
    val e3 = e2.map( e => (e._1,e._2,e) )
    val e4 = e3.map( e => (e._1,e._1._3,e._2,e) )
    print( query(
        e4
    ).foreach(print(_)) )
*/

/*    {
      val names = for( p <- employee ) yield (p._1,p.name)
      println( (for(x <- (for( e <- (for( e <- employee ) yield e) ) yield e)) yield x.name) exec )
      val gamounts = ((for( a <- rep2amountsgroupable(amounts).groupBy(_.country) ) yield a) exec)
      println( gamounts )
      println( gamounts.map(_.country) )
    }
*/

    {
      // TPC-H Query6
      val date = "1993-01-01" // DATE is the first of January of a randomly selected year within [1993 .. 1997];
      val date_plus = "1994-01-01" // date ':1' + interval '1' year
      val discount = 2// 2. DISCOUNT is randomly selected within [0.02 .. 0.09];
      val quantity = 24 // 3. QUANTITY is randomly selected within [24 .. 25].
      val q = lineitem.withFilter( l =>
        l.shipdate > date // FIXME >=
        && l.shipdate < date_plus
        && (l.discount*100) > discount - 1
        && (l.discount*100) < discount + 1
        && l.quantity < quantity
      ).map( l => l.extendedprice * 100 * l.discount * 100 ).sum
      println( q fromdb )
    }
    {
      // REGRESSION TEST CASE:
      //fixed: fails a required println( employee.groupBy( _.workgroup_id ).map(x => x.name).orderBy( x => x ) fromdb )
    }
    // TEST CASE (
    {
      val query = for( e <- employee.groupBy( e => e.workgroup_id ) ) yield e.name.orderBy(x => x)
      query.fromdb.foreach( x => println(x) )
    }

    /*{
      val q = for( c <- CUSTOMER.groupBy(_.C_NATIONKEY).orderBy( _.C_NATIONKEY.one ) )
        yield (i, c.C_NATIONKEY.one, c.C_NATIONKEY.length)
      println( q fromdb );
    }*/


    /* // SURPRISING RESULT:
    {
      val last = for( p <- employee; if p._1 == (for(e <- employee.groupBy(_._1)) yield e._1.length) ) yield p
      println( query(last) : Iterable[_] )
    }
    */
    {
      println( query(for( p <- employee; if p._1 == 3 ) yield p) : Iterable[_] )
      println( query( amounts ) : Iterable[_] )
      println( query( todb(List((1,"test"),(2,"aloha"))) ) : Iterable[_] )
    }
    {
      println( query( for( a <- amounts; e<-employee ) yield(a,e) ) : Iterable[_] )
    }
/*
    // order by tuples not supported right now
    {
      val q = amounts.orderBy( e => (e._1,e._2,e._3) )
      println(query( q ):Product)
    }
*/
    {
      val q = amounts.orderBy( _._2 )
      println(query( q ):Product)
    }
    {
      val q = amounts.orderBy( _._2 )
      println(query( q ):Product)
    }
    {
      val q = amounts.groupBy( _._1 )
      println(query( q ):Product)
    }
    {
      val q = amounts.groupBy( _.country )
      println( q exec )
    }
    {
      val q = workgroup.groupBy( _.id )
      println( q exec )
    }
    {
      val q = for ( a <- amounts ) yield (a.country,a.branch)
      println( q.groupBy(x => "test").map(x => (x._1.one,x._2.one)) exec )
    }
    {
      val q2 = amounts.length
      println(query( q2 ):Int)
      val q3 = for( a <- amounts ) yield (amounts.length, a._2)
      println(query( q3 ):Product)
      val q4 = (for( a <- amounts.groupBy( (a:(Rep[_],Rep[_],Rep[_])) => a._1 ) ) yield
            ( a._1.one,a._3.sum, for( b <- zip(a) ) yield (b._2,b._3,b._3*200/a._3.sum) )).length
      val result = query(q4)
    }
    {
      Range(1,10).foreach{x=>{
        val startTime = System.currentTimeMillis()
        val q = (for( a <- amounts.groupBy( (a:(Rep[_],Rep[_],Rep[_])) => a._1 ) ) yield
              ( a._1.one,a._3.sum, for( b <- zip(a) ) yield (b._2,b._3,b._3*200/a._3.sum) )).length
        println(System.currentTimeMillis()-startTime)
        val startTime2 = System.currentTimeMillis()
        val result = query(q)
        println(System.currentTimeMillis()-startTime2)
        val startTime3 = System.currentTimeMillis()
        result : Int
        println(System.currentTimeMillis()-startTime3)
          println("---")
      }}
    }
/*
    {
      // does not work, due to missing implementation of filter
      for(
        (country,sector,amount) <- amounts.groupBy( a => a._1 )
      ) yield
            ( country.one, amount.sum, (for(b <- zip(sector,amount)) yield (b._1,b._2,b._2*100/amount.sum) ) )
    }
*/

    query(
        for( a <- amounts.groupBy( (a:(Rep[_],Rep[_],Rep[_])) => a._1 ) ) yield
          ( a._1.one,a._3.sum, for( b <- a._2 ) yield b )
    ).map( x =>println(x) )

    query(
        employee.groupBy( (e:(Rep[_],Rep[_],Rep[_])) => e._3 ).map( e => e._2 )
    ).map( x =>println(x) )

    query(
        employee.groupBy( (e:(Rep[_],Rep[_],Rep[_])) => e._3 ).map( e => e._2 )
    ).map( x =>println(x) )

    query(
        for( w <- workgroup ) yield ( w.name, for(e <- employee /*if e.workgroup_id == w.id*/) yield e )
    ).map( x => println(x) )

    query(
        for( i <- todb(List(1,2)) ) yield ( i, for(e <- employee) yield (i,e.name) )
    ).map( x => println(x) )
    query(
      for( x <-
          for( i <- todb(List(1,2)); e <- employee/*; if e.id == i*/ ) yield ( i, e )
      ) yield x._2.name
    ).map( x => println(x) )

    query(
        employee.map( e => e.name )
    ).map( x =>println(x) )

    query(
      for( w <- workgroup ) yield w
    ).map( x =>println(x) )

    query(
      for( e <- employee ) yield e
    ).map( e =>println(e) )

    query(
      for( x <- (
        for( e <- employee; i <- todb(List(1,2,3,4)) ) yield tuple( tuple(i,e._2,tuple(i,e._2)), e._2,tuple(tuple(i,e._2),e._2) )
      )) yield (x, unitInt(5))
    ).map( x =>println(x) )

    query(
      for( x <- (
        for( e <- employee ) yield ( e._1, e )
      )) yield x._2._2
    ).map( x =>println(x) )


    val names_ids = for(
      x <- todb(List(1,2,3,4));
      e <- employee
    ) yield ( x, e.id, e.id, e.name )

    query(names_ids).map( x => println(x) )

    def print_names[T](t:T)( implicit manifest:Manifest[T] ){
      print(manifest)
    }
    //print_names(names_ids)

    val res = query(
//        names_ids.map( (x:Query[_]) => Tuple1(5:Rep[Int],6) )
//     names_ids.map( x => (x._2,x._1) )
//        names_ids.map( x => {print(x.toString); (5:Rep[Int])} )//Tuple1(x._1) )
//        for( x <- names_ids ) yield (5:Rep[Int],6,x(1))
      for( x <- names_ids ) yield (x._2,x._1)
    )
    res.foreach( x => {/*print_manifest(x); print_manifest(x._2); print_manifest(x._2 : Int); */println( x._2:Int )} )//extract2(x):(String,Int) ) )
//    res.foreach( x => println( (extractFlat2[String,Int](x):(String,Int)) ) )//extract2(x):(String,Int) ) )
//    print_manifest(res)
//    res.foreach( x => print_manifest( extract2(x) ) )//extract2(x):(String,Int) ) )
    return ()
    printFerry(
      for(
        e <- employee
        //;id <-generator(Array(1,2,3))
        //;if e.id == id
      ) yield (e.id,e.name) // e.name + " (" + e.id + ")" //
    )
    val results = query(
      for(
        e <- employee
        //;id <-generator(Array(1,2,3))
        //;if e.id == id
      ) yield (e.id,e.name) // e.name + " (" + e.id + ")" //
    )
/*
/*    printTree(
      for(
        e <- employee
        //;id <-generator(Array(1,2,3))
        //;if e.id == id
      ) yield (e.id,e.name) // e.name + " (" + e.id + ")" //
    )
*/
    //print( "types: " )
    //println( (results(0)._1.asInstanceOf[AnyRef].getClass, results(0)._2.asInstanceOf[AnyRef].getClass) )
    //for( record <- results ) println ( record:(Int,String) )

/*    val results2 = query(
      for(
        e <- employee
        //;id <-generator(Array(1,2,3))
        //;if e.id == id
      ) yield e.name + " (" + e.id + ")" //
    )
*/
    //for( record <- results2 ) println ( record : String )
    if(true){
      val dsl2 : engines.IJdbc2 with Schemata with generators.ITreeGenerator = new engines.Jdbc2 with SchemataExp with generators.TreeGenerator {}
      import dsl2.{unit => _, _}
      implicit def unitBoolean( v: Boolean ) = dsl2.unit(v)
      implicit def unitString( v: String ) = dsl2.unit(v)
      implicit def unitDouble( v: Double ) = dsl2.unit(v)
      implicit def unitTuples[T <: Product]( v: T ) = dsl2.unit(v)
      implicit def unitInt( v: Int ) = dsl2.unit(v)
      val q = ("Test":Rep[String]) + 2


    val results = query(
      for(
        e <- dsl2.tables.employee
        //;id <-generator(Array(1,2,3))
        //;if e.id == id
      ) yield (e.id,e.name) // e.name + " (" + e.id + ")" //
    )
    /*for( record <- results ) println ( record:(Int,String) )
      /*println( q match{ case s:Sym[_] => findDefinition(s) match{
        case Some(TP(_,x)) => x
        case _ => throw new Exception()
      }} )
      println( transform("Test",q) match{ case s:Sym[_] => findDefinition(s) match{
        case Some(TP(_,x)) => x
        case _ => throw new Exception()
      }} )*/
      printSql( for(
        e <- dsl2.tables.employee
        //;id <-generator(Array(1,2,3))
        if e.id == e.id
      ) yield (e.id,e.name+" test") )
      println( genSql(q) )*/
    }

/*    printDsl( employee.name == "Chris" )
    printDsl( people.age == 5 )
    printDsl( 27 - people.age == 0 )
*/*/
  }}
  /*
  def printInternals( query : Rep[Any] ){
    println( "symbol: " + query)
    // breaking out of dsl mode
    val exposedDsl = dsl.asInstanceOf[BaseExp]
    println( "findDefinition(...): " + exposedDsl.findDefinition(query.asInstanceOf[exposedDsl.Sym[_]]) )
  }*/
/*  def printDsl( rep:Rep[_] ) {
    println("-----------------------------------------------------")
    println("Expression tree:")
    //printTree( rep )
    println("")
    println("Ferry:")
    //printFerry( rep )
    println("")
    println("Sql:")
    printSql( rep )
  }*/
}

// where does this comment come from?
	  // use one of the approaches on http://stackoverflow.com/questions/1252915/scala-how-to-define-generic-function-parameters
	  // to support integer, etc. addition

















/*
import Predef.{any2stringadd => _, _} // prohibit automatic toString conversion of objects when + method is used
object tests {
  def main( args:Array[String] ) {
    {
      import siq.dsl.dsl._
      import siq.dsl.dsl.tables.{nation, customer, employee, workgroup}
      import siq.dsl.dsl.implicits._

      //List(1,2,3).todb.map( x => (List(1,2).todb,List(1,2).todb) ).dumpgraph()
      // a list with two elements: first a list of all employees with even ids, second all employees with odd ids. All ordered descending by id.
      ///println( List(0,1).todb.map( i => employee.orderBy(_.id desc).withFilter(_.id % 2 == i) ).fromdb )
      /*println(
        workgroup.map( w =>
          employee.withFilter(_.workgroup_id == w.id)
      )*/
//      println( workgroup.map( w => employee.withFilter( _.workgroup_id == w.id ) ).flatMap( x => x ).fromdb(debug=true) )
//      println( tuple( workgroup, employee )._1.fromdb(debug=true) )
//      println( workgroup.map( w => employee.withFilter( _.workgroup_id == w.id ) ).withFilter( l => l == 4 ).fromdb )
      println( employee.map(_.id).withFilter( x => x == "test" ).fromdb )
          //val employee_queries : Int = for( id <- List(1,3); e <- employee; if e.id == id ) yield e
//        List(9,8,7).todb.map( x => x + 3 + 4 )
         // /*.dumpgraph(show_ferry=false,show_intermediate=true)*/.fromdb(debug=true))

      /*
      *
      * */

/*      println( unitInt(5) == unitInt(6) )
//      println( unitInt(5) == unitString("test") )
      println( 5 == 6 )
      println( unitInt(5) == 6 )
//      println( unitInt(5) == "test" )
      println( 5 == unitInt(6) )
      println( true.todb == true.todb )
      println(employee.withFilter( x => true.todb == true.todb ).fromdb)
      println( employee.orderBy( _.name ).fromdb )
      //println( employee.orderBy( e => e ).fromdb )
*/

//      val query = tuple( employee, List(1).todb.map( i => (i,employee)) )
////      val query2 = query.withFilter( _._2 == "Chris" ).map( _._2 )
////      val result = query.fromdb(debug=true)
//      query.fromdb( debug=(!true) )

////      print( (for( i <- List(1,3,2).todb; e <- employee; if e.id == i ) yield e) .fromdb )
    }
  }
}

*/