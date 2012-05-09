package com.jayway.yesscalacan

/**
 * Created by Anders Eriksson.
 */

class RangeFinder {
  def findMinMax(s: Seq[Int]): (Int, Int) = {
    s.foldLeft((0,0))
    { case ((mi: Int, ma: Int), i: Int) => (mi min i, ma max i)}
  }

//  def minmax1 = {((mi: Int, ma: Int), i: Int) => (mi min i)}  //fails with error see http://stackoverflow.com/questions/1701001/fold-list-of-tuples-in-scala-with-destructuring

//scala> new RangeFinder()
//  res0: com.jayway.yesscalacan.RangeFinder = com.jayway.yesscalacan.RangeFinder@6c18520d
//  scala> res0.findMinMax(List(1,2,3))
//  res2: (Int, Int) = (0,3)


}
