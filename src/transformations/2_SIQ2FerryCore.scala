package siq
trait SIQ2FerryCore extends FerryCore with Modules{
  import scala.collection.immutable.ListMap
  def siq2ferrycore( from:Rep[_], expected : ferry.ImplementationTypes.ImplementationType, symboltypes : List[ (String, ( ferry.FerryCoreTypes.FerryCoreType, ferry.ImplementationTypes.ImplementationType )) ] = List() ) : ferry.Expression = {
    import ferry.{FerryCoreTypes,ImplementationTypes}
    import ImplementationTypes._
    // manages the boxing and closures the current symboltable
    def t( from:Rep[_], expected : ImplementationType, symboltypes_ : List[ (String, ( FerryCoreTypes.FerryCoreType, ImplementationType )) ] = symboltypes ) =
      siq2ferrycore(from,expected,symboltypes_)
    val e = from match {
      case Const(value)     => ferry.Literal(value)
      case _:Sym[_] => {
        val def_ = rep2def(from)
        def_ match{
          case _:Table[_] => {
            val table = def_.asInstanceOf[Table[_ <: Product]]
            ferry.TableReference(
              name = table.name,
              columns = table.columns.map( c => (c.name,c.type_.toLowerCase) ).toList,
              keys    = List( table.keys.map( _.name ).toList ),
              order   = table.columns.map( _.name ).toList
            )
          }
          case g:GeneratorReference => t( g.fieldref, expected )
          case _:Comprehension[_] => {
            val comprehension = def_.asInstanceOf[Comprehension[_]] // workaround virtualized scala bug
            val in_ = t( comprehension.inner, TABLE )
            val variable = 'i'+rep2generator[Any](comprehension.inner).key
            assert( !symboltypes.map(_._1).contains(variable) )
            val new_symboltypes = ( variable ->  ( in_.type_.asInstanceOf[FerryCoreTypes.list].element, ROW ) ) :: symboltypes
            val return_ = t( comprehension.element_, ROW, new_symboltypes )
            ferry.For(
              variable
              , in_
              , if(comprehension.filter.isDefined) ferry.If(t(comprehension.filter.get, ROW, new_symboltypes),return_) else return_ // fix implementation type, when adding then, see both ferry thesis
              , comprehension.orderBy.map{
                  case Ascending(rep)  => (t(rep,ROW, new_symboltypes),"ASC")
                  case Descending(rep)  => (t(rep,ROW, new_symboltypes),"DESC")
              }
            )
          }
          case n:Node[_] => ferry.OperatorApplication( n.operator match{
            case "&&" => "and"
            case "||" => "or"
            case "==" => "="
            case "!=" => "<>"
            case "+" => n.manifest.toString match {
              case s if s.endsWith( ".String" ) => "||"
              case _ => n.operator
            }
            case _ => n.operator
          }, t(n.x, ROW), t(n.y, ROW) )
          case _:LiftedTuple[_] => {
            def flatten_tuple(r: Rep[Any]): List[Rep[Any]] = r match{
              case Def(t) if t.isInstanceOf[LiftedTuple[_]] => t.asInstanceOf[LiftedTuple[_]].p.productIterator.map(_.asInstanceOf[Rep[_]]).map(flatten_tuple _).toList.flatten
              case _ => List(r)
            }
            val flattened = flatten_tuple(from)
            ferry.FerryTuple( flattened.map( v => t(v, ROW) ).toList )
          }
          case _:FieldReference => {
            val ref = def_.asInstanceOf[FieldReference]
            val name = "i"+{
              val it = ref.asInstanceOf[FieldReference].iterable
              rep2def(it) match {
                case _:Generator[_] => rep2def(it).asInstanceOf[Generator[_]].key
              }
            }
            val access = ferry.VariableAccess( name, ListMap(symboltypes:_*)(name)._1, ListMap(symboltypes:_*)(name)._2 )
                  ListMap(symboltypes:_*)(name)._1 match {
                    case FerryCoreTypes.atomic => access// ??
                    case _:FerryCoreTypes.list => access
                    case _:FerryCoreTypes.tuple =>{
                      ferry.PositionalAccess(
                        access
                        , ref.position
                      )
                    }
            }
          }

          case LiteralTable( values ) => ferry.FerryList(
            values.toList,
            if( values.toList.size > 0 && values.toList(0).isInstanceOf[Product]) FerryCoreTypes.tuple( values.toList(0).asInstanceOf[Product].productIterator.map(x=>FerryCoreTypes.atomic).toList ) else FerryCoreTypes.atomic
          )
          case Flatten( list ) => ferry.Concat(
            t(list,TABLE)
          )
          case Distinct( list ) => ferry.Distinct(
            t(list,TABLE)
          )
          case Length( list ) => ferry.Length(
            t(list,TABLE)
          )
        }
      }
    }
    // this pattern match corresponds to the Helper Function C in Tom's Thesis
    (e.implementation_type, expected) match {
      case (ROW,ROW)     => e
      case (TABLE,ROW)   => ferry.Box(e)
      case (TABLE,TABLE) => e
      case (ROW,TABLE)   => ferry.Unbox(e)
    }
  }
}