/* this file has been auto-generated */

package siq
trait ISchema extends IComprehensions{
  abstract class Tables{
    def employee : Rep[Iterable[Employee]]
    def workgroup : Rep[Iterable[Workgroup]]
    def amounts : Rep[Iterable[Amounts]]
    def nation : Rep[Iterable[Nation]]
    def region : Rep[Iterable[Region]]
    def part : Rep[Iterable[Part]]
    def supplier : Rep[Iterable[Supplier]]
    def partsupp : Rep[Iterable[Partsupp]]
    def customer : Rep[Iterable[Customer]]
    def orders : Rep[Iterable[Orders]]
    def lineitem : Rep[Iterable[Lineitem]]
  }
  val tables : Tables

  class Employee(
    val id : Int
    ,val name : String
    ,val workgroup_id : Int
  ) extends Tuple3( id, name, workgroup_id ){
    override def toString = "Employee"+super.toString
  }

  class Workgroup(
    val id : Int
    ,val name : String
  ) extends Tuple2( id, name ){
    override def toString = "Workgroup"+super.toString
  }

  class Amounts(
    val country : String
    ,val branch : String
    ,val amount : Int
  ) extends Tuple3( country, branch, amount ){
    override def toString = "Amounts"+super.toString
  }

  class Nation(
    val nationkey : Int
    ,val name : String
    ,val regionkey : Int
    ,val comment : String
  ) extends Tuple4( nationkey, name, regionkey, comment ){
    override def toString = "Nation"+super.toString
  }

  class Region(
    val regionkey : Int
    ,val name : String
    ,val comment : String
  ) extends Tuple3( regionkey, name, comment ){
    override def toString = "Region"+super.toString
  }

  class Part(
    val partkey : Int
    ,val name : String
    ,val mfgr : String
    ,val brand : String
    ,val type_ : String
    ,val size_ : Int
    ,val container : String
    ,val retailprice : Int
    ,val comment : String
  ) extends Tuple9( partkey, name, mfgr, brand, type_, size_, container, retailprice, comment ){
    override def toString = "Part"+super.toString
  }

  class Supplier(
    val suppkey : Int
    ,val name : String
    ,val address : String
    ,val nationkey : Int
    ,val phone : String
    ,val acctbal : Int
    ,val comment : String
  ) extends Tuple7( suppkey, name, address, nationkey, phone, acctbal, comment ){
    override def toString = "Supplier"+super.toString
  }

  class Partsupp(
    val partkey : Int
    ,val suppkey : Int
    ,val availqty : Int
    ,val supplycost : Int
    ,val comment : String
  ) extends Tuple5( partkey, suppkey, availqty, supplycost, comment ){
    override def toString = "Partsupp"+super.toString
  }

  class Customer(
    val custkey : Int
    ,val name : String
    ,val address : String
    ,val nationkey : Int
    ,val phone : String
    ,val acctbal : Int
    ,val mktsegment : String
    ,val comment : String
  ) extends Tuple8( custkey, name, address, nationkey, phone, acctbal, mktsegment, comment ){
    override def toString = "Customer"+super.toString
  }

  class Orders(
    val orderkey : Int
    ,val custkey : Int
    ,val orderstatus : String
    ,val totalprice : Int
    ,val orderdate : String
    ,val orderpriority : String
    ,val clerk : String
    ,val shippriority : Int
    ,val comment : String
  ) extends Tuple9( orderkey, custkey, orderstatus, totalprice, orderdate, orderpriority, clerk, shippriority, comment ){
    override def toString = "Orders"+super.toString
  }

  class Lineitem(
    val orderkey : Int
    ,val partkey : Int
    ,val suppkey : Int
    ,val linenumber : Int
    ,val quantity : Int
    ,val extendedprice : Int
    ,val discount : Int
    ,val tax : Int
    ,val returnflag : String
    ,val linestatus : String
    ,val shipdate : String
    ,val commitdate : String
    ,val receiptdate : String
    ,val shipinstruct : String
    ,val shipmode : String
    ,val comment : String
  ) extends Tuple16( orderkey, partkey, suppkey, linenumber, quantity, extendedprice, discount, tax, returnflag, linestatus, shipdate, commitdate, receiptdate, shipinstruct, shipmode, comment ){
    override def toString = "Lineitem"+super.toString
  }

// --
  class EmployeeSchema(
    val id : Rep[Int]
    ,val name : Rep[String]
    ,val workgroup_id : Rep[Int]
  ) extends Tuple3( id, name, workgroup_id ) with SchemaBase{
    override def toString = "EmployeeSchema"+super.toString
  }

  class WorkgroupSchema(
    val id : Rep[Int]
    ,val name : Rep[String]
  ) extends Tuple2( id, name ) with SchemaBase{
    override def toString = "WorkgroupSchema"+super.toString
  }

  class AmountsSchema(
    val country : Rep[String]
    ,val branch : Rep[String]
    ,val amount : Rep[Int]
  ) extends Tuple3( country, branch, amount ) with SchemaBase{
    override def toString = "AmountsSchema"+super.toString
  }

  class NationSchema(
    val nationkey : Rep[Int]
    ,val name : Rep[String]
    ,val regionkey : Rep[Int]
    ,val comment : Rep[String]
  ) extends Tuple4( nationkey, name, regionkey, comment ) with SchemaBase{
    override def toString = "NationSchema"+super.toString
  }

  class RegionSchema(
    val regionkey : Rep[Int]
    ,val name : Rep[String]
    ,val comment : Rep[String]
  ) extends Tuple3( regionkey, name, comment ) with SchemaBase{
    override def toString = "RegionSchema"+super.toString
  }

  class PartSchema(
    val partkey : Rep[Int]
    ,val name : Rep[String]
    ,val mfgr : Rep[String]
    ,val brand : Rep[String]
    ,val type_ : Rep[String]
    ,val size_ : Rep[Int]
    ,val container : Rep[String]
    ,val retailprice : Rep[Int]
    ,val comment : Rep[String]
  ) extends Tuple9( partkey, name, mfgr, brand, type_, size_, container, retailprice, comment ) with SchemaBase{
    override def toString = "PartSchema"+super.toString
  }

  class SupplierSchema(
    val suppkey : Rep[Int]
    ,val name : Rep[String]
    ,val address : Rep[String]
    ,val nationkey : Rep[Int]
    ,val phone : Rep[String]
    ,val acctbal : Rep[Int]
    ,val comment : Rep[String]
  ) extends Tuple7( suppkey, name, address, nationkey, phone, acctbal, comment ) with SchemaBase{
    override def toString = "SupplierSchema"+super.toString
  }

  class PartsuppSchema(
    val partkey : Rep[Int]
    ,val suppkey : Rep[Int]
    ,val availqty : Rep[Int]
    ,val supplycost : Rep[Int]
    ,val comment : Rep[String]
  ) extends Tuple5( partkey, suppkey, availqty, supplycost, comment ) with SchemaBase{
    override def toString = "PartsuppSchema"+super.toString
  }

  class CustomerSchema(
    val custkey : Rep[Int]
    ,val name : Rep[String]
    ,val address : Rep[String]
    ,val nationkey : Rep[Int]
    ,val phone : Rep[String]
    ,val acctbal : Rep[Int]
    ,val mktsegment : Rep[String]
    ,val comment : Rep[String]
  ) extends Tuple8( custkey, name, address, nationkey, phone, acctbal, mktsegment, comment ) with SchemaBase{
    override def toString = "CustomerSchema"+super.toString
  }

  class OrdersSchema(
    val orderkey : Rep[Int]
    ,val custkey : Rep[Int]
    ,val orderstatus : Rep[String]
    ,val totalprice : Rep[Int]
    ,val orderdate : Rep[String]
    ,val orderpriority : Rep[String]
    ,val clerk : Rep[String]
    ,val shippriority : Rep[Int]
    ,val comment : Rep[String]
  ) extends Tuple9( orderkey, custkey, orderstatus, totalprice, orderdate, orderpriority, clerk, shippriority, comment ) with SchemaBase{
    override def toString = "OrdersSchema"+super.toString
  }

