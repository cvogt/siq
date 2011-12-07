package siq
import scala.collection.immutable.ListMap
trait FerryCore2Algebra extends RelationalAlgebra with FerryCore{
  import scala.collection.immutable.ListMap
  import algebra._
  val debug_ferrycore_algebra_association = scala.collection.mutable.ListMap[Relation,ferry.Expression]() // for better debug info in sql
  def position2column( i: Int ) = "item"+i // called cid in Tom's Ferry Thesis
  def rename_second( first:List[String], second:List[String] ) =
    ListMap((second zip
      ((first ++ second).zipWithIndex.map(_._2+1)
                        .map( position2column _ )
                        .drop( first.size )
      )
    ):_*)
  def itsel( q_0:Relation, itbls :  List[(String,Nested)] ) :  List[(String,Nested)] = {
    itbls.map{
      case (key, Nested(q,itbls) ) => {
        val q_ = Projection(
          ("iter","pos",q.data_columns),
          Join(
            Operator( "=", Variable(key+"_"), Variable("iter") ),
            Projection( (key->key+"_"), q_0 ),
            q
          )
        )
        (key -> Nested(q_, itsel(q_,itbls) ))
      }
    }
  }
  val loop_initial = LiteralTable(List(1), List("iter"))
  debug_ferrycore_algebra_association.update( loop_initial, ferry.FerryList(List(1)) )
  def ferrycore2algebra( from:ferry.Expression,
                         loop : Relation = loop_initial,
                         scope :  List[(String,Nested)] = List()
                        ) : Nested = {
    def itapp( left:  List[(String,Nested)], right:  List[(String,Nested)] ) = left ++ right // FIXME
    def colum2position( str: String ) = str.drop(4).toInt // called ord in Tom's Ferry Thesis
    // transformation closure
    def t( from:ferry.Expression,
           loop_ : Relation = loop,
           scope_ :  List[(String,Nested)] = scope
          ) = ferrycore2algebra(from,loop_,scope_)
    val result_ast = from match {
      case ferry.Box( boxee ) =>
        Nested(
          Attach( 1, "pos", Projection( ("iter", "iter"->"item1"), loop ) ),
          List( "item1" -> t(boxee) )
        )
      case ferry.Unbox( unboxee ) => {
        val Nested( relation, itbls ) = t(unboxee)
        assert( relation.data_columns.size == 1, relation.data_columns )
        ListMap(itbls:_*)( relation.data_columns(0) )
      }
      case ferry.Literal(value) =>
        Nested(
          Attach(
            value, "item1",
            Attach( 1, "pos", loop )
          )
        )
      case ferry.OperatorApplication( symbol, left, right ) => {
        val Nested( q_left, itbls_left ) = t(left)
        val Nested( q_right, itbls_right ) = t(right)
        require( q_left.data_columns  == List("item1") )
        require( q_right.data_columns  == List("item1") )
        require( itbls_left.size == 0,  itbls_left)
        require( itbls_right.size == 0, itbls_right)
        Nested(
          Projection(
            ("iter","pos","res" -> "item1"),
            OperatorApplication( "res", symbol, "item1", "item2",
              Join(
                Operator( "=", Variable("iter"), Variable("iter_") ),
                q_left,
                Projection( ("iter" -> "iter_","item1" -> "item2"), q_right )
              )
            )
          )
        )
      }
      case ferry.FerryTuple( List(element) ) => t(element)
      case ferry.FerryTuple( head :: tail ) => {
        val Nested( q_e1, itbls_e1 ) = t(head)
        val Nested( q_e2, itbls_e2 ) = t(ferry.FerryTuple(tail))
        val renames_e2 = rename_second( q_e1.data_columns, q_e2.data_columns )
        Nested(
          Projection(
            List("iter","pos") ++ q_e1.data_columns ++ renames_e2.values
            ,
            Join(
              Operator("=",Variable("iter"),Variable("iter_")),
              q_e1,
              Projection( List("iter"->"iter_") ++ renames_e2, q_e2 )
            )
          ),
          itbls_e1 ++ (itbls_e2.map(_._1).map(renames_e2) zip itbls_e2.map(_._2))
        )
      }
      case l@ferry.FerryList( values, element_type ) =>
        Nested(
          l.type_ match {
            case ferry.FerryCoreTypes.list(a) =>
/*              if(values.size == 0){
                LiteralTable(List(),List("iter","pos"))
              } else {
*/                val positional_names = a match{
                    case ferry.FerryCoreTypes.atomic => List("item1")
                    case ferry.FerryCoreTypes.tuple(elements) => elements.zipWithIndex.map(_._2+1).map( position2column _ ).toList
                  }
                  CartesianProduct(
                    loop,
                    RowNumber( "pos", positional_names,
                      LiteralTable( values, positional_names )
                    )
                  )
//              }
          }
        )
      case ferry.TableReference(name,columns,keys,order) => {
        val column_positional_names = ListMap( columns.map(_._1)
                                             .zipWithIndex.map( name_index => ( name_index._1, position2column(name_index._2+1)) )
                                             :_*)
        Nested(
          CartesianProduct(
            loop,
            RowNumber( "pos", order.map( column_positional_names ),
              Projection(
                column_positional_names,
                Table( columns.map(_._1), name, keys )
              )
            )
          )
        )
      }
      case ferry.PositionalAccess( tuple, position ) => {
        val Nested(q_e,itbls_e) = t(tuple)
        val c_old = "item"+position
        val itbls_e_map = ListMap(itbls_e:_*)
        Nested(
          Projection(
            ("iter","pos",c_old -> "item1"),
            q_e
          ),
          if( itbls_e_map.contains(c_old) ) List( "item1" -> itbls_e_map(c_old) ) else List() //FIXME: is this item0 thing correct?
        )
      }
      case ferry.VariableAccess( name, _, _ ) => ListMap(scope:_*)(name)
      case ferry.If( predicate, then_, else_ ) => {
        // TODO: implement else part
        val Nested( q_predicate, _ ) = t(predicate)
        require( q_predicate.data_columns == List("item1"), q_predicate.data_columns )
        val loop_then = Projection( "iter", Filter( Variable(q_predicate.data_columns(0)), q_predicate ) )
        val scope_then = scope.map{
          case (v, Nested(q_v,itbls_v)) => (
            v -> Nested(
              Projection( ("iter","pos", q_v.data_columns),
                Join(
                  Operator( "=", Variable("iter"), Variable("iter_") ),
                  q_v, Projection( List("iter"->"iter_"), loop_then )
                )
              ),
              itsel( q_v, itbls_v )
            )
          )
        }
        val Nested( q_then, itbls_then ) = t(
          then_,
          loop_then,
          scope_then
        )
        val q = RowNumber( "item_", List("iter","ord","pos"),
          Attach( 1, "ord", q_then )
        )
        val q_ = Projection(
          ("iter","pos",q_then.data_columns.diff(itbls_then.map(_._1).toList),"item_"->itbls_then.map(_._1)),
          q
        )
        val itbls_ = itbls_then // TODO change this (and more) when allowing else part
/*        println("\n"*30)
        println(scope_then)
        println("\n"*30)*/
        Nested( q_, itbls_ )
      }
      case ferry.For( name, in_, return_, orderBy ) => {
        val Nested( q_e1, itbls_e1 ) = t(in_)
        val row_num = RowNumber( "inner_", List("iter","pos"), q_e1 )
        val q_v = Attach(
          1, "pos",
          Projection(
            ( "inner_" -> "iter", q_e1.data_columns ),
            row_num
          )
        )
        val loop_v = Projection( "iter", q_v )
        
        val map = Projection(
          ( "iter" -> "outer_", "inner_" ),
          row_num // inner is already a reserved SQL keyword
        )
        assert( !scope.map(_._1).contains(name) )
        val new_itbls = scope.map{ case (v_i,Nested(q_vi,itbls_vi)) =>
          v_i ->
          Nested(
            Projection(
              ("inner_"->"iter","pos",q_vi.data_columns),
              Join( Operator( "=", Variable("iter"), Variable("outer_") ),
                q_vi, map
              )
            ),
            itbls_vi
          )
        }
        val scope_v = (name, Nested(q_v,itbls_e1) ) :: new_itbls
        val Nested( q_e2, itbls_e2 ) = t( return_, loop_v, scope_v )
        val q_before_order = Join( Operator( "=", Variable("iter"), Variable("inner_") ), q_e2, map )
        val q_sorted = (if( orderBy.size > 0 ){
          // create relations for every ordering column
          val column_results = orderBy.map(_._1)
                                      .map( e => t(e, loop_v, scope_v ) )
                                      .map{ case Nested(q,_) => q }
                                      .zipWithIndex.map{
                                        case (q,i) => Projection( ("iter"->"orderiter","item1"->("order"+(i+1))), q )
                                      }
          // join all these relations with the data that needs to be sorted
          val q_sortable = column_results.foldLeft[Relation](
            q_before_order  //Join( Operator( "=", Variable("iter"), Variable("inner_") ), q_e2, map )
          )(
            (left, right) => {
              val combined = Join(
                Operator( "=", Variable("iter"), Variable("orderiter") ),
                left, right
              )
              Projection( combined.schema.filter(_ != "orderiter"), combined )
            }
          )
          // sort it
          val order_column_names = orderBy.zipWithIndex.map(_._2+1).map("order"+_.toString)
          val column_orders = orderBy.map(_._2)
          val q_sorted_raw = RowNumber( "pos_", (order_column_names zip column_orders).map(x => x._1.toString +" "+x._2.toString), q_sortable, Some(List("outer_")) ) // FIXME: just appending "ASC" and "DESC" is a hack
          // remove the ordering columns
          Projection( q_sorted_raw.schema.diff(order_column_names), q_sorted_raw )
        } else {
          RowNumber( "pos_", List("iter","pos"), // FIXME: just appending "ASC" and "DESC" is a hack
            q_before_order,
            Some(List("outer_"))
          )
        })
        val q_e2_ = Projection(
          ("outer_"->"iter", "pos_"->"pos", q_e2.data_columns),
          q_sorted
        )
        Nested( q_e2_, itbls_e2 )
      }
      case ferry.Append( left, right ) =>
        val Nested( left_relation,  left_itbls  ) = t(left)
        val Nested( right_relation, right_itbls ) = t(right)
        require( left_relation.schema == right_relation.schema, left_relation.schema +","+right_relation.schema )
        val q = RowNumber( "item_", List("iter","ord","pos"),
          DisjointUnion(
            Attach( 1, "ord", left_relation ),
            Attach( 2, "ord", right_relation )
          )
        )
        val q_ = Projection(
          ( "iter", "pos_" -> "pos", left_relation.data_columns.diff( left_itbls.map(_._1).toList ), "item_" -> left_itbls.map(_._1) ),
          RowRank("pos_",List("ord","pos"), q)
        )
        val itbls_ = itapp( left_itbls, right_itbls )
        Nested( q_, itbls_ )

      case ferry.Concat( lists ) =>
        val Nested( q_e, itbls_e ) = t(lists)
        require( q_e.data_columns == List("item1") )
        require( itbls_e.map(_._1).toList == List("item1") )
        val Nested( q_i, itbls_i ) = ListMap(itbls_e:_*)("item1")
        Nested(
          Projection(
            ("iter_"->"iter", "pos__"->"pos", q_i.data_columns),
            RowRank( "pos__", List("pos_","pos"),
              Join(
                Operator( "=", Variable("item1_"), Variable("iter") ),
                Projection(
                  ("iter"->"iter_","pos"->"pos_","item1"->"item1_"),
                  q_e
                ),
                q_i
              )
            )
          ),
          itbls_i
        )
      case ferry.Length( e ) =>
          val Nested( q_e, itbls_e ) = t( e )
          val q = Aggregation( "count","*", "item1", List("iter"), List("iter"), q_e )
          val q_ = Attach( 1, "pos", DisjointUnion(
            q,
            Attach( 0, "item1", Difference(
              loop,
              Projection( "iter", q )
            ))
          ))
          Nested( q_ )
      case ferry.Distinct( e ) => // TODO: extends this to work with tuples or even better: arbitrarily nested values
          val Nested( q_e, itbls_e ) = t( e )
          val q = Aggregation( "","item1", "item1", List("iter"), List("iter","item1"), q_e )
          /*val q_ = Attach( 1, "pos", DisjointUnion(
            q,
            Attach( 0, "item1", Difference(
              loop,
              Projection( "iter", q )
            ))
          ))*/
          val q_ = RowNumber( "pos", List("iter"), q ) // FIXME: this should be based on the previous pos, currently order is wrong
          Nested( q_ ) // when extending, make sure to handle itbls here correctly

    }
    debug_ferrycore_algebra_association.update( result_ast.relation, from )
    if( !debug_ferrycore_algebra_association.isDefinedAt(loop) ) {
      debug_ferrycore_algebra_association.updated( loop, from ) // this is actually wrong for the inital loop
    }
    result_ast
  }
}