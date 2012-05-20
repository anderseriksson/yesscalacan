/**
 * Created by Anders Eriksson.
 */

object Tuples {

  class RangeFinder {
    def findMinMax(s: Seq[Int]): (Int, Int) = {
      (s min, s max)
    }
  }

//  scala> new RangeFinder
//  res0: Tuples.RangeFinder = Tuples$RangeFinder@1a15deb6

//comment on consiseness - no paranthesis no semi colon

//      scala> res0.findMinMax(List(1,2,3))
//      res3: (Int, Int) = (1,3)
//
//      scala> val (a,b) = res0.findMinMax(List(1,3,4,5))
//      a: Int = 1
//      b: Int = 5



}
