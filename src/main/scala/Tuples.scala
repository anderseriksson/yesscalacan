/**
 * Created by Anders Eriksson.
 */

object Tuples {

} class RangeFinder {
  def findMinMax(s: Seq[Int]): (Int, Int) = {
    (s min, s max)
  }


  //scala> new RangeFinder()
  //  res0: com.jayway.yesscalacan.RangeFinder = com.jayway.yesscalacan.RangeFinder@6c18520d
  //  scala> res0.findMinMax(List(1,2,3))
  //  res2: (Int, Int) = (0,3)
  //  scala> val (min, max) = res0.findMinMax(List(1,2,3,3))
  //  min: Int = 1
  //  max: Int = 3


}
