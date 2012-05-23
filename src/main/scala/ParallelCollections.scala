/**
 * Created by Anders Eriksson.
 */

object ParallelCollections {

// Open Activity Monitor and CPU History graph!

/*
http://stackoverflow.com/questions/9547160/how-to-measure-time-of-a-statement-in-scala-console
 */
  def time[A](a: => A) = {
       val now = System.nanoTime
       val result = a
       val micros = (System.nanoTime - now) / 1000
       println("%d microseconds".format(micros))
       result
  }


// :power

// :wrap time

// Open activity monitor

//  scala> (1 to 100000000).aggregate( List[Int]() ) ( (list: List[Int], b: Int ) =>  (list:+b).sortWith(_>_).take(5) , (a: List[Int], b: List[Int]) => (a ::: b).sortWith(_>_).take(5) )
//  40665761 microseconds
//    res2: List[Int] = List(100000000, 99999999, 99999998, 99999997, 99999996)
//
//  scala> (1 to 100000000).par.aggregate( List[Int]() ) ( (list: List[Int], b: Int ) =>  (list:+b).sortWith(_>_).take(5) , (a: List[Int], b: List[Int]) => (a ::: b).sortWith(_>_).take(5) )
//  33804573 microseconds
//    res3: List[Int] = List(100000000, 99999999, 99999998, 99999997, 99999996)
//


}
