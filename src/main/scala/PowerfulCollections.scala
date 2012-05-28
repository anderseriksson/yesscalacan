/**
 * Created by Anders Eriksson.
 */

object PowerfulCollections {


// Just like the old Effective Java told us - learn the collections and their methods - this is
// even more rewarding in Scala - I believe... The




// Strings are collections!

//  scala> "Anders".map(_.isUpper)
//  res21: scala.collection.immutable.IndexedSeq[Boolean] = Vector(true, false, false, false, false, false)
//
//  scala> "Anders".filter(_.isUpper)
//  res22: String = A



//  scala> "Anders is presenting Scala".split(" ").toList
// res50: List[java.lang.String] = List(Anders, is, presenting, Scala)
//
//  scala> res50.head +: "and" +: "Amir" +: res50.tail
//  res51: List[java.lang.String] = List(Anders, and, Amir, is, presenting, Scala)
//
//  scala> res51.toArray
//  res53: Array[java.lang.String] = Array(Anders, and, Amir, is, presenting, Scala)
//
//  scala> res53(3) = "are"
//
//  scala> res53.mkString(" ")
//  res55: String = Anders and Amir are presenting Scala

//  scala> res51 :+ "using" :+ "REPL"
//  res56: List[java.lang.String] = List(Anders, and, Amir, is, presenting, Scala, using, REPL)
  //
//  scala> res51 :+ "using" :+ "REPL".mkString(" ")
//  res57: List[java.lang.String] = List(Anders, and, Amir, is, presenting, Scala, using, R E P L)
//
//  scala> (res51 :+ "using" :+ "REPL").mkString(" ")
//  res58: String = Anders and Amir is presenting Scala using REPL
//

// NAME LIST DEMO

//  scala> List("Anders","Amir")
//  res9: List[java.lang.String] = List(Anders, Amir)
//
//  scala> List("Anders","Amir").map(x => (x, x.size)
//    | )
//  res11: List[(java.lang.String, Int)] = List((Anders,6), (Amir,4))
//
//  scala> List("Anders","Amir").map(x => (x, x.size)).zipWithIndex
//  res12: List[((java.lang.String, Int), Int)] = List(((Anders,6),0), ((Amir,4),1))
//
//  scala> List("Anders","Amir").map(x => (x, x.size)).zipWithIndex.maxBy( x => x._1._2 )
//  res13: ((java.lang.String, Int), Int) = ((Anders,6),0)
//
//  scala> List("Anders","Amir").map(x => (x, x.size)).zipWithIndex.maxBy( x => x._1._2 )._2
//  res14: Int = 0


}