  class LineitemSchema(
    val orderkey : Rep[Int]
    ,val partkey : Rep[Int]
    ,val suppkey : Rep[Int]
    ,val linenumber : Rep[Int]
    ,val quantity : Rep[Int]
    ,val extendedprice : Rep[Int]
    ,val discount : Rep[Int]
    ,val tax : Rep[Int]
    ,val returnflag : Rep[String]
    ,val linestatus : Rep[String]
    ,val shipdate : Rep[String]
    ,val commitdate : Rep[String]
    ,val receiptdate : Rep[String]
    ,val shipinstruct : Rep[String]
    ,val shipmode : Rep[String]
    ,val comment : Rep[String]
  ) extends Tuple16( orderkey, partkey, suppkey, linenumber, quantity, extendedprice, discount, tax, returnflag, linestatus, shipdate, commitdate, receiptdate, shipinstruct, shipmode, comment ) with SchemaBase{
    override def toString = "LineitemSchema"+super.toString
  }

// --
  class EmployeeGrouped(
    val id : Iterable[Int]
    ,val name : Iterable[String]
    ,val workgroup_id : Iterable[Int]
  ) extends Tuple3( id, name, workgroup_id ) with SchemaBase{
    override def toString = "EmployeeGrouped"+super.toString
  }

  class WorkgroupGrouped(
    val id : Iterable[Int]
    ,val name : Iterable[String]
  ) extends Tuple2( id, name ) with SchemaBase{
    override def toString = "WorkgroupGrouped"+super.toString
  }

  class AmountsGrouped(
    val country : Iterable[String]
    ,val branch : Iterable[String]
    ,val amount : Iterable[Int]
  ) extends Tuple3( country, branch, amount ) with SchemaBase{
    override def toString = "AmountsGrouped"+super.toString
  }

  class NationGrouped(
    val nationkey : Iterable[Int]
    ,val name : Iterable[String]
    ,val regionkey : Iterable[Int]
    ,val comment : Iterable[String]
  ) extends Tuple4( nationkey, name, regionkey, comment ) with SchemaBase{
    override def toString = "NationGrouped"+super.toString
  }

  class RegionGrouped(
    val regionkey : Iterable[Int]
    ,val name : Iterable[String]
    ,val comment : Iterable[String]
  ) extends Tuple3( regionkey, name, comment ) with SchemaBase{
    override def toString = "RegionGrouped"+super.toString
  }

  class PartGrouped(
    val partkey : Iterable[Int]
    ,val name : Iterable[String]
    ,val mfgr : Iterable[String]
    ,val brand : Iterable[String]
    ,val type_ : Iterable[String]
    ,val size_ : Iterable[Int]
    ,val container : Iterable[String]
    ,val retailprice : Iterable[Int]
    ,val comment : Iterable[String]
  ) extends Tuple9( partkey, name, mfgr, brand, type_, size_, container, retailprice, comment ) with SchemaBase{
    override def toString = "PartGrouped"+super.toString
  }

  class SupplierGrouped(
    val suppkey : Iterable[Int]
    ,val name : Iterable[String]
    ,val address : Iterable[String]
    ,val nationkey : Iterable[Int]
    ,val phone : Iterable[String]
    ,val acctbal : Iterable[Int]
    ,val comment : Iterable[String]
  ) extends Tuple7( suppkey, name, address, nationkey, phone, acctbal, comment ) with SchemaBase{
    override def toString = "SupplierGrouped"+super.toString
  }

  class PartsuppGrouped(
    val partkey : Iterable[Int]
    ,val suppkey : Iterable[Int]
    ,val availqty : Iterable[Int]
    ,val supplycost : Iterable[Int]
    ,val comment : Iterable[String]
  ) extends Tuple5( partkey, suppkey, availqty, supplycost, comment ) with SchemaBase{
    override def toString = "PartsuppGrouped"+super.toString
  }

  class CustomerGrouped(
    val custkey : Iterable[Int]
    ,val name : Iterable[String]
    ,val address : Iterable[String]
    ,val nationkey : Iterable[Int]
    ,val phone : Iterable[String]
    ,val acctbal : Iterable[Int]
    ,val mktsegment : Iterable[String]
    ,val comment : Iterable[String]
  ) extends Tuple8( custkey, name, address, nationkey, phone, acctbal, mktsegment, comment ) with SchemaBase{
    override def toString = "CustomerGrouped"+super.toString
  }

  class OrdersGrouped(
    val orderkey : Iterable[Int]
    ,val custkey : Iterable[Int]
    ,val orderstatus : Iterable[String]
    ,val totalprice : Iterable[Int]
    ,val orderdate : Iterable[String]
    ,val orderpriority : Iterable[String]
    ,val clerk : Iterable[String]
    ,val shippriority : Iterable[Int]
    ,val comment : Iterable[String]
  ) extends Tuple9( orderkey, custkey, orderstatus, totalprice, orderdate, orderpriority, clerk, shippriority, comment ) with SchemaBase{
    override def toString = "OrdersGrouped"+super.toString
  }

  class LineitemGrouped(
    val orderkey : Iterable[Int]
    ,val partkey : Iterable[Int]
    ,val suppkey : Iterable[Int]
    ,val linenumber : Iterable[Int]
    ,val quantity : Iterable[Int]
    ,val extendedprice : Iterable[Int]
    ,val discount : Iterable[Int]
    ,val tax : Iterable[Int]
    ,val returnflag : Iterable[String]
    ,val linestatus : Iterable[String]
    ,val shipdate : Iterable[String]
    ,val commitdate : Iterable[String]
    ,val receiptdate : Iterable[String]
    ,val shipinstruct : Iterable[String]
    ,val shipmode : Iterable[String]
    ,val comment : Iterable[String]
  ) extends Tuple16( orderkey, partkey, suppkey, linenumber, quantity, extendedprice, discount, tax, returnflag, linestatus, shipdate, commitdate, receiptdate, shipinstruct, shipmode, comment ) with SchemaBase{
    override def toString = "LineitemGrouped"+super.toString
  }

// --
  class EmployeeSchemaGrouped(
    val id : Rep[Iterable[Int]]
    ,val name : Rep[Iterable[String]]
    ,val workgroup_id : Rep[Iterable[Int]]
  ) extends Tuple3( id, name, workgroup_id ) with SchemaBase{
    override def toString = "EmployeeSchemaGrouped"+super.toString
  }

  class WorkgroupSchemaGrouped(
    val id : Rep[Iterable[Int]]
    ,val name : Rep[Iterable[String]]
  ) extends Tuple2( id, name ) with SchemaBase{
    override def toString = "WorkgroupSchemaGrouped"+super.toString
  }

  class AmountsSchemaGrouped(
    val country : Rep[Iterable[String]]
    ,val branch : Rep[Iterable[String]]
    ,val amount : Rep[Iterable[Int]]
  ) extends Tuple3( country, branch, amount ) with SchemaBase{
    override def toString = "AmountsSchemaGrouped"+super.toString
  }

  class NationSchemaGrouped(
    val nationkey : Rep[Iterable[Int]]
    ,val name : Rep[Iterable[String]]
    ,val regionkey : Rep[Iterable[Int]]
    ,val comment : Rep[Iterable[String]]
  ) extends Tuple4( nationkey, name, regionkey, comment ) with SchemaBase{
    override def toString = "NationSchemaGrouped"+super.toString
  }

  class RegionSchemaGrouped(
    val regionkey : Rep[Iterable[Int]]
    ,val name : Rep[Iterable[String]]
    ,val comment : Rep[Iterable[String]]
  ) extends Tuple3( regionkey, name, comment ) with SchemaBase{
    override def toString = "RegionSchemaGrouped"+super.toString
  }

