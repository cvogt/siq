package siq

trait RelationalData2Graph extends FerryCore2Algebra with Algebra2SQL with SQL2RelationalData{
  def algebra2graph( from:algebra.Nested, filename:String, show_sql:Boolean=false, show_ferry:Boolean=true, show_intermediate:Boolean=true, intermediate_max:Int=20 ) {
    def render_nodes_and_links( from:algebra.Nested ) : String = {
      val relations = linearize_dependencies(from.relation)

"""subgraph cluster_plan"""+from.relation.name+"""{
  color = blue;
""" +
    relations.map( relation =>
      relation.name + "_" + relation.name +""" [shape=none, margin=0, label=<
<FONT POINT-SIZE="12" FACE="Arial">
<TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0" CELLPADDING="4">
<TR><TD COLSPAN="""" + relation.schema.size + """"> """ +
        relation.getOperatorName +  " " + relation.name
        +{if(show_ferry) "<BR/>"+ debug_ferrycore_algebra_association(relation).getExpressionName+
        "("+debug_ferrycore_algebra_association(relation).asInstanceOf[Product].productIterator.map{
          case e:ferry.Expression => e.getExpressionName + "("+e.asInstanceOf[Product].productIterator.map{
            case s:String => s
            case v:Int => v
            case o if o.isInstanceOf[AnyRef] => "_"
          }.mkString(",")+")"
          case s:String => s
          case v:Int => v
          case o if o.isInstanceOf[AnyRef] => "_"
        }.mkString(",").replace(">","") + """)""" else ""} +
        (if(show_sql) "<BR/>" + relation2sql(relation) else "") + """
</TD></TR>
""" + "<TR><TD>" + relation.schema.mkString("</TD><TD>") + "</TD></TR>" + {
        if( show_intermediate ){
          val results = sql2relationaldata( algebra2sql(algebra.Nested(relation)) ).data
          results.take(intermediate_max).map( row => "<TR><TD>" + relation.schema.map(col => row(col)).mkString("</TD><TD>") + "</TD></TR>" ).mkString("") +
          (if(results.size > intermediate_max) """<TR><TD COLSPAN="""" + relation.schema.size + """">+ """+(results.size-intermediate_max)+" more</TD></TR>" else "") +
          ""
        } else ""
      } + """
</TABLE>
</FONT>
>];

""")
      .mkString("\n\n") +
      relations.map{
        case bin:algebra.BinaryRelationOperator => List(
          (bin,bin.left),
          (bin,bin.right)
        )
        case un:algebra.UnaryRelationOperator => List((un,un.relation))
        case _ => List()
        //case _:algebra.LiteralTable[_] => List(relation)
        //case _:algebra.Table => List()
      }.flatten.map{ case (from,to) => to.name + "_" + to.name+" -> "+from.name + "_" + from.name+""" [dir="back"];""" }.mkString("\n") +
      "\n}\n" +
      from.itbls.map{
        case (_,to) => render_nodes_and_links(to) +
                             "\n\n" + from.relation.name + "_" + from.relation.name +" -> "+to.relation.name + "_" + to.relation.name+""" [dir="back"];"""
      }.mkString("\n\n")
    }

    algebra2sql( from ) // <- this populates debug_ferrycore_algebra_association as a side-effect

    val output  = "digraph querygraph{\n\n" + render_nodes_and_links( from ) + "\n\n}"

    var out_file = new java.io.FileOutputStream("graph.gv")
    var out_stream = new java.io.PrintStream(out_file)
    out_stream.print(output)
    out_stream.close

  }
}





  /*    debug_ferrycore_algebra_association.toList
      .filter{case (relation,ferry) => relations.contains(relation)}
      .groupBy{case (relation,ferry) => ferry}.map{
      case (_,relations_ferry) => {
        val relations = relations_ferry.map(_._1)
        val ferry = relations_ferry(0)._2
        if(cluster_relations.size > 0){
"""subgraph ferry"""+ferry.name+"""{
  label =""""+ferry.getExpressionName+" ("+ferry+")"+ """";
  color = blue;
""" +*/



/*"""
}
"""
    }}}.mkString("\n\n") +*/












/*
    def flatten( relation:Relation ) : List[Relation] = (relation match{
        case bin:BinaryRelationOperator => relation :: flatten(bin.left) ::: flatten(bin.right)
        case un:UnaryRelationOperator => relation :: flatten(un.relation)
        case _:LiteralTable[_] => List(relation)
        case _:Table => List()
      })


    // put together complete sql query from component queries
    val sql = "\nWITH\n\n"+
    // distinct is needed to kill multiple occurence of LOOP relation
    relations.reverse.distinct.map( relation =>
    "-- " + relation.getOperatorName + " (created for ferry "+ debug_ferrycore_algebra_association(relation).getExpressionName +")\n" + //debug line
    "%s(%s) AS\n(%s)".format(
      relation.name
      ,relation.schema.mkString(",")
      ,relation2sql(relation)
    )).mkString(",\n\n") +
    "\n\n"+
    "SELECT * FROM "+from.relation.name+"\n-- "+("-"*77)+"\n"
*/
























/*
    relations.map( relation => {
      relation.name + """ [shape=none, margin=0, label=<
<FONT POINT-SIZE="12" FACE="Arial">
<TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0" CELLPADDING="4">
<TR><TD COLSPAN="""" + relation.schema.size + """"> """ + relation.name + """</TD></TR>
""" + "<TR><TD>" + relation.schema.mkString("</TD><TD>") + "</TD></TR>" + {
   //   val sql = algebra2sql( algebra.Nested(relation, Map()) )
  //val data = sql2relationaldata( sql )
  //data.map( "<TR><TD>" + _.mkString("</TD><TD>") + "</TD></TR>" ) +
  ""
} + """
</TABLE>
</FONT>
>];
"""}).mkString("\n\n") + "\n\n" +
    debug_ferrycore_algebra_association.toList.groupBy{case (relation,ferry) => ferry}.map{
      case (ferry,relations_ferry) => """
subgraph cluster_ferry"""+ferry.name+"""{
  label ="""" +ferry.getExpressionName+ """";
  color = red;
""" +
      relations_ferry.map(_._1).map{
        case bin:algebra.BinaryRelationOperator => List(
          (bin.name,bin.left.name),
          (bin.name,bin.right.name)
        )
        case un:algebra.UnaryRelationOperator => List((un.name,un.relation.name))
        case _ => List()
        //case _:algebra.LiteralTable[_] => List(relation)
        //case _:algebra.Table => List()
      }.flatten.map{ case (from,to) => to+" -> "+from+""" [dir="back"];""" }.mkString("\n")+
"""
}

"""
    }.mkString("\n\n") +*/
