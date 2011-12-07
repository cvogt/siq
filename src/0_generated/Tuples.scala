/* this file has been auto-generated */

package siq

// FIXME: move overloadhack to its own file
trait OverloadHack{
  class Overloaded0
  implicit val overloaded0 = new Overloaded0
  class Overloaded1
  implicit val overloaded1 = new Overloaded1
  class Overloaded2
  implicit val overloaded2 = new Overloaded2
  class Overloaded3
  implicit val overloaded3 = new Overloaded3
  class Overloaded4
  implicit val overloaded4 = new Overloaded4
  class Overloaded5
  implicit val overloaded5 = new Overloaded5
  class Overloaded6
  implicit val overloaded6 = new Overloaded6
  class Overloaded7
  implicit val overloaded7 = new Overloaded7
  class Overloaded8
  implicit val overloaded8 = new Overloaded8
  class Overloaded9
  implicit val overloaded9 = new Overloaded9
  class Overloaded10
  implicit val overloaded10 = new Overloaded10
  class Overloaded11
  implicit val overloaded11 = new Overloaded11
  class Overloaded12
  implicit val overloaded12 = new Overloaded12
  class Overloaded13
  implicit val overloaded13 = new Overloaded13
  class Overloaded14
  implicit val overloaded14 = new Overloaded14
  class Overloaded15
  implicit val overloaded15 = new Overloaded15
  class Overloaded16
  implicit val overloaded16 = new Overloaded16
  class Overloaded17
  implicit val overloaded17 = new Overloaded17
  class Overloaded18
  implicit val overloaded18 = new Overloaded18
  class Overloaded19
  implicit val overloaded19 = new Overloaded19
  class Overloaded20
  implicit val overloaded20 = new Overloaded20
  class Overloaded21
  implicit val overloaded21 = new Overloaded21
  class Overloaded22
  implicit val overloaded22 = new Overloaded22
  class Overloaded23
  implicit val overloaded23 = new Overloaded23
  class Overloaded24
  implicit val overloaded24 = new Overloaded24
  class Overloaded25
  implicit val overloaded25 = new Overloaded25
}

trait ITuples extends IModuleBase with OverloadHack{
  this: IComprehensions =>
  // This allows accessing a Rep[TupleX[_]]'s elements
  implicit def rep2tuple1[T1]( t:Rep[Tuple1[T1]] ) : Tuple1[Rep[T1]]
  implicit def rep2tuple2[T1,T2]( t:Rep[Tuple2[T1,T2]] ) : Tuple2[Rep[T1],Rep[T2]]
  implicit def rep2tuple3[T1,T2,T3]( t:Rep[Tuple3[T1,T2,T3]] ) : Tuple3[Rep[T1],Rep[T2],Rep[T3]]
  implicit def rep2tuple4[T1,T2,T3,T4]( t:Rep[Tuple4[T1,T2,T3,T4]] ) : Tuple4[Rep[T1],Rep[T2],Rep[T3],Rep[T4]]
  implicit def rep2tuple5[T1,T2,T3,T4,T5]( t:Rep[Tuple5[T1,T2,T3,T4,T5]] ) : Tuple5[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5]]
  implicit def rep2tuple6[T1,T2,T3,T4,T5,T6]( t:Rep[Tuple6[T1,T2,T3,T4,T5,T6]] ) : Tuple6[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6]]
  implicit def rep2tuple7[T1,T2,T3,T4,T5,T6,T7]( t:Rep[Tuple7[T1,T2,T3,T4,T5,T6,T7]] ) : Tuple7[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7]]
  implicit def rep2tuple8[T1,T2,T3,T4,T5,T6,T7,T8]( t:Rep[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]] ) : Tuple8[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8]]
  implicit def rep2tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]( t:Rep[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]] ) : Tuple9[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9]]
  implicit def rep2tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( t:Rep[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]] ) : Tuple10[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10]]
  implicit def rep2tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( t:Rep[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]] ) : Tuple11[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11]]
  implicit def rep2tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( t:Rep[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]] ) : Tuple12[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12]]
  implicit def rep2tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( t:Rep[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]] ) : Tuple13[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13]]
  implicit def rep2tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( t:Rep[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]] ) : Tuple14[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14]]
  implicit def rep2tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( t:Rep[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]] ) : Tuple15[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15]]
  implicit def rep2tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( t:Rep[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] ) : Tuple16[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16]]
  implicit def rep2tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( t:Rep[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] ) : Tuple17[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17]]
  implicit def rep2tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( t:Rep[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] ) : Tuple18[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18]]
  implicit def rep2tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( t:Rep[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] ) : Tuple19[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19]]
  implicit def rep2tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( t:Rep[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] ) : Tuple20[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19],Rep[T20]]

  // This turns tuples into Reps (which is required, as we only want the outer most element to officially have type Rep[...])
  implicit def tuple2rep1[T1]( t:Tuple1[Rep[T1]] ) : Rep[Tuple1[T1]]
  def tuple[T1](  t1:Rep[T1] ) = tuple2rep1( Tuple1(t1) )
  implicit def tuple2rep2[T1,T2]( t:Tuple2[Rep[T1],Rep[T2]] ) : Rep[Tuple2[T1,T2]]
  def tuple[T1,T2](  t1:Rep[T1], t2:Rep[T2] ) = tuple2rep2( Tuple2(t1,t2) )
  implicit def tuple2rep3[T1,T2,T3]( t:Tuple3[Rep[T1],Rep[T2],Rep[T3]] ) : Rep[Tuple3[T1,T2,T3]]
  def tuple[T1,T2,T3](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3] ) = tuple2rep3( Tuple3(t1,t2,t3) )
  implicit def tuple2rep4[T1,T2,T3,T4]( t:Tuple4[Rep[T1],Rep[T2],Rep[T3],Rep[T4]] ) : Rep[Tuple4[T1,T2,T3,T4]]
  def tuple[T1,T2,T3,T4](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4] ) = tuple2rep4( Tuple4(t1,t2,t3,t4) )
  implicit def tuple2rep5[T1,T2,T3,T4,T5]( t:Tuple5[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5]] ) : Rep[Tuple5[T1,T2,T3,T4,T5]]
  def tuple[T1,T2,T3,T4,T5](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5] ) = tuple2rep5( Tuple5(t1,t2,t3,t4,t5) )
  implicit def tuple2rep6[T1,T2,T3,T4,T5,T6]( t:Tuple6[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6]] ) : Rep[Tuple6[T1,T2,T3,T4,T5,T6]]
  def tuple[T1,T2,T3,T4,T5,T6](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6] ) = tuple2rep6( Tuple6(t1,t2,t3,t4,t5,t6) )
  implicit def tuple2rep7[T1,T2,T3,T4,T5,T6,T7]( t:Tuple7[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7]] ) : Rep[Tuple7[T1,T2,T3,T4,T5,T6,T7]]
  def tuple[T1,T2,T3,T4,T5,T6,T7](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7] ) = tuple2rep7( Tuple7(t1,t2,t3,t4,t5,t6,t7) )
  implicit def tuple2rep8[T1,T2,T3,T4,T5,T6,T7,T8]( t:Tuple8[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8]] ) : Rep[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8] ) = tuple2rep8( Tuple8(t1,t2,t3,t4,t5,t6,t7,t8) )
  implicit def tuple2rep9[T1,T2,T3,T4,T5,T6,T7,T8,T9]( t:Tuple9[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9]] ) : Rep[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9] ) = tuple2rep9( Tuple9(t1,t2,t3,t4,t5,t6,t7,t8,t9) )
  implicit def tuple2rep10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( t:Tuple10[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10]] ) : Rep[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10] ) = tuple2rep10( Tuple10(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10) )
  implicit def tuple2rep11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( t:Tuple11[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11]] ) : Rep[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10], t11:Rep[T11] ) = tuple2rep11( Tuple11(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11) )
  implicit def tuple2rep12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( t:Tuple12[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12]] ) : Rep[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10], t11:Rep[T11], t12:Rep[T12] ) = tuple2rep12( Tuple12(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12) )
  implicit def tuple2rep13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( t:Tuple13[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13]] ) : Rep[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10], t11:Rep[T11], t12:Rep[T12], t13:Rep[T13] ) = tuple2rep13( Tuple13(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13) )
  implicit def tuple2rep14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( t:Tuple14[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14]] ) : Rep[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10], t11:Rep[T11], t12:Rep[T12], t13:Rep[T13], t14:Rep[T14] ) = tuple2rep14( Tuple14(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14) )
  implicit def tuple2rep15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( t:Tuple15[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15]] ) : Rep[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10], t11:Rep[T11], t12:Rep[T12], t13:Rep[T13], t14:Rep[T14], t15:Rep[T15] ) = tuple2rep15( Tuple15(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15) )
  implicit def tuple2rep16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( t:Tuple16[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16]] ) : Rep[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10], t11:Rep[T11], t12:Rep[T12], t13:Rep[T13], t14:Rep[T14], t15:Rep[T15], t16:Rep[T16] ) = tuple2rep16( Tuple16(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16) )
  implicit def tuple2rep17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( t:Tuple17[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17]] ) : Rep[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10], t11:Rep[T11], t12:Rep[T12], t13:Rep[T13], t14:Rep[T14], t15:Rep[T15], t16:Rep[T16], t17:Rep[T17] ) = tuple2rep17( Tuple17(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17) )
  implicit def tuple2rep18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( t:Tuple18[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18]] ) : Rep[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10], t11:Rep[T11], t12:Rep[T12], t13:Rep[T13], t14:Rep[T14], t15:Rep[T15], t16:Rep[T16], t17:Rep[T17], t18:Rep[T18] ) = tuple2rep18( Tuple18(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18) )
  implicit def tuple2rep19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( t:Tuple19[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19]] ) : Rep[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10], t11:Rep[T11], t12:Rep[T12], t13:Rep[T13], t14:Rep[T14], t15:Rep[T15], t16:Rep[T16], t17:Rep[T17], t18:Rep[T18], t19:Rep[T19] ) = tuple2rep19( Tuple19(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19) )
  implicit def tuple2rep20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( t:Tuple20[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19],Rep[T20]] ) : Rep[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]]
  def tuple[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](  t1:Rep[T1], t2:Rep[T2], t3:Rep[T3], t4:Rep[T4], t5:Rep[T5], t6:Rep[T6], t7:Rep[T7], t8:Rep[T8], t9:Rep[T9], t10:Rep[T10], t11:Rep[T11], t12:Rep[T12], t13:Rep[T13], t14:Rep[T14], t15:Rep[T15], t16:Rep[T16], t17:Rep[T17], t18:Rep[T18], t19:Rep[T19], t20:Rep[T20] ) = tuple2rep20( Tuple20(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20) )

