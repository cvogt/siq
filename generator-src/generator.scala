package siq
import scala.collection.immutable.ListMap

case class Meta(
  val table : String,
  val fields : ListMap[String,String],
  val keys : List[String]
)
object generator{
  import org.fusesource.scalate._ 
  val engine = new TemplateEngine
  def renderOnce[A]( name : String, infilename:String="", outfilename:String="", args : ListMap[String,A] = ListMap[String,A]() ){
    val file_ = "src/"+(if(outfilename!="") outfilename else name)+".scala"
    if( !(new java.io.File(file_)).exists() )
      renderHelper( name, infilename, file_, args )
  }
  def render[A]( name : String, infilename:String="", outfilename:String="", args : ListMap[String,A] = ListMap[String,A]() ){
    val file_ = "src/0_generated/"+(if(outfilename!="") outfilename else name)+".scala"
    renderHelper( name, infilename, file_, args )
  }
  def renderHelper[A]( name : String, infilename:String="", outfilename:String, args : ListMap[String,A] ){
    val file_ = (if(infilename!="") infilename else name)
    val output = engine.layout("templates/"+(file_)+".ssp",args)
    var out_file = new java.io.FileOutputStream(outfilename)
    var out_stream = new java.io.PrintStream(out_file)
    out_stream.print("/* this file has been auto-generated */\r\n\r\n")
    out_stream.print(output)
    out_stream.close
  }
  def main(args: Array[String]){
    render("Schema",args=ListMap("schema" -> ListMap(
      "employee" -> Meta(
        table = "employee",
        fields = ListMap(
          "id" -> "Int",
          "name" -> "String",
          "workgroup_id" -> "Int"
        ),
        keys = List("id")
      ),
      "workgroup" -> Meta(
        table = "workgroup",
        fields = ListMap(
          "id" -> "Int",
          "name" -> "String"
        ),
        keys = List("id")
      ),
      "amounts" -> Meta(
        table = "countries_budgets",
        fields = ListMap(
          "country" -> "String",
          "branch" -> "String",
          "amount" -> "Int"
        ),
        keys = List("country","branch")
      ),
      "nation" -> Meta(
        table = "nation",
        fields = ListMap(
          "nationkey" -> "Int",
          "name" -> "String",
          "regionkey" -> "Int",
          "comment" -> "String"
        ),
        keys = List("nationkey")
      ),
      "region" -> Meta(
        table = "region",
        fields = ListMap(
          "regionkey" -> "Int",
          "name" -> "String",
          "comment" -> "String"
        ),
        keys = List("regionkey")
      ),
      "part" -> Meta(
        table = "part",
        fields = ListMap(
          "partkey" -> "Int",
          "name" -> "String",
          "mfgr" -> "String",
          "brand" -> "String",
          "type_" -> "String",
          "size_" -> "Int",
          "container" -> "String",
          "retailprice" -> "Int",
          "comment" -> "String"
        ),
        keys = List("partkey")
      ),
      "supplier" -> Meta(
        table = "supplier",
        fields = ListMap(
          "suppkey" -> "Int",
          "name" -> "String",
          "address" -> "String",
          "nationkey" -> "Int",
          "phone" -> "String",
          "acctbal" -> "Int",
          "comment" -> "String"
        ),
        keys = List("suppkey")
      ),
      "partsupp" -> Meta(
        table = "partsupp",
        fields = ListMap(
          "partkey" -> "Int",
          "suppkey" -> "Int",
          "availqty" -> "Int",
          "supplycost" -> "Int",
          "comment" -> "String"
        ),
        keys = List("partkey","suppkey")
      ),
      "customer" -> Meta(
        table = "customer",
        fields = ListMap(
          "custkey" -> "Int",
          "name" -> "String",
          "address" -> "String",
          "nationkey" -> "Int",
          "phone" -> "String",
          "acctbal" -> "Int",
          "mktsegment" -> "String",
          "comment" -> "String"
        ),
        keys = List("custkey")
      ),
      "orders" -> Meta(
        table = "orders",
        fields = ListMap(
          "orderkey" -> "Int",
          "custkey" -> "Int",
          "orderstatus" -> "String",
          "totalprice" -> "Int",
          "orderdate" -> "String", // date
          "orderpriority" -> "String",
          "clerk" -> "String",
          "shippriority" -> "Int",
          "comment" -> "String"
        ),
        keys = List("orderkey")
      ),
      "lineitem" -> Meta(
        table = "lineitem",
        fields = ListMap(
          "orderkey" -> "Int",
          "partkey" -> "Int",
          "suppkey" -> "Int",
          "linenumber" -> "Int",
          "quantity" -> "Int",
          "extendedprice" -> "Int",
          "discount" -> "Int",
          "tax" -> "Int",
          "returnflag" -> "String",
          "linestatus" -> "String",
          "shipdate" -> "String", // date
          "commitdate" -> "String", // date
          "receiptdate" -> "String", // date
          "shipinstruct" -> "String",
          "shipmode" -> "String",
          "comment" -> "String"
          ),
        keys = List("orderkey","linenumber")
    )
    )))

    render("Results")
    render("Tuples")
    //render("OperatorArity")

    import DslSpec.modules
    render("GeneratedModules",args=ListMap("modules" -> modules))
    val phases = List("1Normalization")
    val targets = List()//"Sql","Tree")
    for( (module,module_num) <- modules.zipWithIndex ){
      render("Module",outfilename=module.name,args=ListMap("module" -> module,"module_num" -> module_num))
//      render("Transformer",outfilename="Transformer"+module.name,args=ListMap("module" -> module,"last_phase"->phases.last))
      for( phase <- phases ){
//        renderOnce("Transformer","TransformerPhase","transformers/Transformer"+phase+module.name,args=ListMap("module" -> module,"phase"->phase,"last_phase"->phases.last))
      }
      for( target <- targets ){
        //renderOnce("Generator","GeneratorTarget","generators/"+target.toLowerCase()+"/"+module.name,args=ListMap("module" -> module,"target"->target))
      }
    }
    for( phase <- phases ){
//      renderOnce("TransformerBase",outfilename="transformers/Transformer"+phase+"Base",args=ListMap("phase" -> phase))
//      render("TransformerModules",outfilename="TransformerModules"+phase,args=ListMap("modules" -> modules,"phase" -> phase))
      //renderOnce("Transformer",outfilename="transformers/Transformer"+phase,args=ListMap("module" -> module,"phases"->phases,"last_phase"->phases.last))
    }
    for( target <- targets ){
      //renderOnce("GeneratorBase",outfilename="generators/"+target.toLowerCase()+"/_Base",args=ListMap("target"->target))
      //render("GeneratorModules",outfilename=target+"GeneratorModules",args=ListMap("modules" -> modules,"target"->target))
//      renderOnce("Generator",outfilename="generators/"+target,args=ListMap("modules" -> modules,"target"->target))
    }
    println("done")
  }
}