  class PartSchemaGrouped(
    val partkey : Rep[Iterable[Int]]
    ,val name : Rep[Iterable[String]]
    ,val mfgr : Rep[Iterable[String]]
    ,val brand : Rep[Iterable[String]]
    ,val type_ : Rep[Iterable[String]]
    ,val size_ : Rep[Iterable[Int]]
    ,val container : Rep[Iterable[String]]
    ,val retailprice : Rep[Iterable[Int]]
    ,val comment : Rep[Iterable[String]]
  ) extends Tuple9( partkey, name, mfgr, brand, type_, size_, container, retailprice, comment ) with SchemaBase{
    override def toString = "PartSchemaGrouped"+super.toString
  }

  class SupplierSchemaGrouped(
    val suppkey : Rep[Iterable[Int]]
    ,val name : Rep[Iterable[String]]
    ,val address : Rep[Iterable[String]]
    ,val nationkey : Rep[Iterable[Int]]
    ,val phone : Rep[Iterable[String]]
    ,val acctbal : Rep[Iterable[Int]]
    ,val comment : Rep[Iterable[String]]
  ) extends Tuple7( suppkey, name, address, nationkey, phone, acctbal, comment ) with SchemaBase{
    override def toString = "SupplierSchemaGrouped"+super.toString
  }

  class PartsuppSchemaGrouped(
    val partkey : Rep[Iterable[Int]]
    ,val suppkey : Rep[Iterable[Int]]
    ,val availqty : Rep[Iterable[Int]]
    ,val supplycost : Rep[Iterable[Int]]
    ,val comment : Rep[Iterable[String]]
  ) extends Tuple5( partkey, suppkey, availqty, supplycost, comment ) with SchemaBase{
    override def toString = "PartsuppSchemaGrouped"+super.toString
  }

  class CustomerSchemaGrouped(
    val custkey : Rep[Iterable[Int]]
    ,val name : Rep[Iterable[String]]
    ,val address : Rep[Iterable[String]]
    ,val nationkey : Rep[Iterable[Int]]
    ,val phone : Rep[Iterable[String]]
    ,val acctbal : Rep[Iterable[Int]]
    ,val mktsegment : Rep[Iterable[String]]
    ,val comment : Rep[Iterable[String]]
  ) extends Tuple8( custkey, name, address, nationkey, phone, acctbal, mktsegment, comment ) with SchemaBase{
    override def toString = "CustomerSchemaGrouped"+super.toString
  }

  class OrdersSchemaGrouped(
    val orderkey : Rep[Iterable[Int]]
    ,val custkey : Rep[Iterable[Int]]
    ,val orderstatus : Rep[Iterable[String]]
    ,val totalprice : Rep[Iterable[Int]]
    ,val orderdate : Rep[Iterable[String]]
    ,val orderpriority : Rep[Iterable[String]]
    ,val clerk : Rep[Iterable[String]]
    ,val shippriority : Rep[Iterable[Int]]
    ,val comment : Rep[Iterable[String]]
  ) extends Tuple9( orderkey, custkey, orderstatus, totalprice, orderdate, orderpriority, clerk, shippriority, comment ) with SchemaBase{
    override def toString = "OrdersSchemaGrouped"+super.toString
  }

  class LineitemSchemaGrouped(
    val orderkey : Rep[Iterable[Int]]
    ,val partkey : Rep[Iterable[Int]]
    ,val suppkey : Rep[Iterable[Int]]
    ,val linenumber : Rep[Iterable[Int]]
    ,val quantity : Rep[Iterable[Int]]
    ,val extendedprice : Rep[Iterable[Int]]
    ,val discount : Rep[Iterable[Int]]
    ,val tax : Rep[Iterable[Int]]
    ,val returnflag : Rep[Iterable[String]]
    ,val linestatus : Rep[Iterable[String]]
    ,val shipdate : Rep[Iterable[String]]
    ,val commitdate : Rep[Iterable[String]]
    ,val receiptdate : Rep[Iterable[String]]
    ,val shipinstruct : Rep[Iterable[String]]
    ,val shipmode : Rep[Iterable[String]]
    ,val comment : Rep[Iterable[String]]
  ) extends Tuple16( orderkey, partkey, suppkey, linenumber, quantity, extendedprice, discount, tax, returnflag, linestatus, shipdate, commitdate, receiptdate, shipinstruct, shipmode, comment ) with SchemaBase{
    override def toString = "LineitemSchemaGrouped"+super.toString
  }


  implicit def rep2employee( r:Rep[Employee] ) : EmployeeSchema
  implicit def rep2employeegrouped( r:Rep[EmployeeGrouped] ) : EmployeeSchemaGrouped
  trait IEmployeeGroupable{
    def groupBy( f:EmployeeSchema => Rep[_] ) : Rep[Iterable[EmployeeGrouped]]
  }
  implicit def rep2employeegroupable( r: Rep[Iterable[Employee]] ) : IEmployeeGroupable
  implicit def rep2workgroup( r:Rep[Workgroup] ) : WorkgroupSchema
  implicit def rep2workgroupgrouped( r:Rep[WorkgroupGrouped] ) : WorkgroupSchemaGrouped
  trait IWorkgroupGroupable{
    def groupBy( f:WorkgroupSchema => Rep[_] ) : Rep[Iterable[WorkgroupGrouped]]
  }
  implicit def rep2workgroupgroupable( r: Rep[Iterable[Workgroup]] ) : IWorkgroupGroupable
  implicit def rep2amounts( r:Rep[Amounts] ) : AmountsSchema
  implicit def rep2amountsgrouped( r:Rep[AmountsGrouped] ) : AmountsSchemaGrouped
  trait IAmountsGroupable{
    def groupBy( f:AmountsSchema => Rep[_] ) : Rep[Iterable[AmountsGrouped]]
  }
  implicit def rep2amountsgroupable( r: Rep[Iterable[Amounts]] ) : IAmountsGroupable
  implicit def rep2nation( r:Rep[Nation] ) : NationSchema
  implicit def rep2nationgrouped( r:Rep[NationGrouped] ) : NationSchemaGrouped
  trait INationGroupable{
    def groupBy( f:NationSchema => Rep[_] ) : Rep[Iterable[NationGrouped]]
  }
  implicit def rep2nationgroupable( r: Rep[Iterable[Nation]] ) : INationGroupable
  implicit def rep2region( r:Rep[Region] ) : RegionSchema
  implicit def rep2regiongrouped( r:Rep[RegionGrouped] ) : RegionSchemaGrouped
  trait IRegionGroupable{
    def groupBy( f:RegionSchema => Rep[_] ) : Rep[Iterable[RegionGrouped]]
  }
  implicit def rep2regiongroupable( r: Rep[Iterable[Region]] ) : IRegionGroupable
  implicit def rep2part( r:Rep[Part] ) : PartSchema
  implicit def rep2partgrouped( r:Rep[PartGrouped] ) : PartSchemaGrouped
  trait IPartGroupable{
    def groupBy( f:PartSchema => Rep[_] ) : Rep[Iterable[PartGrouped]]
  }
  implicit def rep2partgroupable( r: Rep[Iterable[Part]] ) : IPartGroupable
  implicit def rep2supplier( r:Rep[Supplier] ) : SupplierSchema
  implicit def rep2suppliergrouped( r:Rep[SupplierGrouped] ) : SupplierSchemaGrouped
  trait ISupplierGroupable{
    def groupBy( f:SupplierSchema => Rep[_] ) : Rep[Iterable[SupplierGrouped]]
  }
  implicit def rep2suppliergroupable( r: Rep[Iterable[Supplier]] ) : ISupplierGroupable
  implicit def rep2partsupp( r:Rep[Partsupp] ) : PartsuppSchema
  implicit def rep2partsuppgrouped( r:Rep[PartsuppGrouped] ) : PartsuppSchemaGrouped
  trait IPartsuppGroupable{
    def groupBy( f:PartsuppSchema => Rep[_] ) : Rep[Iterable[PartsuppGrouped]]
  }
  implicit def rep2partsuppgroupable( r: Rep[Iterable[Partsupp]] ) : IPartsuppGroupable
  implicit def rep2customer( r:Rep[Customer] ) : CustomerSchema
  implicit def rep2customergrouped( r:Rep[CustomerGrouped] ) : CustomerSchemaGrouped
  trait ICustomerGroupable{
    def groupBy( f:CustomerSchema => Rep[_] ) : Rep[Iterable[CustomerGrouped]]
  }
  implicit def rep2customergroupable( r: Rep[Iterable[Customer]] ) : ICustomerGroupable
  implicit def rep2orders( r:Rep[Orders] ) : OrdersSchema
  implicit def rep2ordersgrouped( r:Rep[OrdersGrouped] ) : OrdersSchemaGrouped
  trait IOrdersGroupable{
    def groupBy( f:OrdersSchema => Rep[_] ) : Rep[Iterable[OrdersGrouped]]
  }
  implicit def rep2ordersgroupable( r: Rep[Iterable[Orders]] ) : IOrdersGroupable
  implicit def rep2lineitem( r:Rep[Lineitem] ) : LineitemSchema
  implicit def rep2lineitemgrouped( r:Rep[LineitemGrouped] ) : LineitemSchemaGrouped
  trait ILineitemGroupable{
    def groupBy( f:LineitemSchema => Rep[_] ) : Rep[Iterable[LineitemGrouped]]
  }
  implicit def rep2lineitemgroupable( r: Rep[Iterable[Lineitem]] ) : ILineitemGroupable