// enables tuples for groupBy
  trait IGroupable1[T1]{
    def groupBy( f:Tuple1[Rep[T1]] => Rep[_] ) : Rep[Iterable[Tuple1[Iterable[T1]]]]
  }
  implicit def rep2groupable1[T1]( r: Rep[Iterable[Tuple1[T1]]] ) : IGroupable1[T1]
  trait IGroupable2[T1,T2]{
    def groupBy( f:Tuple2[Rep[T1],Rep[T2]] => Rep[_] ) : Rep[Iterable[Tuple2[Iterable[T1],Iterable[T2]]]]
  }
  implicit def rep2groupable2[T1,T2]( r: Rep[Iterable[Tuple2[T1,T2]]] ) : IGroupable2[T1,T2]
  trait IGroupable3[T1,T2,T3]{
    def groupBy( f:Tuple3[Rep[T1],Rep[T2],Rep[T3]] => Rep[_] ) : Rep[Iterable[Tuple3[Iterable[T1],Iterable[T2],Iterable[T3]]]]
  }
  implicit def rep2groupable3[T1,T2,T3]( r: Rep[Iterable[Tuple3[T1,T2,T3]]] ) : IGroupable3[T1,T2,T3]
  trait IGroupable4[T1,T2,T3,T4]{
    def groupBy( f:Tuple4[Rep[T1],Rep[T2],Rep[T3],Rep[T4]] => Rep[_] ) : Rep[Iterable[Tuple4[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4]]]]
  }
  implicit def rep2groupable4[T1,T2,T3,T4]( r: Rep[Iterable[Tuple4[T1,T2,T3,T4]]] ) : IGroupable4[T1,T2,T3,T4]
  trait IGroupable5[T1,T2,T3,T4,T5]{
    def groupBy( f:Tuple5[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5]] => Rep[_] ) : Rep[Iterable[Tuple5[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5]]]]
  }
  implicit def rep2groupable5[T1,T2,T3,T4,T5]( r: Rep[Iterable[Tuple5[T1,T2,T3,T4,T5]]] ) : IGroupable5[T1,T2,T3,T4,T5]
  trait IGroupable6[T1,T2,T3,T4,T5,T6]{
    def groupBy( f:Tuple6[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6]] => Rep[_] ) : Rep[Iterable[Tuple6[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6]]]]
  }
  implicit def rep2groupable6[T1,T2,T3,T4,T5,T6]( r: Rep[Iterable[Tuple6[T1,T2,T3,T4,T5,T6]]] ) : IGroupable6[T1,T2,T3,T4,T5,T6]
  trait IGroupable7[T1,T2,T3,T4,T5,T6,T7]{
    def groupBy( f:Tuple7[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7]] => Rep[_] ) : Rep[Iterable[Tuple7[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7]]]]
  }
  implicit def rep2groupable7[T1,T2,T3,T4,T5,T6,T7]( r: Rep[Iterable[Tuple7[T1,T2,T3,T4,T5,T6,T7]]] ) : IGroupable7[T1,T2,T3,T4,T5,T6,T7]
  trait IGroupable8[T1,T2,T3,T4,T5,T6,T7,T8]{
    def groupBy( f:Tuple8[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8]] => Rep[_] ) : Rep[Iterable[Tuple8[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8]]]]
  }
  implicit def rep2groupable8[T1,T2,T3,T4,T5,T6,T7,T8]( r: Rep[Iterable[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]]] ) : IGroupable8[T1,T2,T3,T4,T5,T6,T7,T8]
  trait IGroupable9[T1,T2,T3,T4,T5,T6,T7,T8,T9]{
    def groupBy( f:Tuple9[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9]] => Rep[_] ) : Rep[Iterable[Tuple9[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9]]]]
  }
  implicit def rep2groupable9[T1,T2,T3,T4,T5,T6,T7,T8,T9]( r: Rep[Iterable[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]]] ) : IGroupable9[T1,T2,T3,T4,T5,T6,T7,T8,T9]
  trait IGroupable10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]{
    def groupBy( f:Tuple10[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10]] => Rep[_] ) : Rep[Iterable[Tuple10[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10]]]]
  }
  implicit def rep2groupable10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( r: Rep[Iterable[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]]] ) : IGroupable10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]
  trait IGroupable11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]{
    def groupBy( f:Tuple11[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11]] => Rep[_] ) : Rep[Iterable[Tuple11[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11]]]]
  }
  implicit def rep2groupable11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( r: Rep[Iterable[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]]] ) : IGroupable11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]
  trait IGroupable12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]{
    def groupBy( f:Tuple12[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12]] => Rep[_] ) : Rep[Iterable[Tuple12[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12]]]]
  }
  implicit def rep2groupable12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( r: Rep[Iterable[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]]] ) : IGroupable12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]
  trait IGroupable13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]{
    def groupBy( f:Tuple13[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13]] => Rep[_] ) : Rep[Iterable[Tuple13[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13]]]]
  }
  implicit def rep2groupable13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( r: Rep[Iterable[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]]] ) : IGroupable13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]
  trait IGroupable14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]{
    def groupBy( f:Tuple14[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14]] => Rep[_] ) : Rep[Iterable[Tuple14[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14]]]]
  }
  implicit def rep2groupable14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( r: Rep[Iterable[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]]] ) : IGroupable14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]
  trait IGroupable15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]{
    def groupBy( f:Tuple15[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15]] => Rep[_] ) : Rep[Iterable[Tuple15[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15]]]]
  }
  implicit def rep2groupable15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( r: Rep[Iterable[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]]] ) : IGroupable15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]
  trait IGroupable16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]{
    def groupBy( f:Tuple16[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16]] => Rep[_] ) : Rep[Iterable[Tuple16[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16]]]]
  }
  implicit def rep2groupable16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( r: Rep[Iterable[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]]] ) : IGroupable16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]
  trait IGroupable17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]{
    def groupBy( f:Tuple17[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17]] => Rep[_] ) : Rep[Iterable[Tuple17[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17]]]]
  }
  implicit def rep2groupable17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( r: Rep[Iterable[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]]] ) : IGroupable17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]
  trait IGroupable18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]{
    def groupBy( f:Tuple18[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18]] => Rep[_] ) : Rep[Iterable[Tuple18[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18]]]]
  }
  implicit def rep2groupable18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( r: Rep[Iterable[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]]] ) : IGroupable18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]
  trait IGroupable19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]{
    def groupBy( f:Tuple19[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19]] => Rep[_] ) : Rep[Iterable[Tuple19[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19]]]]
  }
  implicit def rep2groupable19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( r: Rep[Iterable[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]]] ) : IGroupable19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]
  trait IGroupable20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]{
    def groupBy( f:Tuple20[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19],Rep[T20]] => Rep[_] ) : Rep[Iterable[Tuple20[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19],Iterable[T20]]]]
  }
  implicit def rep2groupable20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( r: Rep[Iterable[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]]] ) : IGroupable20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]


  def zip[T1,T2]( r:Rep[Tuple2[Iterable[T1],Iterable[T2]]] )(implicit o:Overloaded2) : Rep[Iterable[Tuple2[T1,T2]]]
  def zip[T1,T2,T3]( r:Rep[Tuple3[Iterable[T1],Iterable[T2],Iterable[T3]]] )(implicit o:Overloaded3) : Rep[Iterable[Tuple3[T1,T2,T3]]]
  def zip[T1,T2,T3,T4]( r:Rep[Tuple4[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4]]] )(implicit o:Overloaded4) : Rep[Iterable[Tuple4[T1,T2,T3,T4]]]
  def zip[T1,T2,T3,T4,T5]( r:Rep[Tuple5[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5]]] )(implicit o:Overloaded5) : Rep[Iterable[Tuple5[T1,T2,T3,T4,T5]]]
  def zip[T1,T2,T3,T4,T5,T6]( r:Rep[Tuple6[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6]]] )(implicit o:Overloaded6) : Rep[Iterable[Tuple6[T1,T2,T3,T4,T5,T6]]]
  def zip[T1,T2,T3,T4,T5,T6,T7]( r:Rep[Tuple7[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7]]] )(implicit o:Overloaded7) : Rep[Iterable[Tuple7[T1,T2,T3,T4,T5,T6,T7]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8]( r:Rep[Tuple8[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8]]] )(implicit o:Overloaded8) : Rep[Iterable[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9]( r:Rep[Tuple9[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9]]] )(implicit o:Overloaded9) : Rep[Iterable[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( r:Rep[Tuple10[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10]]] )(implicit o:Overloaded10) : Rep[Iterable[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( r:Rep[Tuple11[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11]]] )(implicit o:Overloaded11) : Rep[Iterable[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( r:Rep[Tuple12[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12]]] )(implicit o:Overloaded12) : Rep[Iterable[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( r:Rep[Tuple13[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13]]] )(implicit o:Overloaded13) : Rep[Iterable[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( r:Rep[Tuple14[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14]]] )(implicit o:Overloaded14) : Rep[Iterable[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( r:Rep[Tuple15[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15]]] )(implicit o:Overloaded15) : Rep[Iterable[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( r:Rep[Tuple16[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16]]] )(implicit o:Overloaded16) : Rep[Iterable[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( r:Rep[Tuple17[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17]]] )(implicit o:Overloaded17) : Rep[Iterable[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( r:Rep[Tuple18[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18]]] )(implicit o:Overloaded18) : Rep[Iterable[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( r:Rep[Tuple19[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19]]] )(implicit o:Overloaded19) : Rep[Iterable[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]]]
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( r:Rep[Tuple20[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19],Iterable[T20]]] )(implicit o:Overloaded20) : Rep[Iterable[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]]]

}

trait Tuples extends ITuples with ModuleBase{
  this: Comprehensions =>

  case class Zip2[T1,T2]( target:Rep[Tuple2[Iterable[T1],Iterable[T2]]] ) extends Generator[Tuple2[T1,T2]](
    tuple2rep2(Tuple2(toAtom(Zipped(target._1)),toAtom(Zipped(target._2))))
  ) with Zip
  def zip[T1,T2]( r:Rep[Tuple2[Iterable[T1],Iterable[T2]]] )(implicit o:Overloaded2) = toAtom(Zip2(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]] ) = Zip2(Tuple2(i1,i2))
  case class Zip3[T1,T2,T3]( target:Rep[Tuple3[Iterable[T1],Iterable[T2],Iterable[T3]]] ) extends Generator[Tuple3[T1,T2,T3]](
    tuple2rep3(Tuple3(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3))))
  ) with Zip
  def zip[T1,T2,T3]( r:Rep[Tuple3[Iterable[T1],Iterable[T2],Iterable[T3]]] )(implicit o:Overloaded3) = toAtom(Zip3(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]] ) = Zip3(Tuple3(i1,i2,i3))
  case class Zip4[T1,T2,T3,T4]( target:Rep[Tuple4[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4]]] ) extends Generator[Tuple4[T1,T2,T3,T4]](
    tuple2rep4(Tuple4(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4))))
  ) with Zip
  def zip[T1,T2,T3,T4]( r:Rep[Tuple4[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4]]] )(implicit o:Overloaded4) = toAtom(Zip4(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]] ) = Zip4(Tuple4(i1,i2,i3,i4))
  case class Zip5[T1,T2,T3,T4,T5]( target:Rep[Tuple5[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5]]] ) extends Generator[Tuple5[T1,T2,T3,T4,T5]](
    tuple2rep5(Tuple5(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5]( r:Rep[Tuple5[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5]]] )(implicit o:Overloaded5) = toAtom(Zip5(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]] ) = Zip5(Tuple5(i1,i2,i3,i4,i5))
  case class Zip6[T1,T2,T3,T4,T5,T6]( target:Rep[Tuple6[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6]]] ) extends Generator[Tuple6[T1,T2,T3,T4,T5,T6]](
    tuple2rep6(Tuple6(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6]( r:Rep[Tuple6[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6]]] )(implicit o:Overloaded6) = toAtom(Zip6(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]] ) = Zip6(Tuple6(i1,i2,i3,i4,i5,i6))
  case class Zip7[T1,T2,T3,T4,T5,T6,T7]( target:Rep[Tuple7[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7]]] ) extends Generator[Tuple7[T1,T2,T3,T4,T5,T6,T7]](
    tuple2rep7(Tuple7(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7]( r:Rep[Tuple7[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7]]] )(implicit o:Overloaded7) = toAtom(Zip7(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]] ) = Zip7(Tuple7(i1,i2,i3,i4,i5,i6,i7))
  case class Zip8[T1,T2,T3,T4,T5,T6,T7,T8]( target:Rep[Tuple8[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8]]] ) extends Generator[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]](
    tuple2rep8(Tuple8(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8]( r:Rep[Tuple8[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8]]] )(implicit o:Overloaded8) = toAtom(Zip8(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]] ) = Zip8(Tuple8(i1,i2,i3,i4,i5,i6,i7,i8))
  case class Zip9[T1,T2,T3,T4,T5,T6,T7,T8,T9]( target:Rep[Tuple9[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9]]] ) extends Generator[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]](
    tuple2rep9(Tuple9(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9]( r:Rep[Tuple9[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9]]] )(implicit o:Overloaded9) = toAtom(Zip9(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]] ) = Zip9(Tuple9(i1,i2,i3,i4,i5,i6,i7,i8,i9))
  case class Zip10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( target:Rep[Tuple10[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10]]] ) extends Generator[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]](
    tuple2rep10(Tuple10(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( r:Rep[Tuple10[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10]]] )(implicit o:Overloaded10) = toAtom(Zip10(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]] ) = Zip10(Tuple10(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10))
  case class Zip11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( target:Rep[Tuple11[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11]]] ) extends Generator[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]](
    tuple2rep11(Tuple11(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10)),toAtom(Zipped(target._11))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( r:Rep[Tuple11[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11]]] )(implicit o:Overloaded11) = toAtom(Zip11(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]],i11: Rep[Iterable[T11]] ) = Zip11(Tuple11(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11))
  case class Zip12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( target:Rep[Tuple12[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12]]] ) extends Generator[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]](
    tuple2rep12(Tuple12(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10)),toAtom(Zipped(target._11)),toAtom(Zipped(target._12))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( r:Rep[Tuple12[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12]]] )(implicit o:Overloaded12) = toAtom(Zip12(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]],i11: Rep[Iterable[T11]],i12: Rep[Iterable[T12]] ) = Zip12(Tuple12(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12))
  case class Zip13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( target:Rep[Tuple13[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13]]] ) extends Generator[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]](
    tuple2rep13(Tuple13(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10)),toAtom(Zipped(target._11)),toAtom(Zipped(target._12)),toAtom(Zipped(target._13))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( r:Rep[Tuple13[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13]]] )(implicit o:Overloaded13) = toAtom(Zip13(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]],i11: Rep[Iterable[T11]],i12: Rep[Iterable[T12]],i13: Rep[Iterable[T13]] ) = Zip13(Tuple13(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13))
  case class Zip14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( target:Rep[Tuple14[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14]]] ) extends Generator[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]](
    tuple2rep14(Tuple14(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10)),toAtom(Zipped(target._11)),toAtom(Zipped(target._12)),toAtom(Zipped(target._13)),toAtom(Zipped(target._14))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( r:Rep[Tuple14[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14]]] )(implicit o:Overloaded14) = toAtom(Zip14(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]],i11: Rep[Iterable[T11]],i12: Rep[Iterable[T12]],i13: Rep[Iterable[T13]],i14: Rep[Iterable[T14]] ) = Zip14(Tuple14(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14))
  case class Zip15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( target:Rep[Tuple15[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15]]] ) extends Generator[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]](
    tuple2rep15(Tuple15(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10)),toAtom(Zipped(target._11)),toAtom(Zipped(target._12)),toAtom(Zipped(target._13)),toAtom(Zipped(target._14)),toAtom(Zipped(target._15))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( r:Rep[Tuple15[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15]]] )(implicit o:Overloaded15) = toAtom(Zip15(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]],i11: Rep[Iterable[T11]],i12: Rep[Iterable[T12]],i13: Rep[Iterable[T13]],i14: Rep[Iterable[T14]],i15: Rep[Iterable[T15]] ) = Zip15(Tuple15(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15))
  case class Zip16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( target:Rep[Tuple16[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16]]] ) extends Generator[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]](
    tuple2rep16(Tuple16(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10)),toAtom(Zipped(target._11)),toAtom(Zipped(target._12)),toAtom(Zipped(target._13)),toAtom(Zipped(target._14)),toAtom(Zipped(target._15)),toAtom(Zipped(target._16))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( r:Rep[Tuple16[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16]]] )(implicit o:Overloaded16) = toAtom(Zip16(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]],i11: Rep[Iterable[T11]],i12: Rep[Iterable[T12]],i13: Rep[Iterable[T13]],i14: Rep[Iterable[T14]],i15: Rep[Iterable[T15]],i16: Rep[Iterable[T16]] ) = Zip16(Tuple16(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16))
  case class Zip17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( target:Rep[Tuple17[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17]]] ) extends Generator[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]](
    tuple2rep17(Tuple17(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10)),toAtom(Zipped(target._11)),toAtom(Zipped(target._12)),toAtom(Zipped(target._13)),toAtom(Zipped(target._14)),toAtom(Zipped(target._15)),toAtom(Zipped(target._16)),toAtom(Zipped(target._17))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( r:Rep[Tuple17[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17]]] )(implicit o:Overloaded17) = toAtom(Zip17(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]],i11: Rep[Iterable[T11]],i12: Rep[Iterable[T12]],i13: Rep[Iterable[T13]],i14: Rep[Iterable[T14]],i15: Rep[Iterable[T15]],i16: Rep[Iterable[T16]],i17: Rep[Iterable[T17]] ) = Zip17(Tuple17(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17))
  case class Zip18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( target:Rep[Tuple18[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18]]] ) extends Generator[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]](
    tuple2rep18(Tuple18(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10)),toAtom(Zipped(target._11)),toAtom(Zipped(target._12)),toAtom(Zipped(target._13)),toAtom(Zipped(target._14)),toAtom(Zipped(target._15)),toAtom(Zipped(target._16)),toAtom(Zipped(target._17)),toAtom(Zipped(target._18))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( r:Rep[Tuple18[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18]]] )(implicit o:Overloaded18) = toAtom(Zip18(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]],i11: Rep[Iterable[T11]],i12: Rep[Iterable[T12]],i13: Rep[Iterable[T13]],i14: Rep[Iterable[T14]],i15: Rep[Iterable[T15]],i16: Rep[Iterable[T16]],i17: Rep[Iterable[T17]],i18: Rep[Iterable[T18]] ) = Zip18(Tuple18(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18))
  case class Zip19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( target:Rep[Tuple19[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19]]] ) extends Generator[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]](
    tuple2rep19(Tuple19(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10)),toAtom(Zipped(target._11)),toAtom(Zipped(target._12)),toAtom(Zipped(target._13)),toAtom(Zipped(target._14)),toAtom(Zipped(target._15)),toAtom(Zipped(target._16)),toAtom(Zipped(target._17)),toAtom(Zipped(target._18)),toAtom(Zipped(target._19))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( r:Rep[Tuple19[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19]]] )(implicit o:Overloaded19) = toAtom(Zip19(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]],i11: Rep[Iterable[T11]],i12: Rep[Iterable[T12]],i13: Rep[Iterable[T13]],i14: Rep[Iterable[T14]],i15: Rep[Iterable[T15]],i16: Rep[Iterable[T16]],i17: Rep[Iterable[T17]],i18: Rep[Iterable[T18]],i19: Rep[Iterable[T19]] ) = Zip19(Tuple19(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19))
  case class Zip20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( target:Rep[Tuple20[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19],Iterable[T20]]] ) extends Generator[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]](
    tuple2rep20(Tuple20(toAtom(Zipped(target._1)),toAtom(Zipped(target._2)),toAtom(Zipped(target._3)),toAtom(Zipped(target._4)),toAtom(Zipped(target._5)),toAtom(Zipped(target._6)),toAtom(Zipped(target._7)),toAtom(Zipped(target._8)),toAtom(Zipped(target._9)),toAtom(Zipped(target._10)),toAtom(Zipped(target._11)),toAtom(Zipped(target._12)),toAtom(Zipped(target._13)),toAtom(Zipped(target._14)),toAtom(Zipped(target._15)),toAtom(Zipped(target._16)),toAtom(Zipped(target._17)),toAtom(Zipped(target._18)),toAtom(Zipped(target._19)),toAtom(Zipped(target._20))))
  ) with Zip
  def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( r:Rep[Tuple20[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19],Iterable[T20]]] )(implicit o:Overloaded20) = toAtom(Zip20(r))
  //not required, because of how scala handles tuples as parameters: //def zip[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( i1: Rep[Iterable[T1]],i2: Rep[Iterable[T2]],i3: Rep[Iterable[T3]],i4: Rep[Iterable[T4]],i5: Rep[Iterable[T5]],i6: Rep[Iterable[T6]],i7: Rep[Iterable[T7]],i8: Rep[Iterable[T8]],i9: Rep[Iterable[T9]],i10: Rep[Iterable[T10]],i11: Rep[Iterable[T11]],i12: Rep[Iterable[T12]],i13: Rep[Iterable[T13]],i14: Rep[Iterable[T14]],i15: Rep[Iterable[T15]],i16: Rep[Iterable[T16]],i17: Rep[Iterable[T17]],i18: Rep[Iterable[T18]],i19: Rep[Iterable[T19]],i20: Rep[Iterable[T20]] ) = Zip20(Tuple20(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20))

  implicit def rep2tuple1[T1]( t:Rep[Tuple1[T1]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple1[Rep[T1]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple1[Rep[T1]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple2[T1,T2]( t:Rep[Tuple2[T1,T2]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple2[Rep[T1],Rep[T2]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple2[Rep[T1],Rep[T2]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple3[T1,T2,T3]( t:Rep[Tuple3[T1,T2,T3]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple3[Rep[T1],Rep[T2],Rep[T3]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple3[Rep[T1],Rep[T2],Rep[T3]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple4[T1,T2,T3,T4]( t:Rep[Tuple4[T1,T2,T3,T4]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple4[Rep[T1],Rep[T2],Rep[T3],Rep[T4]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple4[Rep[T1],Rep[T2],Rep[T3],Rep[T4]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple5[T1,T2,T3,T4,T5]( t:Rep[Tuple5[T1,T2,T3,T4,T5]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple5[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple5[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple6[T1,T2,T3,T4,T5,T6]( t:Rep[Tuple6[T1,T2,T3,T4,T5,T6]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple6[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple6[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple7[T1,T2,T3,T4,T5,T6,T7]( t:Rep[Tuple7[T1,T2,T3,T4,T5,T6,T7]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple7[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple7[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple8[T1,T2,T3,T4,T5,T6,T7,T8]( t:Rep[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple8[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple8[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]( t:Rep[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple9[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple9[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( t:Rep[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple10[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple10[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( t:Rep[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple11[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple11[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( t:Rep[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple12[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple12[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( t:Rep[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple13[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple13[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( t:Rep[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple14[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple14[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( t:Rep[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple15[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple15[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( t:Rep[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple16[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple16[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( t:Rep[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple17[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple17[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( t:Rep[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple18[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple18[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( t:Rep[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple19[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple19[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19]] ] // FIXME: why is this cast needed?!?
    }
  }
  implicit def rep2tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( t:Rep[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] ) = {
    //println(rep2def(t))
    //println(rep2def(rep2def(t).asInstanceOf[FieldReference].referree))
    rep2def(t) match {
      case _:FieldReference => rep2def(rep2def(t).asInstanceOf[FieldReference].referree).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple20[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19],Rep[T20]] ] // FIXME: why is this cast needed?!?
      case _:LiftedTuple[_] => rep2def(t).asInstanceOf[LiftedTuple[_]].p.asInstanceOf[ Tuple20[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19],Rep[T20]] ] // FIXME: why is this cast needed?!?
    }
  }

  class LiftedTuple[T]( val p:Product ) extends Def[T]
  case class LiftedTuple1[T1]( t:Tuple1[Rep[T1]] ) extends LiftedTuple[Tuple1[T1]](t)
  implicit def tuple2rep1[T1]( t:Tuple1[Rep[T1]] ) = toAtom( LiftedTuple1( t ) )
  case class LiftedTuple2[T1,T2]( t:Tuple2[Rep[T1],Rep[T2]] ) extends LiftedTuple[Tuple2[T1,T2]](t)
  implicit def tuple2rep2[T1,T2]( t:Tuple2[Rep[T1],Rep[T2]] ) = toAtom( LiftedTuple2( t ) )
  case class LiftedTuple3[T1,T2,T3]( t:Tuple3[Rep[T1],Rep[T2],Rep[T3]] ) extends LiftedTuple[Tuple3[T1,T2,T3]](t)
  implicit def tuple2rep3[T1,T2,T3]( t:Tuple3[Rep[T1],Rep[T2],Rep[T3]] ) = toAtom( LiftedTuple3( t ) )
  case class LiftedTuple4[T1,T2,T3,T4]( t:Tuple4[Rep[T1],Rep[T2],Rep[T3],Rep[T4]] ) extends LiftedTuple[Tuple4[T1,T2,T3,T4]](t)
  implicit def tuple2rep4[T1,T2,T3,T4]( t:Tuple4[Rep[T1],Rep[T2],Rep[T3],Rep[T4]] ) = toAtom( LiftedTuple4( t ) )
  case class LiftedTuple5[T1,T2,T3,T4,T5]( t:Tuple5[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5]] ) extends LiftedTuple[Tuple5[T1,T2,T3,T4,T5]](t)
  implicit def tuple2rep5[T1,T2,T3,T4,T5]( t:Tuple5[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5]] ) = toAtom( LiftedTuple5( t ) )
  case class LiftedTuple6[T1,T2,T3,T4,T5,T6]( t:Tuple6[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6]] ) extends LiftedTuple[Tuple6[T1,T2,T3,T4,T5,T6]](t)
  implicit def tuple2rep6[T1,T2,T3,T4,T5,T6]( t:Tuple6[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6]] ) = toAtom( LiftedTuple6( t ) )
  case class LiftedTuple7[T1,T2,T3,T4,T5,T6,T7]( t:Tuple7[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7]] ) extends LiftedTuple[Tuple7[T1,T2,T3,T4,T5,T6,T7]](t)
  implicit def tuple2rep7[T1,T2,T3,T4,T5,T6,T7]( t:Tuple7[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7]] ) = toAtom( LiftedTuple7( t ) )
  case class LiftedTuple8[T1,T2,T3,T4,T5,T6,T7,T8]( t:Tuple8[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8]] ) extends LiftedTuple[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]](t)
  implicit def tuple2rep8[T1,T2,T3,T4,T5,T6,T7,T8]( t:Tuple8[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8]] ) = toAtom( LiftedTuple8( t ) )
  case class LiftedTuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]( t:Tuple9[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9]] ) extends LiftedTuple[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]](t)
  implicit def tuple2rep9[T1,T2,T3,T4,T5,T6,T7,T8,T9]( t:Tuple9[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9]] ) = toAtom( LiftedTuple9( t ) )
  case class LiftedTuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( t:Tuple10[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10]] ) extends LiftedTuple[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]](t)
  implicit def tuple2rep10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( t:Tuple10[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10]] ) = toAtom( LiftedTuple10( t ) )
  case class LiftedTuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( t:Tuple11[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11]] ) extends LiftedTuple[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]](t)
  implicit def tuple2rep11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( t:Tuple11[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11]] ) = toAtom( LiftedTuple11( t ) )
  case class LiftedTuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( t:Tuple12[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12]] ) extends LiftedTuple[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]](t)
  implicit def tuple2rep12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( t:Tuple12[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12]] ) = toAtom( LiftedTuple12( t ) )
  case class LiftedTuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( t:Tuple13[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13]] ) extends LiftedTuple[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]](t)
  implicit def tuple2rep13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( t:Tuple13[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13]] ) = toAtom( LiftedTuple13( t ) )
  case class LiftedTuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( t:Tuple14[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14]] ) extends LiftedTuple[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]](t)
  implicit def tuple2rep14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( t:Tuple14[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14]] ) = toAtom( LiftedTuple14( t ) )
  case class LiftedTuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( t:Tuple15[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15]] ) extends LiftedTuple[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]](t)
  implicit def tuple2rep15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( t:Tuple15[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15]] ) = toAtom( LiftedTuple15( t ) )
  case class LiftedTuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( t:Tuple16[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16]] ) extends LiftedTuple[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]](t)
  implicit def tuple2rep16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( t:Tuple16[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16]] ) = toAtom( LiftedTuple16( t ) )
  case class LiftedTuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( t:Tuple17[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17]] ) extends LiftedTuple[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]](t)
  implicit def tuple2rep17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( t:Tuple17[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17]] ) = toAtom( LiftedTuple17( t ) )
  case class LiftedTuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( t:Tuple18[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18]] ) extends LiftedTuple[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]](t)
  implicit def tuple2rep18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( t:Tuple18[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18]] ) = toAtom( LiftedTuple18( t ) )
  case class LiftedTuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( t:Tuple19[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19]] ) extends LiftedTuple[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]](t)
  implicit def tuple2rep19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( t:Tuple19[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19]] ) = toAtom( LiftedTuple19( t ) )
  case class LiftedTuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( t:Tuple20[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19],Rep[T20]] ) extends LiftedTuple[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]](t)
  implicit def tuple2rep20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( t:Tuple20[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19],Rep[T20]] ) = toAtom( LiftedTuple20( t ) )

  case class Groupable1[T1]( g:Generator[Tuple1[T1]] ) extends IGroupable1[T1]{
    def groupBy( f:Tuple1[Rep[T1]] => Rep[_] ) : Rep[Iterable[Tuple1[Iterable[T1]]]] = {
      val t : Rep[Tuple1[T1]] = g.element_raw
      val cols = rep2tuple1(t)
      val groups = Tuple1(
          toAtom(Grouped(cols._1))
      )
      new Comprehension[ Tuple1[Iterable[T1]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable1[T1]( r: Rep[Iterable[Tuple1[T1]]] ) = Groupable1[T1](rep2generator(r))
  case class Groupable2[T1,T2]( g:Generator[Tuple2[T1,T2]] ) extends IGroupable2[T1,T2]{
    def groupBy( f:Tuple2[Rep[T1],Rep[T2]] => Rep[_] ) : Rep[Iterable[Tuple2[Iterable[T1],Iterable[T2]]]] = {
      val t : Rep[Tuple2[T1,T2]] = g.element_raw
      val cols = rep2tuple2(t)
      val groups = Tuple2(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
      )
      new Comprehension[ Tuple2[Iterable[T1],Iterable[T2]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable2[T1,T2]( r: Rep[Iterable[Tuple2[T1,T2]]] ) = Groupable2[T1,T2](rep2generator(r))
  case class Groupable3[T1,T2,T3]( g:Generator[Tuple3[T1,T2,T3]] ) extends IGroupable3[T1,T2,T3]{
    def groupBy( f:Tuple3[Rep[T1],Rep[T2],Rep[T3]] => Rep[_] ) : Rep[Iterable[Tuple3[Iterable[T1],Iterable[T2],Iterable[T3]]]] = {
      val t : Rep[Tuple3[T1,T2,T3]] = g.element_raw
      val cols = rep2tuple3(t)
      val groups = Tuple3(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
      )
      new Comprehension[ Tuple3[Iterable[T1],Iterable[T2],Iterable[T3]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable3[T1,T2,T3]( r: Rep[Iterable[Tuple3[T1,T2,T3]]] ) = Groupable3[T1,T2,T3](rep2generator(r))
  case class Groupable4[T1,T2,T3,T4]( g:Generator[Tuple4[T1,T2,T3,T4]] ) extends IGroupable4[T1,T2,T3,T4]{
    def groupBy( f:Tuple4[Rep[T1],Rep[T2],Rep[T3],Rep[T4]] => Rep[_] ) : Rep[Iterable[Tuple4[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4]]]] = {
      val t : Rep[Tuple4[T1,T2,T3,T4]] = g.element_raw
      val cols = rep2tuple4(t)
      val groups = Tuple4(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
      )
      new Comprehension[ Tuple4[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable4[T1,T2,T3,T4]( r: Rep[Iterable[Tuple4[T1,T2,T3,T4]]] ) = Groupable4[T1,T2,T3,T4](rep2generator(r))
  case class Groupable5[T1,T2,T3,T4,T5]( g:Generator[Tuple5[T1,T2,T3,T4,T5]] ) extends IGroupable5[T1,T2,T3,T4,T5]{
    def groupBy( f:Tuple5[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5]] => Rep[_] ) : Rep[Iterable[Tuple5[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5]]]] = {
      val t : Rep[Tuple5[T1,T2,T3,T4,T5]] = g.element_raw
      val cols = rep2tuple5(t)
      val groups = Tuple5(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
          ,toAtom(Grouped(cols._5))
      )
      new Comprehension[ Tuple5[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable5[T1,T2,T3,T4,T5]( r: Rep[Iterable[Tuple5[T1,T2,T3,T4,T5]]] ) = Groupable5[T1,T2,T3,T4,T5](rep2generator(r))
  case class Groupable6[T1,T2,T3,T4,T5,T6]( g:Generator[Tuple6[T1,T2,T3,T4,T5,T6]] ) extends IGroupable6[T1,T2,T3,T4,T5,T6]{
    def groupBy( f:Tuple6[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6]] => Rep[_] ) : Rep[Iterable[Tuple6[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6]]]] = {
      val t : Rep[Tuple6[T1,T2,T3,T4,T5,T6]] = g.element_raw
      val cols = rep2tuple6(t)
      val groups = Tuple6(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
          ,toAtom(Grouped(cols._5))
          ,toAtom(Grouped(cols._6))
      )
      new Comprehension[ Tuple6[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable6[T1,T2,T3,T4,T5,T6]( r: Rep[Iterable[Tuple6[T1,T2,T3,T4,T5,T6]]] ) = Groupable6[T1,T2,T3,T4,T5,T6](rep2generator(r))
  case class Groupable7[T1,T2,T3,T4,T5,T6,T7]( g:Generator[Tuple7[T1,T2,T3,T4,T5,T6,T7]] ) extends IGroupable7[T1,T2,T3,T4,T5,T6,T7]{
    def groupBy( f:Tuple7[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7]] => Rep[_] ) : Rep[Iterable[Tuple7[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7]]]] = {
      val t : Rep[Tuple7[T1,T2,T3,T4,T5,T6,T7]] = g.element_raw
      val cols = rep2tuple7(t)
      val groups = Tuple7(
          toAtom(Grouped(cols._1))
          ,toAtom(Grouped(cols._2))
          ,toAtom(Grouped(cols._3))
          ,toAtom(Grouped(cols._4))
          ,toAtom(Grouped(cols._5))
          ,toAtom(Grouped(cols._6))
          ,toAtom(Grouped(cols._7))
      )
      new Comprehension[ Tuple7[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable7[T1,T2,T3,T4,T5,T6,T7]( r: Rep[Iterable[Tuple7[T1,T2,T3,T4,T5,T6,T7]]] ) = Groupable7[T1,T2,T3,T4,T5,T6,T7](rep2generator(r))
  case class Groupable8[T1,T2,T3,T4,T5,T6,T7,T8]( g:Generator[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]] ) extends IGroupable8[T1,T2,T3,T4,T5,T6,T7,T8]{
    def groupBy( f:Tuple8[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8]] => Rep[_] ) : Rep[Iterable[Tuple8[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8]]]] = {
      val t : Rep[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]] = g.element_raw
      val cols = rep2tuple8(t)
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
      new Comprehension[ Tuple8[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable8[T1,T2,T3,T4,T5,T6,T7,T8]( r: Rep[Iterable[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]]] ) = Groupable8[T1,T2,T3,T4,T5,T6,T7,T8](rep2generator(r))
  case class Groupable9[T1,T2,T3,T4,T5,T6,T7,T8,T9]( g:Generator[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]] ) extends IGroupable9[T1,T2,T3,T4,T5,T6,T7,T8,T9]{
    def groupBy( f:Tuple9[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9]] => Rep[_] ) : Rep[Iterable[Tuple9[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9]]]] = {
      val t : Rep[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]] = g.element_raw
      val cols = rep2tuple9(t)
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
      new Comprehension[ Tuple9[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable9[T1,T2,T3,T4,T5,T6,T7,T8,T9]( r: Rep[Iterable[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]]] ) = Groupable9[T1,T2,T3,T4,T5,T6,T7,T8,T9](rep2generator(r))
  case class Groupable10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( g:Generator[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]] ) extends IGroupable10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]{
    def groupBy( f:Tuple10[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10]] => Rep[_] ) : Rep[Iterable[Tuple10[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10]]]] = {
      val t : Rep[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]] = g.element_raw
      val cols = rep2tuple10(t)
      val groups = Tuple10(
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
      )
      new Comprehension[ Tuple10[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( r: Rep[Iterable[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]]] ) = Groupable10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](rep2generator(r))
  case class Groupable11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( g:Generator[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]] ) extends IGroupable11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]{
    def groupBy( f:Tuple11[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11]] => Rep[_] ) : Rep[Iterable[Tuple11[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11]]]] = {
      val t : Rep[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]] = g.element_raw
      val cols = rep2tuple11(t)
      val groups = Tuple11(
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
      )
      new Comprehension[ Tuple11[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( r: Rep[Iterable[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]]] ) = Groupable11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](rep2generator(r))
  case class Groupable12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( g:Generator[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]] ) extends IGroupable12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]{
    def groupBy( f:Tuple12[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12]] => Rep[_] ) : Rep[Iterable[Tuple12[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12]]]] = {
      val t : Rep[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]] = g.element_raw
      val cols = rep2tuple12(t)
      val groups = Tuple12(
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
      )
      new Comprehension[ Tuple12[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( r: Rep[Iterable[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]]] ) = Groupable12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](rep2generator(r))
  case class Groupable13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( g:Generator[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]] ) extends IGroupable13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]{
    def groupBy( f:Tuple13[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13]] => Rep[_] ) : Rep[Iterable[Tuple13[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13]]]] = {
      val t : Rep[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]] = g.element_raw
      val cols = rep2tuple13(t)
      val groups = Tuple13(
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
      )
      new Comprehension[ Tuple13[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( r: Rep[Iterable[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]]] ) = Groupable13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](rep2generator(r))
  case class Groupable14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( g:Generator[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]] ) extends IGroupable14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]{
    def groupBy( f:Tuple14[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14]] => Rep[_] ) : Rep[Iterable[Tuple14[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14]]]] = {
      val t : Rep[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]] = g.element_raw
      val cols = rep2tuple14(t)
      val groups = Tuple14(
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
      )
      new Comprehension[ Tuple14[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( r: Rep[Iterable[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]]] ) = Groupable14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](rep2generator(r))
  case class Groupable15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( g:Generator[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]] ) extends IGroupable15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]{
    def groupBy( f:Tuple15[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15]] => Rep[_] ) : Rep[Iterable[Tuple15[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15]]]] = {
      val t : Rep[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]] = g.element_raw
      val cols = rep2tuple15(t)
      val groups = Tuple15(
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
      )
      new Comprehension[ Tuple15[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( r: Rep[Iterable[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]]] ) = Groupable15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](rep2generator(r))
  case class Groupable16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( g:Generator[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] ) extends IGroupable16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]{
    def groupBy( f:Tuple16[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16]] => Rep[_] ) : Rep[Iterable[Tuple16[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16]]]] = {
      val t : Rep[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] = g.element_raw
      val cols = rep2tuple16(t)
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
      new Comprehension[ Tuple16[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( r: Rep[Iterable[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]]] ) = Groupable16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](rep2generator(r))
  case class Groupable17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( g:Generator[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] ) extends IGroupable17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]{
    def groupBy( f:Tuple17[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17]] => Rep[_] ) : Rep[Iterable[Tuple17[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17]]]] = {
      val t : Rep[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] = g.element_raw
      val cols = rep2tuple17(t)
      val groups = Tuple17(
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
          ,toAtom(Grouped(cols._17))
      )
      new Comprehension[ Tuple17[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( r: Rep[Iterable[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]]] ) = Groupable17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](rep2generator(r))
  case class Groupable18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( g:Generator[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] ) extends IGroupable18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]{
    def groupBy( f:Tuple18[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18]] => Rep[_] ) : Rep[Iterable[Tuple18[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18]]]] = {
      val t : Rep[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = g.element_raw
      val cols = rep2tuple18(t)
      val groups = Tuple18(
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
          ,toAtom(Grouped(cols._17))
          ,toAtom(Grouped(cols._18))
      )
      new Comprehension[ Tuple18[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( r: Rep[Iterable[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]]] ) = Groupable18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](rep2generator(r))
  case class Groupable19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( g:Generator[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] ) extends IGroupable19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]{
    def groupBy( f:Tuple19[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19]] => Rep[_] ) : Rep[Iterable[Tuple19[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19]]]] = {
      val t : Rep[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = g.element_raw
      val cols = rep2tuple19(t)
      val groups = Tuple19(
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
          ,toAtom(Grouped(cols._17))
          ,toAtom(Grouped(cols._18))
          ,toAtom(Grouped(cols._19))
      )
      new Comprehension[ Tuple19[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( r: Rep[Iterable[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]]] ) = Groupable19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](rep2generator(r))
  case class Groupable20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( g:Generator[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] ) extends IGroupable20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]{
    def groupBy( f:Tuple20[Rep[T1],Rep[T2],Rep[T3],Rep[T4],Rep[T5],Rep[T6],Rep[T7],Rep[T8],Rep[T9],Rep[T10],Rep[T11],Rep[T12],Rep[T13],Rep[T14],Rep[T15],Rep[T16],Rep[T17],Rep[T18],Rep[T19],Rep[T20]] => Rep[_] ) : Rep[Iterable[Tuple20[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19],Iterable[T20]]]] = {
      val t : Rep[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = g.element_raw
      val cols = rep2tuple20(t)
      val groups = Tuple20(
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
          ,toAtom(Grouped(cols._17))
          ,toAtom(Grouped(cols._18))
          ,toAtom(Grouped(cols._19))
          ,toAtom(Grouped(cols._20))
      )
      new Comprehension[ Tuple20[Iterable[T1],Iterable[T2],Iterable[T3],Iterable[T4],Iterable[T5],Iterable[T6],Iterable[T7],Iterable[T8],Iterable[T9],Iterable[T10],Iterable[T11],Iterable[T12],Iterable[T13],Iterable[T14],Iterable[T15],Iterable[T16],Iterable[T17],Iterable[T18],Iterable[T19],Iterable[T20]] ](
        toAtom(g)
        , replace_with_references(groups, g)
        , groupBy = Some(f(cols)) // not: groupBy = replace_with_references(f(cols),g) ???
      )
    }
  }
  implicit def rep2groupable20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( r: Rep[Iterable[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]]] ) = Groupable20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](rep2generator(r))

    def replace_with_references[R]( r:Rep[_], g:Rep[Iterable[_]], counter : Counter = new Counter(0) ) : Rep[R]= {
      // note: when thinking about changing when counter is incremented, consider what happens when replacing nested tuples like ((a,b),c), as they should still get number ((1,2),3)
      val ref = r match{
        case Def(ref_) if ref_.isInstanceOf[FieldReference] => ref_.asInstanceOf[FieldReference]
        case _ => FieldReference(g,counter.count,r)
      }
      (ref.referree match{
        //case _:SchemaBase => replace_with_references_schema( referree, f )
        case Def(referree) if referree.isInstanceOf[LiftedTuple[_]] => {
          val p = referree.asInstanceOf[LiftedTuple[_]].p
          def f(x:Int) = {
            replace_with_references[Any]( p.productElement(x-1).asInstanceOf[Rep[_]], g, counter )
          }
          p.productArity match{
            case 1 => tuple2rep1(Tuple1(f(1)))
            case 2 => tuple2rep2(( f(1), f(2) ))
            case 3 => tuple2rep3(( f(1), f(2), f(3) ))
            case 4 => tuple2rep4(( f(1), f(2), f(3), f(4) ))
            case 5 => tuple2rep5(( f(1), f(2), f(3), f(4), f(5) ))
            case 6 => tuple2rep6(( f(1), f(2), f(3), f(4), f(5), f(6) ))
            case 7 => tuple2rep7(( f(1), f(2), f(3), f(4), f(5), f(6), f(7) ))
            case 8 => tuple2rep8(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8) ))
            case 9 => tuple2rep9(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9) ))
            case 10 => tuple2rep10(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10) ))
            case 11 => tuple2rep11(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10), f(11) ))
            case 12 => tuple2rep12(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10), f(11), f(12) ))
            case 13 => tuple2rep13(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10), f(11), f(12), f(13) ))
            case 14 => tuple2rep14(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10), f(11), f(12), f(13), f(14) ))
            case 15 => tuple2rep15(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10), f(11), f(12), f(13), f(14), f(15) ))
            case 16 => tuple2rep16(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10), f(11), f(12), f(13), f(14), f(15), f(16) ))
            case 17 => tuple2rep17(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10), f(11), f(12), f(13), f(14), f(15), f(16), f(17) ))
            case 18 => tuple2rep18(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10), f(11), f(12), f(13), f(14), f(15), f(16), f(17), f(18) ))
            case 19 => tuple2rep19(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10), f(11), f(12), f(13), f(14), f(15), f(16), f(17), f(18), f(19) ))
            case 20 => tuple2rep20(( f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8), f(9), f(10), f(11), f(12), f(13), f(14), f(15), f(16), f(17), f(18), f(19), f(20) ))
          }
        }
        case Def(referree) if referree.isInstanceOf[Generator[_]] =>{
          counter.count += 1
          val ref = FieldReference(g,counter.count,r)
          toAtom[Any](new GeneratorReference(r.asInstanceOf[Rep[Iterable[_]]],toAtom(ref).asInstanceOf[Rep[Iterable[_]]]))
        }
        case _ => {
          counter.count += 1
          val ref = FieldReference(g,counter.count,r)
          toAtom(ref)
        }
      }).asInstanceOf[Rep[R]]
    }
