/**
 * Created by Anders Eriksson.
 */

object PowerfulCollections {


// Just like the old Effective Java told us - learn the collections and their methods - this is
// even more rewarding in Scala - I believe... The

/*




scala> List(1,2,3)
res0: List[Int] = List(1, 2, 3)

scala> list123.contains(0)
res10: Boolean = false

scala> list123.contains(1)
res11: Boolean = true



//CLAIM contains is nothing special but contains another sequence can be handy

scala> list123.containsSlice(List(2,3))
res5: Boolean = true

scala> list123.containsSlice(List(3,4))
res6: Boolean = false

scala> list123.containsSlice(List(3,2))
res7: Boolean = false


exists, find, filter, forall (indexOf, lastIndexOf), count







//CLAIM diff is quite useful


scala> list123.diff(List(3,2))
res8: List[Int] = List(1)

scala> list123.diff(List(3,4))
res9: List[Int] = List(1, 2)

//I have used diff "to remove" non-unique items from an immutable lists


// MODIFICATION


scala> list123.map(_ * 3)
res33: List[Int] = List(3, 6, 9)




// AGGREGATES


scala> list123.partition( _ % 2 == 0 )
res18: (List[Int], List[Int]) = (List(2),List(1, 3))


scala> list123.groupBy(_ % 2 == 0)
res1: scala.collection.immutable.Map[Boolean,List[Int]] = Map(false -> List(1, 3), true -> List(2))


// Frequency table

scala> list123.groupBy( _ % 2 ).mapValues(_.size)
res30: scala.collection.immutable.Map[Int,Int] = Map(1 -> 2, 0 -> 1)

scala> List(1,2,3,4,6,8)
res31: List[Int] = List(1, 2, 3, 4, 6, 8)

scala> res31.groupBy( _ % 2 ).mapValues(_.size)
res32: scala.collection.immutable.Map[Int,Int] = Map(1 -> 2, 0 -> 4)


cala> res32.getOrElse(0, -1)
res34: Int = 4

scala> res32.getOrElse(1, -1)
res35: Int = 2

scala> res32.getOrElse(3, -1)
res36: Int = -1







Math stuff

scala> List(1,2,3,4).product
res22: Int = 24

scala> List(1,2,3,4).sum
res23: Int = 10

CONVERTING TO AND FROM TUPLES

scala> list123.zip(listabc)
res24: List[(Int, java.lang.String)] = List((1,a), (2,b), (3,c))

scala> res24.unzip
res25: (List[Int], List[java.lang.String]) = (List(1, 2, 3),List(a, b, c))

scala> listabc.zipWithIndex
res26: List[(java.lang.String, Int)] = List((a,0), (b,1), (c,2))



//MKSTRING very common usage!!!

scala> list123.mkString(",")
res13: String = 1,2,3

scala> list123.mkString("-")
res14: String = 1-2-3

scala> list123.mkString("<","-",">")
res15: String = <1-2-3>

scala> List().mkString("<","-",">")
res16: String = <>





// Strings are collections!

//  scala> "Anders".map(_.isUpper)
//  res21: scala.collection.immutable.IndexedSeq[Boolean] = Vector(true, false, false, false, false, false)
//
//  scala> "Anders".filter(_.isUpper)
//  res22: String = A



 */










}