  def zip( r:Rep[EmployeeGrouped] )(implicit o0: Overloaded0, o1: Overloaded0 ) : Rep[Iterable[Employee]]
  def zip( r:Rep[WorkgroupGrouped] )(implicit o0: Overloaded0, o1: Overloaded1 ) : Rep[Iterable[Workgroup]]
  def zip( r:Rep[AmountsGrouped] )(implicit o0: Overloaded0, o1: Overloaded2 ) : Rep[Iterable[Amounts]]
  def zip( r:Rep[NationGrouped] )(implicit o0: Overloaded0, o1: Overloaded3 ) : Rep[Iterable[Nation]]
  def zip( r:Rep[RegionGrouped] )(implicit o0: Overloaded0, o1: Overloaded4 ) : Rep[Iterable[Region]]
  def zip( r:Rep[PartGrouped] )(implicit o0: Overloaded0, o1: Overloaded5 ) : Rep[Iterable[Part]]
  def zip( r:Rep[SupplierGrouped] )(implicit o0: Overloaded0, o1: Overloaded6 ) : Rep[Iterable[Supplier]]
  def zip( r:Rep[PartsuppGrouped] )(implicit o0: Overloaded0, o1: Overloaded7 ) : Rep[Iterable[Partsupp]]
  def zip( r:Rep[CustomerGrouped] )(implicit o0: Overloaded0, o1: Overloaded8 ) : Rep[Iterable[Customer]]
  def zip( r:Rep[OrdersGrouped] )(implicit o0: Overloaded0, o1: Overloaded9 ) : Rep[Iterable[Orders]]
  def zip( r:Rep[LineitemGrouped] )(implicit o0: Overloaded0, o1: Overloaded10 ) : Rep[Iterable[Lineitem]]
}

trait Schema extends ISchema with Comprehensions{

