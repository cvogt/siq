import sbt._
import java.io.File

class Project(info: ProjectInfo) extends DefaultProject(info)
{
    override def fork = Some(new ForkScalaRun {
        override def runJVMOptions = super.runJVMOptions ++ Seq("-Xmx1536m")
        override def scalaJars = Seq(buildLibraryJar.asFile, buildCompilerJar.asFile)
    })
  // define a root-level environment file local.properties
  // from which scala.virtualized.home will be read
  lazy val local = new BasicEnvironment {
      def log = Project.this.log
      def envBackingPath = info.projectPath / "local.properties"
      lazy val scalaVirtualizedHome = property[String]
  }
  // use the local scala-virtualized compiler and library
  override def localScala =
    defineScala("2.8.x-virtualized-SNAPSHOT", new File(local.scalaVirtualizedHome.get.getOrElse {
      log.error("scala.virtualized.home needs to be defined in local.properties and "+
      "must point to a valid scala-virtualized home directory"); "<undefined>"
    }))::Nil
  // source directory layout
  override def mainScalaSourcePath = "src"
  override def mainResourcesPath = "resources"
  override def testScalaSourcePath = "test-src"
  override def testResourcesPath = "test-resources"
  // target directory layout (standard for now)
  // dependencies
  val scalatest = "org.scalatest" % "scalatest" % "1.2" % "test"
//  val scalac = "org.scala-lang" % "scala-compiler" % "2.8.0" % "test"
//  val scala = "org.scala-lang" % "scala-library" % "2.8.0" % "test"

  lazy val scalate_core = "org.fusesource.scalate" % "scalate-core" % "1.4.1"
  lazy val postgresql = "postgresql" % "postgresql" % "8.4-701.jdbc4"
  val gen_classpath = " -classpath .;generator-bin;lib/scalate-1.4.1/lib/scalate-core-1.4.1.jar;lib/scalate-1.4.1/lib/scalate-util-1.4.1.jar;lib/scalate-1.4.1/lib/slf4j-nop-1.6.1.jar;lib/scalate-1.4.1/lib/slf4j-api-1.6.1.jar "
	lazy val genCompile = task {
    import Process._
    "E:\\programs\\scala-2.8.0\\bin\\scalac.bat -d generator-bin" +
    gen_classpath +
    "generator-src\\*.scala" ! log
    None
  }

  lazy val gen = task {
    import Process._
    "E:\\programs\\scala-2.8.0\\bin\\scala.bat" +
    gen_classpath +
    "siq.generator" ! log
    None
  } dependsOn genCompile

}
