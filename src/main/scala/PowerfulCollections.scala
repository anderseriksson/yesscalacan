/**
 * Created by Anders Eriksson.
 */

object PowerfulCollections {



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


}