  case class ZipEmployee( target:Rep[EmployeeGrouped] ) extends Generator[Employee](
    toAtom( new LiftedSchema[EmployeeSchema,Employee](
      new EmployeeSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
        ,toAtom(Zipped(target._3))
    )))
  ) with Zip
  def zip( r:Rep[EmployeeGrouped] )(implicit o0: Overloaded0, o1: Overloaded0 )  = ZipEmployee(r)
  case class ZipWorkgroup( target:Rep[WorkgroupGrouped] ) extends Generator[Workgroup](
    toAtom( new LiftedSchema[WorkgroupSchema,Workgroup](
      new WorkgroupSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
    )))
  ) with Zip
  def zip( r:Rep[WorkgroupGrouped] )(implicit o0: Overloaded0, o1: Overloaded1 )  = ZipWorkgroup(r)
  case class ZipAmounts( target:Rep[AmountsGrouped] ) extends Generator[Amounts](
    toAtom( new LiftedSchema[AmountsSchema,Amounts](
      new AmountsSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
        ,toAtom(Zipped(target._3))
    )))
  ) with Zip
  def zip( r:Rep[AmountsGrouped] )(implicit o0: Overloaded0, o1: Overloaded2 )  = ZipAmounts(r)
  case class ZipNation( target:Rep[NationGrouped] ) extends Generator[Nation](
    toAtom( new LiftedSchema[NationSchema,Nation](
      new NationSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
        ,toAtom(Zipped(target._3))
        ,toAtom(Zipped(target._4))
    )))
  ) with Zip
  def zip( r:Rep[NationGrouped] )(implicit o0: Overloaded0, o1: Overloaded3 )  = ZipNation(r)
  case class ZipRegion( target:Rep[RegionGrouped] ) extends Generator[Region](
    toAtom( new LiftedSchema[RegionSchema,Region](
      new RegionSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
        ,toAtom(Zipped(target._3))
    )))
  ) with Zip
  def zip( r:Rep[RegionGrouped] )(implicit o0: Overloaded0, o1: Overloaded4 )  = ZipRegion(r)
  case class ZipPart( target:Rep[PartGrouped] ) extends Generator[Part](
    toAtom( new LiftedSchema[PartSchema,Part](
      new PartSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
        ,toAtom(Zipped(target._3))
        ,toAtom(Zipped(target._4))
        ,toAtom(Zipped(target._5))
        ,toAtom(Zipped(target._6))
        ,toAtom(Zipped(target._7))
        ,toAtom(Zipped(target._8))
        ,toAtom(Zipped(target._9))
    )))
  ) with Zip
  def zip( r:Rep[PartGrouped] )(implicit o0: Overloaded0, o1: Overloaded5 )  = ZipPart(r)
  case class ZipSupplier( target:Rep[SupplierGrouped] ) extends Generator[Supplier](
    toAtom( new LiftedSchema[SupplierSchema,Supplier](
      new SupplierSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
        ,toAtom(Zipped(target._3))
        ,toAtom(Zipped(target._4))
        ,toAtom(Zipped(target._5))
        ,toAtom(Zipped(target._6))
        ,toAtom(Zipped(target._7))
    )))
  ) with Zip
  def zip( r:Rep[SupplierGrouped] )(implicit o0: Overloaded0, o1: Overloaded6 )  = ZipSupplier(r)
  case class ZipPartsupp( target:Rep[PartsuppGrouped] ) extends Generator[Partsupp](
    toAtom( new LiftedSchema[PartsuppSchema,Partsupp](
      new PartsuppSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
        ,toAtom(Zipped(target._3))
        ,toAtom(Zipped(target._4))
        ,toAtom(Zipped(target._5))
    )))
  ) with Zip
  def zip( r:Rep[PartsuppGrouped] )(implicit o0: Overloaded0, o1: Overloaded7 )  = ZipPartsupp(r)
  case class ZipCustomer( target:Rep[CustomerGrouped] ) extends Generator[Customer](
    toAtom( new LiftedSchema[CustomerSchema,Customer](
      new CustomerSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
        ,toAtom(Zipped(target._3))
        ,toAtom(Zipped(target._4))
        ,toAtom(Zipped(target._5))
        ,toAtom(Zipped(target._6))
        ,toAtom(Zipped(target._7))
        ,toAtom(Zipped(target._8))
    )))
  ) with Zip
  def zip( r:Rep[CustomerGrouped] )(implicit o0: Overloaded0, o1: Overloaded8 )  = ZipCustomer(r)
  case class ZipOrders( target:Rep[OrdersGrouped] ) extends Generator[Orders](
    toAtom( new LiftedSchema[OrdersSchema,Orders](
      new OrdersSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
        ,toAtom(Zipped(target._3))
        ,toAtom(Zipped(target._4))
        ,toAtom(Zipped(target._5))
        ,toAtom(Zipped(target._6))
        ,toAtom(Zipped(target._7))
        ,toAtom(Zipped(target._8))
        ,toAtom(Zipped(target._9))
    )))
  ) with Zip
  def zip( r:Rep[OrdersGrouped] )(implicit o0: Overloaded0, o1: Overloaded9 )  = ZipOrders(r)
  case class ZipLineitem( target:Rep[LineitemGrouped] ) extends Generator[Lineitem](
    toAtom( new LiftedSchema[LineitemSchema,Lineitem](
      new LineitemSchema(
        toAtom(Zipped(target._1))
        ,toAtom(Zipped(target._2))
        ,toAtom(Zipped(target._3))
        ,toAtom(Zipped(target._4))
        ,toAtom(Zipped(target._5))
        ,toAtom(Zipped(target._6))
        ,toAtom(Zipped(target._7))
        ,toAtom(Zipped(target._8))
        ,toAtom(Zipped(target._9))
        ,toAtom(Zipped(target._10))
        ,toAtom(Zipped(target._11))
        ,toAtom(Zipped(target._12))
        ,toAtom(Zipped(target._13))
        ,toAtom(Zipped(target._14))
        ,toAtom(Zipped(target._15))
        ,toAtom(Zipped(target._16))
    )))
  ) with Zip
  def zip( r:Rep[LineitemGrouped] )(implicit o0: Overloaded0, o1: Overloaded10 )  = ZipLineitem(r)

  implicit def rep2employeegroupable( r: Rep[Iterable[Employee]] ) = EmployeeGroupable(rep2generator(r))

  case class EmployeeGroupable( g:Generator[Employee] ) extends IEmployeeGroupable{
    def groupBy( f:EmployeeSchema => Rep[_] ) : Rep[Iterable[EmployeeGrouped]] = {
        val cols = rep2tuple3(g.element_references)
        val groups = Tuple3(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
        )
        new Comprehension[ EmployeeGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new EmployeeSchema(cols._1,cols._2,cols._3) ))
        )
    }
  }
  implicit def rep2workgroupgroupable( r: Rep[Iterable[Workgroup]] ) = WorkgroupGroupable(rep2generator(r))

  case class WorkgroupGroupable( g:Generator[Workgroup] ) extends IWorkgroupGroupable{
    def groupBy( f:WorkgroupSchema => Rep[_] ) : Rep[Iterable[WorkgroupGrouped]] = {
        val cols = rep2tuple2(g.element_references)
        val groups = Tuple2(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
        )
        new Comprehension[ WorkgroupGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new WorkgroupSchema(cols._1,cols._2) ))
        )
    }
  }
  implicit def rep2amountsgroupable( r: Rep[Iterable[Amounts]] ) = AmountsGroupable(rep2generator(r))

  case class AmountsGroupable( g:Generator[Amounts] ) extends IAmountsGroupable{
    def groupBy( f:AmountsSchema => Rep[_] ) : Rep[Iterable[AmountsGrouped]] = {
        val cols = rep2tuple3(g.element_references)
        val groups = Tuple3(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
        )
        new Comprehension[ AmountsGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new AmountsSchema(cols._1,cols._2,cols._3) ))
        )
    }
  }
  implicit def rep2nationgroupable( r: Rep[Iterable[Nation]] ) = NationGroupable(rep2generator(r))

  case class NationGroupable( g:Generator[Nation] ) extends INationGroupable{
    def groupBy( f:NationSchema => Rep[_] ) : Rep[Iterable[NationGrouped]] = {
        val cols = rep2tuple4(g.element_references)
        val groups = Tuple4(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
        )
        new Comprehension[ NationGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new NationSchema(cols._1,cols._2,cols._3,cols._4) ))
        )
    }
  }
  implicit def rep2regiongroupable( r: Rep[Iterable[Region]] ) = RegionGroupable(rep2generator(r))

  case class RegionGroupable( g:Generator[Region] ) extends IRegionGroupable{
    def groupBy( f:RegionSchema => Rep[_] ) : Rep[Iterable[RegionGrouped]] = {
        val cols = rep2tuple3(g.element_references)
        val groups = Tuple3(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
        )
        new Comprehension[ RegionGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new RegionSchema(cols._1,cols._2,cols._3) ))
        )
    }
  }
  implicit def rep2partgroupable( r: Rep[Iterable[Part]] ) = PartGroupable(rep2generator(r))

  case class PartGroupable( g:Generator[Part] ) extends IPartGroupable{
    def groupBy( f:PartSchema => Rep[_] ) : Rep[Iterable[PartGrouped]] = {
        val cols = rep2tuple9(g.element_references)
        val groups = Tuple9(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
          ,toAtom(Grouped(cols._5))
          ,toAtom(Grouped(cols._6))
          ,toAtom(Grouped(cols._7))
          ,toAtom(Grouped(cols._8))
          ,toAtom(Grouped(cols._9))
        )
        new Comprehension[ PartGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new PartSchema(cols._1,cols._2,cols._3,cols._4,cols._5,cols._6,cols._7,cols._8,cols._9) ))
        )
    }
  }
  implicit def rep2suppliergroupable( r: Rep[Iterable[Supplier]] ) = SupplierGroupable(rep2generator(r))

  case class SupplierGroupable( g:Generator[Supplier] ) extends ISupplierGroupable{
    def groupBy( f:SupplierSchema => Rep[_] ) : Rep[Iterable[SupplierGrouped]] = {
        val cols = rep2tuple7(g.element_references)
        val groups = Tuple7(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
          ,toAtom(Grouped(cols._5))
          ,toAtom(Grouped(cols._6))
          ,toAtom(Grouped(cols._7))
        )
        new Comprehension[ SupplierGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new SupplierSchema(cols._1,cols._2,cols._3,cols._4,cols._5,cols._6,cols._7) ))
        )
    }
  }
  implicit def rep2partsuppgroupable( r: Rep[Iterable[Partsupp]] ) = PartsuppGroupable(rep2generator(r))

  case class PartsuppGroupable( g:Generator[Partsupp] ) extends IPartsuppGroupable{
    def groupBy( f:PartsuppSchema => Rep[_] ) : Rep[Iterable[PartsuppGrouped]] = {
        val cols = rep2tuple5(g.element_references)
        val groups = Tuple5(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
          ,toAtom(Grouped(cols._5))
        )
        new Comprehension[ PartsuppGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new PartsuppSchema(cols._1,cols._2,cols._3,cols._4,cols._5) ))
        )
    }
  }
  implicit def rep2customergroupable( r: Rep[Iterable[Customer]] ) = CustomerGroupable(rep2generator(r))

  case class CustomerGroupable( g:Generator[Customer] ) extends ICustomerGroupable{
    def groupBy( f:CustomerSchema => Rep[_] ) : Rep[Iterable[CustomerGrouped]] = {
        val cols = rep2tuple8(g.element_references)
        val groups = Tuple8(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
          ,toAtom(Grouped(cols._5))
          ,toAtom(Grouped(cols._6))
          ,toAtom(Grouped(cols._7))
          ,toAtom(Grouped(cols._8))
        )
        new Comprehension[ CustomerGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new CustomerSchema(cols._1,cols._2,cols._3,cols._4,cols._5,cols._6,cols._7,cols._8) ))
        )
    }
  }
  implicit def rep2ordersgroupable( r: Rep[Iterable[Orders]] ) = OrdersGroupable(rep2generator(r))

  case class OrdersGroupable( g:Generator[Orders] ) extends IOrdersGroupable{
    def groupBy( f:OrdersSchema => Rep[_] ) : Rep[Iterable[OrdersGrouped]] = {
        val cols = rep2tuple9(g.element_references)
        val groups = Tuple9(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
          ,toAtom(Grouped(cols._5))
          ,toAtom(Grouped(cols._6))
          ,toAtom(Grouped(cols._7))
          ,toAtom(Grouped(cols._8))
          ,toAtom(Grouped(cols._9))
        )
        new Comprehension[ OrdersGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new OrdersSchema(cols._1,cols._2,cols._3,cols._4,cols._5,cols._6,cols._7,cols._8,cols._9) ))
        )
    }
  }
  implicit def rep2lineitemgroupable( r: Rep[Iterable[Lineitem]] ) = LineitemGroupable(rep2generator(r))

  case class LineitemGroupable( g:Generator[Lineitem] ) extends ILineitemGroupable{
    def groupBy( f:LineitemSchema => Rep[_] ) : Rep[Iterable[LineitemGrouped]] = {
        val cols = rep2tuple16(g.element_references)
        val groups = Tuple16(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
          ,toAtom(Grouped(cols._5))
          ,toAtom(Grouped(cols._6))
          ,toAtom(Grouped(cols._7))
          ,toAtom(Grouped(cols._8))
          ,toAtom(Grouped(cols._9))
          ,toAtom(Grouped(cols._10))
          ,toAtom(Grouped(cols._11))
          ,toAtom(Grouped(cols._12))
          ,toAtom(Grouped(cols._13))
          ,toAtom(Grouped(cols._14))
          ,toAtom(Grouped(cols._15))
          ,toAtom(Grouped(cols._16))
        )
        new Comprehension[ LineitemGrouped ](
          List[Rep[Iterable[_]]](toAtom(g))
          , replace_with_references(groups, g)
          , groupBy = Some(f( new LineitemSchema(cols._1,cols._2,cols._3,cols._4,cols._5,cols._6,cols._7,cols._8,cols._9,cols._10,cols._11,cols._12,cols._13,cols._14,cols._15,cols._16) ))
        )
    }
  }

  implicit def rep2employee( r:Rep[Employee] ) = {
    val t = rep2tuple3(r);
    new EmployeeSchema(t._1,t._2,t._3)
  }
  implicit def rep2employeegrouped( r:Rep[EmployeeGrouped] ) = {
    val t = rep2tuple3(r);
    new EmployeeSchemaGrouped(t._1,t._2,t._3)
  }
  implicit def rep2workgroup( r:Rep[Workgroup] ) = {
    val t = rep2tuple2(r);
    new WorkgroupSchema(t._1,t._2)
  }
  implicit def rep2workgroupgrouped( r:Rep[WorkgroupGrouped] ) = {
    val t = rep2tuple2(r);
    new WorkgroupSchemaGrouped(t._1,t._2)
  }
  implicit def rep2amounts( r:Rep[Amounts] ) = {
    val t = rep2tuple3(r);
    new AmountsSchema(t._1,t._2,t._3)
  }
  implicit def rep2amountsgrouped( r:Rep[AmountsGrouped] ) = {
    val t = rep2tuple3(r);
    new AmountsSchemaGrouped(t._1,t._2,t._3)
  }
  implicit def rep2nation( r:Rep[Nation] ) = {
    val t = rep2tuple4(r);
    new NationSchema(t._1,t._2,t._3,t._4)
  }
  implicit def rep2nationgrouped( r:Rep[NationGrouped] ) = {
    val t = rep2tuple4(r);
    new NationSchemaGrouped(t._1,t._2,t._3,t._4)
  }
  implicit def rep2region( r:Rep[Region] ) = {
    val t = rep2tuple3(r);
    new RegionSchema(t._1,t._2,t._3)
  }
  implicit def rep2regiongrouped( r:Rep[RegionGrouped] ) = {
    val t = rep2tuple3(r);
    new RegionSchemaGrouped(t._1,t._2,t._3)
  }
  implicit def rep2part( r:Rep[Part] ) = {
    val t = rep2tuple9(r);
    new PartSchema(t._1,t._2,t._3,t._4,t._5,t._6,t._7,t._8,t._9)
  }
  implicit def rep2partgrouped( r:Rep[PartGrouped] ) = {
    val t = rep2tuple9(r);
    new PartSchemaGrouped(t._1,t._2,t._3,t._4,t._5,t._6,t._7,t._8,t._9)
  }
  implicit def rep2supplier( r:Rep[Supplier] ) = {
    val t = rep2tuple7(r);
    new SupplierSchema(t._1,t._2,t._3,t._4,t._5,t._6,t._7)
  }
  implicit def rep2suppliergrouped( r:Rep[SupplierGrouped] ) = {
    val t = rep2tuple7(r);
    new SupplierSchemaGrouped(t._1,t._2,t._3,t._4,t._5,t._6,t._7)
  }
  implicit def rep2partsupp( r:Rep[Partsupp] ) = {
    val t = rep2tuple5(r);
    new PartsuppSchema(t._1,t._2,t._3,t._4,t._5)
  }
  implicit def rep2partsuppgrouped( r:Rep[PartsuppGrouped] ) = {
    val t = rep2tuple5(r);
    new PartsuppSchemaGrouped(t._1,t._2,t._3,t._4,t._5)
  }
  implicit def rep2customer( r:Rep[Customer] ) = {
    val t = rep2tuple8(r);
    new CustomerSchema(t._1,t._2,t._3,t._4,t._5,t._6,t._7,t._8)
  }
  implicit def rep2customergrouped( r:Rep[CustomerGrouped] ) = {
    val t = rep2tuple8(r);
    new CustomerSchemaGrouped(t._1,t._2,t._3,t._4,t._5,t._6,t._7,t._8)
  }
  implicit def rep2orders( r:Rep[Orders] ) = {
    val t = rep2tuple9(r);
    new OrdersSchema(t._1,t._2,t._3,t._4,t._5,t._6,t._7,t._8,t._9)
  }
  implicit def rep2ordersgrouped( r:Rep[OrdersGrouped] ) = {
    val t = rep2tuple9(r);
    new OrdersSchemaGrouped(t._1,t._2,t._3,t._4,t._5,t._6,t._7,t._8,t._9)
  }
  implicit def rep2lineitem( r:Rep[Lineitem] ) = {
    val t = rep2tuple16(r);
    new LineitemSchema(t._1,t._2,t._3,t._4,t._5,t._6,t._7,t._8,t._9,t._10,t._11,t._12,t._13,t._14,t._15,t._16)
  }
  implicit def rep2lineitemgrouped( r:Rep[LineitemGrouped] ) = {
    val t = rep2tuple16(r);
    new LineitemSchemaGrouped(t._1,t._2,t._3,t._4,t._5,t._6,t._7,t._8,t._9,t._10,t._11,t._12,t._13,t._14,t._15,t._16)
  }

  def createModelInstance( m:Manifest[_], values:scala.collection.mutable.Stack[Any] ) : AnyRef = {
    def getn( n:Int, values:scala.collection.mutable.Stack[Any] ) = {
      Range(0,n).map( _ => values.pop )
    }
    m.erasure.toString.dropWhile( c => c != '$' ).drop(1) match{
      case "Employee" => {
        val v = getn(3,values);
        new Employee(
          v(0).toString.toDouble.toInt
          ,v(1).toString
          ,v(2).toString.toDouble.toInt
        )
      }
      case "EmployeeGrouped" => {
        val v = getn(3,values);
        new EmployeeGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(2).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
        )
      }
      case "Workgroup" => {
        val v = getn(2,values);
        new Workgroup(
          v(0).toString.toDouble.toInt
          ,v(1).toString
        )
      }
      case "WorkgroupGrouped" => {
        val v = getn(2,values);
        new WorkgroupGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
        )
      }
      case "Amounts" => {
        val v = getn(3,values);
        new Amounts(
          v(0).toString
          ,v(1).toString
          ,v(2).toString.toDouble.toInt
        )
      }
      case "AmountsGrouped" => {
        val v = getn(3,values);
        new AmountsGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(2).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
        )
      }
      case "Nation" => {
        val v = getn(4,values);
        new Nation(
          v(0).toString.toDouble.toInt
          ,v(1).toString
          ,v(2).toString.toDouble.toInt
          ,v(3).toString
        )
      }
      case "NationGrouped" => {
        val v = getn(4,values);
        new NationGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(2).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(3).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
        )
      }
      case "Region" => {
        val v = getn(3,values);
        new Region(
          v(0).toString.toDouble.toInt
          ,v(1).toString
          ,v(2).toString
        )
      }
      case "RegionGrouped" => {
        val v = getn(3,values);
        new RegionGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(2).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
        )
      }
      case "Part" => {
        val v = getn(9,values);
        new Part(
          v(0).toString.toDouble.toInt
          ,v(1).toString
          ,v(2).toString
          ,v(3).toString
          ,v(4).toString
          ,v(5).toString.toDouble.toInt
          ,v(6).toString
          ,v(7).toString.toDouble.toInt
          ,v(8).toString
        )
      }
      case "PartGrouped" => {
        val v = getn(9,values);
        new PartGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(2).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(3).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(4).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(5).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(6).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(7).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(8).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
        )
      }
      case "Supplier" => {
        val v = getn(7,values);
        new Supplier(
          v(0).toString.toDouble.toInt
          ,v(1).toString
          ,v(2).toString
          ,v(3).toString.toDouble.toInt
          ,v(4).toString
          ,v(5).toString.toDouble.toInt
          ,v(6).toString
        )
      }
      case "SupplierGrouped" => {
        val v = getn(7,values);
        new SupplierGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(2).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(3).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(4).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(5).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(6).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
        )
      }
      case "Partsupp" => {
        val v = getn(5,values);
        new Partsupp(
          v(0).toString.toDouble.toInt
          ,v(1).toString.toDouble.toInt
          ,v(2).toString.toDouble.toInt
          ,v(3).toString.toDouble.toInt
          ,v(4).toString
        )
      }
      case "PartsuppGrouped" => {
        val v = getn(5,values);
        new PartsuppGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(2).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(3).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(4).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
        )
      }
      case "Customer" => {
        val v = getn(8,values);
        new Customer(
          v(0).toString.toDouble.toInt
          ,v(1).toString
          ,v(2).toString
          ,v(3).toString.toDouble.toInt
          ,v(4).toString
          ,v(5).toString.toDouble.toInt
          ,v(6).toString
          ,v(7).toString
        )
      }
      case "CustomerGrouped" => {
        val v = getn(8,values);
        new CustomerGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(2).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(3).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(4).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(5).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(6).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(7).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
        )
      }
      case "Orders" => {
        val v = getn(9,values);
        new Orders(
          v(0).toString.toDouble.toInt
          ,v(1).toString.toDouble.toInt
          ,v(2).toString
          ,v(3).toString.toDouble.toInt
          ,v(4).toString
          ,v(5).toString
          ,v(6).toString
          ,v(7).toString.toDouble.toInt
          ,v(8).toString
        )
      }
      case "OrdersGrouped" => {
        val v = getn(9,values);
        new OrdersGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(2).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(3).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(4).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(5).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(6).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(7).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(8).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
        )
      }
      case "Lineitem" => {
        val v = getn(16,values);
        new Lineitem(
          v(0).toString.toDouble.toInt
          ,v(1).toString.toDouble.toInt
          ,v(2).toString.toDouble.toInt
          ,v(3).toString.toDouble.toInt
          ,v(4).toString.toDouble.toInt
          ,v(5).toString.toDouble.toInt
          ,v(6).toString.toDouble.toInt
          ,v(7).toString.toDouble.toInt
          ,v(8).toString
          ,v(9).toString
          ,v(10).toString
          ,v(11).toString
          ,v(12).toString
          ,v(13).toString
          ,v(14).toString
          ,v(15).toString
        )
      }
      case "LineitemGrouped" => {
        val v = getn(16,values);
        new LineitemGrouped(
          v(0).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(1).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(2).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(3).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(4).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(5).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(6).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(7).asInstanceOf[List[_]].map(x => x.toString.toDouble.toInt).asInstanceOf[List[Int]]
          ,v(8).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(9).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(10).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(11).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(12).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(13).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(14).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
          ,v(15).asInstanceOf[List[_]].map(x => x.toString).asInstanceOf[List[String]]
        )
      }
    }
  }

  val tables = new Tables{
    var alias_counter = 0
    def employee = {
      val schema_ = new EmployeeSchema(
        toAtom(Column[Int]( "id", "Int" ))
        ,toAtom(Column[String]( "name", "String" ))
        ,toAtom(Column[Int]( "workgroup_id", "Int" ))
      )
      new Table[Employee](
        "employee",
        toAtom( new LiftedSchema[EmployeeSchema,Employee](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.id).asInstanceOf[Column[_]]
          ,rep2def(schema.name).asInstanceOf[Column[_]]
          ,rep2def(schema.workgroup_id).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.id).asInstanceOf[Column[_]]
        )
      }
    }
    def workgroup = {
      val schema_ = new WorkgroupSchema(
        toAtom(Column[Int]( "id", "Int" ))
        ,toAtom(Column[String]( "name", "String" ))
      )
      new Table[Workgroup](
        "workgroup",
        toAtom( new LiftedSchema[WorkgroupSchema,Workgroup](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.id).asInstanceOf[Column[_]]
          ,rep2def(schema.name).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.id).asInstanceOf[Column[_]]
        )
      }
    }
    def amounts = {
      val schema_ = new AmountsSchema(
        toAtom(Column[String]( "country", "String" ))
        ,toAtom(Column[String]( "branch", "String" ))
        ,toAtom(Column[Int]( "amount", "Int" ))
      )
      new Table[Amounts](
        "countries_budgets",
        toAtom( new LiftedSchema[AmountsSchema,Amounts](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.country).asInstanceOf[Column[_]]
          ,rep2def(schema.branch).asInstanceOf[Column[_]]
          ,rep2def(schema.amount).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.country).asInstanceOf[Column[_]]
          ,rep2def(schema.branch).asInstanceOf[Column[_]]
        )
      }
    }
    def nation = {
      val schema_ = new NationSchema(
        toAtom(Column[Int]( "nationkey", "Int" ))
        ,toAtom(Column[String]( "name", "String" ))
        ,toAtom(Column[Int]( "regionkey", "Int" ))
        ,toAtom(Column[String]( "comment", "String" ))
      )
      new Table[Nation](
        "nation",
        toAtom( new LiftedSchema[NationSchema,Nation](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.nationkey).asInstanceOf[Column[_]]
          ,rep2def(schema.name).asInstanceOf[Column[_]]
          ,rep2def(schema.regionkey).asInstanceOf[Column[_]]
          ,rep2def(schema.comment).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.nationkey).asInstanceOf[Column[_]]
        )
      }
    }
    def region = {
      val schema_ = new RegionSchema(
        toAtom(Column[Int]( "regionkey", "Int" ))
        ,toAtom(Column[String]( "name", "String" ))
        ,toAtom(Column[String]( "comment", "String" ))
      )
      new Table[Region](
        "region",
        toAtom( new LiftedSchema[RegionSchema,Region](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.regionkey).asInstanceOf[Column[_]]
          ,rep2def(schema.name).asInstanceOf[Column[_]]
          ,rep2def(schema.comment).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.regionkey).asInstanceOf[Column[_]]
        )
      }
    }
    def part = {
      val schema_ = new PartSchema(
        toAtom(Column[Int]( "partkey", "Int" ))
        ,toAtom(Column[String]( "name", "String" ))
        ,toAtom(Column[String]( "mfgr", "String" ))
        ,toAtom(Column[String]( "brand", "String" ))
        ,toAtom(Column[String]( "type_", "String" ))
        ,toAtom(Column[Int]( "size_", "Int" ))
        ,toAtom(Column[String]( "container", "String" ))
        ,toAtom(Column[Int]( "retailprice", "Int" ))
        ,toAtom(Column[String]( "comment", "String" ))
      )
      new Table[Part](
        "part",
        toAtom( new LiftedSchema[PartSchema,Part](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.partkey).asInstanceOf[Column[_]]
          ,rep2def(schema.name).asInstanceOf[Column[_]]
          ,rep2def(schema.mfgr).asInstanceOf[Column[_]]
          ,rep2def(schema.brand).asInstanceOf[Column[_]]
          ,rep2def(schema.type_).asInstanceOf[Column[_]]
          ,rep2def(schema.size_).asInstanceOf[Column[_]]
          ,rep2def(schema.container).asInstanceOf[Column[_]]
          ,rep2def(schema.retailprice).asInstanceOf[Column[_]]
          ,rep2def(schema.comment).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.partkey).asInstanceOf[Column[_]]
        )
      }
    }
    def supplier = {
      val schema_ = new SupplierSchema(
        toAtom(Column[Int]( "suppkey", "Int" ))
        ,toAtom(Column[String]( "name", "String" ))
        ,toAtom(Column[String]( "address", "String" ))
        ,toAtom(Column[Int]( "nationkey", "Int" ))
        ,toAtom(Column[String]( "phone", "String" ))
        ,toAtom(Column[Int]( "acctbal", "Int" ))
        ,toAtom(Column[String]( "comment", "String" ))
      )
      new Table[Supplier](
        "supplier",
        toAtom( new LiftedSchema[SupplierSchema,Supplier](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.suppkey).asInstanceOf[Column[_]]
          ,rep2def(schema.name).asInstanceOf[Column[_]]
          ,rep2def(schema.address).asInstanceOf[Column[_]]
          ,rep2def(schema.nationkey).asInstanceOf[Column[_]]
          ,rep2def(schema.phone).asInstanceOf[Column[_]]
          ,rep2def(schema.acctbal).asInstanceOf[Column[_]]
          ,rep2def(schema.comment).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.suppkey).asInstanceOf[Column[_]]
        )
      }
    }
    def partsupp = {
      val schema_ = new PartsuppSchema(
        toAtom(Column[Int]( "partkey", "Int" ))
        ,toAtom(Column[Int]( "suppkey", "Int" ))
        ,toAtom(Column[Int]( "availqty", "Int" ))
        ,toAtom(Column[Int]( "supplycost", "Int" ))
        ,toAtom(Column[String]( "comment", "String" ))
      )
      new Table[Partsupp](
        "partsupp",
        toAtom( new LiftedSchema[PartsuppSchema,Partsupp](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.partkey).asInstanceOf[Column[_]]
          ,rep2def(schema.suppkey).asInstanceOf[Column[_]]
          ,rep2def(schema.availqty).asInstanceOf[Column[_]]
          ,rep2def(schema.supplycost).asInstanceOf[Column[_]]
          ,rep2def(schema.comment).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.partkey).asInstanceOf[Column[_]]
          ,rep2def(schema.suppkey).asInstanceOf[Column[_]]
        )
      }
    }
    def customer = {
      val schema_ = new CustomerSchema(
        toAtom(Column[Int]( "custkey", "Int" ))
        ,toAtom(Column[String]( "name", "String" ))
        ,toAtom(Column[String]( "address", "String" ))
        ,toAtom(Column[Int]( "nationkey", "Int" ))
        ,toAtom(Column[String]( "phone", "String" ))
        ,toAtom(Column[Int]( "acctbal", "Int" ))
        ,toAtom(Column[String]( "mktsegment", "String" ))
        ,toAtom(Column[String]( "comment", "String" ))
      )
      new Table[Customer](
        "customer",
        toAtom( new LiftedSchema[CustomerSchema,Customer](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.custkey).asInstanceOf[Column[_]]
          ,rep2def(schema.name).asInstanceOf[Column[_]]
          ,rep2def(schema.address).asInstanceOf[Column[_]]
          ,rep2def(schema.nationkey).asInstanceOf[Column[_]]
          ,rep2def(schema.phone).asInstanceOf[Column[_]]
          ,rep2def(schema.acctbal).asInstanceOf[Column[_]]
          ,rep2def(schema.mktsegment).asInstanceOf[Column[_]]
          ,rep2def(schema.comment).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.custkey).asInstanceOf[Column[_]]
        )
      }
    }
    def orders = {
      val schema_ = new OrdersSchema(
        toAtom(Column[Int]( "orderkey", "Int" ))
        ,toAtom(Column[Int]( "custkey", "Int" ))
        ,toAtom(Column[String]( "orderstatus", "String" ))
        ,toAtom(Column[Int]( "totalprice", "Int" ))
        ,toAtom(Column[String]( "orderdate", "String" ))
        ,toAtom(Column[String]( "orderpriority", "String" ))
        ,toAtom(Column[String]( "clerk", "String" ))
        ,toAtom(Column[Int]( "shippriority", "Int" ))
        ,toAtom(Column[String]( "comment", "String" ))
      )
      new Table[Orders](
        "orders",
        toAtom( new LiftedSchema[OrdersSchema,Orders](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.orderkey).asInstanceOf[Column[_]]
          ,rep2def(schema.custkey).asInstanceOf[Column[_]]
          ,rep2def(schema.orderstatus).asInstanceOf[Column[_]]
          ,rep2def(schema.totalprice).asInstanceOf[Column[_]]
          ,rep2def(schema.orderdate).asInstanceOf[Column[_]]
          ,rep2def(schema.orderpriority).asInstanceOf[Column[_]]
          ,rep2def(schema.clerk).asInstanceOf[Column[_]]
          ,rep2def(schema.shippriority).asInstanceOf[Column[_]]
          ,rep2def(schema.comment).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.orderkey).asInstanceOf[Column[_]]
        )
      }
    }
    def lineitem = {
      val schema_ = new LineitemSchema(
        toAtom(Column[Int]( "orderkey", "Int" ))
        ,toAtom(Column[Int]( "partkey", "Int" ))
        ,toAtom(Column[Int]( "suppkey", "Int" ))
        ,toAtom(Column[Int]( "linenumber", "Int" ))
        ,toAtom(Column[Int]( "quantity", "Int" ))
        ,toAtom(Column[Int]( "extendedprice", "Int" ))
        ,toAtom(Column[Int]( "discount", "Int" ))
        ,toAtom(Column[Int]( "tax", "Int" ))
        ,toAtom(Column[String]( "returnflag", "String" ))
        ,toAtom(Column[String]( "linestatus", "String" ))
        ,toAtom(Column[String]( "shipdate", "String" ))
        ,toAtom(Column[String]( "commitdate", "String" ))
        ,toAtom(Column[String]( "receiptdate", "String" ))
        ,toAtom(Column[String]( "shipinstruct", "String" ))
        ,toAtom(Column[String]( "shipmode", "String" ))
        ,toAtom(Column[String]( "comment", "String" ))
      )
      new Table[Lineitem](
        "lineitem",
        toAtom( new LiftedSchema[LineitemSchema,Lineitem](schema_) )
      ){
        val schema = schema_
        val columns = Array[Column[_]](
          rep2def(schema.orderkey).asInstanceOf[Column[_]]
          ,rep2def(schema.partkey).asInstanceOf[Column[_]]
          ,rep2def(schema.suppkey).asInstanceOf[Column[_]]
          ,rep2def(schema.linenumber).asInstanceOf[Column[_]]
          ,rep2def(schema.quantity).asInstanceOf[Column[_]]
          ,rep2def(schema.extendedprice).asInstanceOf[Column[_]]
          ,rep2def(schema.discount).asInstanceOf[Column[_]]
          ,rep2def(schema.tax).asInstanceOf[Column[_]]
          ,rep2def(schema.returnflag).asInstanceOf[Column[_]]
          ,rep2def(schema.linestatus).asInstanceOf[Column[_]]
          ,rep2def(schema.shipdate).asInstanceOf[Column[_]]
          ,rep2def(schema.commitdate).asInstanceOf[Column[_]]
          ,rep2def(schema.receiptdate).asInstanceOf[Column[_]]
          ,rep2def(schema.shipinstruct).asInstanceOf[Column[_]]
          ,rep2def(schema.shipmode).asInstanceOf[Column[_]]
          ,rep2def(schema.comment).asInstanceOf[Column[_]]
        )
        val keys = Array[Column[_]](
          rep2def(schema.orderkey).asInstanceOf[Column[_]]
          ,rep2def(schema.linenumber).asInstanceOf[Column[_]]
        )
      }
    }
  }
}
