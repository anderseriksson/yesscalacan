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

//  scala> (1 to 1000*1000*1000).par.max
//  res13: Int = 1000000000
//
//  scala> (1 to 1000*1000*1000).max
//  res14: Int = 1000000000

}