/*
    class Synthetic[T] extends Def[T]
    class SyntheticGenerator[T] extends Generator[T]{
        val element = synthesize[T](this,null.asInstanceOf[T])//.asInstanceOf[Rep[T]]
    }
    def synthesize[T]( g:Rep[Iterable[_]], r: T = null ) : Rep[T] = replace_with_references( _synthesize( r ), g )
    def _synthesize[T]( r : T ) : Rep[T] = toAtom( new Synthetic[T] )
    def _synthesize[T]( r : Iterable[T] ) : Rep[Iterable[T]] = toAtom( new SyntheticGenerator[T] )
    def _synthesize[T1]( r : Tuple1[T1] ) : Rep[Tuple1[T1]] = tuple2rep1(Tuple1(_synthesize[T1](null.asInstanceOf[T1])))
    def _synthesize[T1,T2]( r : Tuple2[T1,T2] ) : Rep[Tuple2[T1,T2]] = tuple2rep2(Tuple2(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2])))
    def _synthesize[T1,T2,T3]( r : Tuple3[T1,T2,T3] ) : Rep[Tuple3[T1,T2,T3]] = tuple2rep3(Tuple3(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3])))
    def _synthesize[T1,T2,T3,T4]( r : Tuple4[T1,T2,T3,T4] ) : Rep[Tuple4[T1,T2,T3,T4]] = tuple2rep4(Tuple4(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4])))
    def _synthesize[T1,T2,T3,T4,T5]( r : Tuple5[T1,T2,T3,T4,T5] ) : Rep[Tuple5[T1,T2,T3,T4,T5]] = tuple2rep5(Tuple5(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5])))
    def _synthesize[T1,T2,T3,T4,T5,T6]( r : Tuple6[T1,T2,T3,T4,T5,T6] ) : Rep[Tuple6[T1,T2,T3,T4,T5,T6]] = tuple2rep6(Tuple6(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7]( r : Tuple7[T1,T2,T3,T4,T5,T6,T7] ) : Rep[Tuple7[T1,T2,T3,T4,T5,T6,T7]] = tuple2rep7(Tuple7(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8]( r : Tuple8[T1,T2,T3,T4,T5,T6,T7,T8] ) : Rep[Tuple8[T1,T2,T3,T4,T5,T6,T7,T8]] = tuple2rep8(Tuple8(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9]( r : Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9] ) : Rep[Tuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9]] = tuple2rep9(Tuple9(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]( r : Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10] ) : Rep[Tuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10]] = tuple2rep10(Tuple10(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]( r : Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11] ) : Rep[Tuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11]] = tuple2rep11(Tuple11(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10]),_synthesize[T11](null.asInstanceOf[T11])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]( r : Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12] ) : Rep[Tuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12]] = tuple2rep12(Tuple12(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10]),_synthesize[T11](null.asInstanceOf[T11]),_synthesize[T12](null.asInstanceOf[T12])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]( r : Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13] ) : Rep[Tuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13]] = tuple2rep13(Tuple13(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10]),_synthesize[T11](null.asInstanceOf[T11]),_synthesize[T12](null.asInstanceOf[T12]),_synthesize[T13](null.asInstanceOf[T13])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]( r : Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14] ) : Rep[Tuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14]] = tuple2rep14(Tuple14(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10]),_synthesize[T11](null.asInstanceOf[T11]),_synthesize[T12](null.asInstanceOf[T12]),_synthesize[T13](null.asInstanceOf[T13]),_synthesize[T14](null.asInstanceOf[T14])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]( r : Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15] ) : Rep[Tuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15]] = tuple2rep15(Tuple15(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10]),_synthesize[T11](null.asInstanceOf[T11]),_synthesize[T12](null.asInstanceOf[T12]),_synthesize[T13](null.asInstanceOf[T13]),_synthesize[T14](null.asInstanceOf[T14]),_synthesize[T15](null.asInstanceOf[T15])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]( r : Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16] ) : Rep[Tuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16]] = tuple2rep16(Tuple16(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10]),_synthesize[T11](null.asInstanceOf[T11]),_synthesize[T12](null.asInstanceOf[T12]),_synthesize[T13](null.asInstanceOf[T13]),_synthesize[T14](null.asInstanceOf[T14]),_synthesize[T15](null.asInstanceOf[T15]),_synthesize[T16](null.asInstanceOf[T16])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]( r : Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17] ) : Rep[Tuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17]] = tuple2rep17(Tuple17(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10]),_synthesize[T11](null.asInstanceOf[T11]),_synthesize[T12](null.asInstanceOf[T12]),_synthesize[T13](null.asInstanceOf[T13]),_synthesize[T14](null.asInstanceOf[T14]),_synthesize[T15](null.asInstanceOf[T15]),_synthesize[T16](null.asInstanceOf[T16]),_synthesize[T17](null.asInstanceOf[T17])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]( r : Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18] ) : Rep[Tuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18]] = tuple2rep18(Tuple18(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10]),_synthesize[T11](null.asInstanceOf[T11]),_synthesize[T12](null.asInstanceOf[T12]),_synthesize[T13](null.asInstanceOf[T13]),_synthesize[T14](null.asInstanceOf[T14]),_synthesize[T15](null.asInstanceOf[T15]),_synthesize[T16](null.asInstanceOf[T16]),_synthesize[T17](null.asInstanceOf[T17]),_synthesize[T18](null.asInstanceOf[T18])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]( r : Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19] ) : Rep[Tuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19]] = tuple2rep19(Tuple19(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10]),_synthesize[T11](null.asInstanceOf[T11]),_synthesize[T12](null.asInstanceOf[T12]),_synthesize[T13](null.asInstanceOf[T13]),_synthesize[T14](null.asInstanceOf[T14]),_synthesize[T15](null.asInstanceOf[T15]),_synthesize[T16](null.asInstanceOf[T16]),_synthesize[T17](null.asInstanceOf[T17]),_synthesize[T18](null.asInstanceOf[T18]),_synthesize[T19](null.asInstanceOf[T19])))
    def _synthesize[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]( r : Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20] ) : Rep[Tuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20]] = tuple2rep20(Tuple20(_synthesize[T1](null.asInstanceOf[T1]),_synthesize[T2](null.asInstanceOf[T2]),_synthesize[T3](null.asInstanceOf[T3]),_synthesize[T4](null.asInstanceOf[T4]),_synthesize[T5](null.asInstanceOf[T5]),_synthesize[T6](null.asInstanceOf[T6]),_synthesize[T7](null.asInstanceOf[T7]),_synthesize[T8](null.asInstanceOf[T8]),_synthesize[T9](null.asInstanceOf[T9]),_synthesize[T10](null.asInstanceOf[T10]),_synthesize[T11](null.asInstanceOf[T11]),_synthesize[T12](null.asInstanceOf[T12]),_synthesize[T13](null.asInstanceOf[T13]),_synthesize[T14](null.asInstanceOf[T14]),_synthesize[T15](null.asInstanceOf[T15]),_synthesize[T16](null.asInstanceOf[T16]),_synthesize[T17](null.asInstanceOf[T17]),_synthesize[T18](null.asInstanceOf[T18]),_synthesize[T19](null.asInstanceOf[T19]),_synthesize[T20](null.asInstanceOf[T20])))
*/
}
