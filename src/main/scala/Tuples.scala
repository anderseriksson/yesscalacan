
object Tuples {

  def findMinMax(s: Seq[Int]): (Int, Int) = {
    (s min, s max)
  }





















// Talk about REPL

// Run out of Scala command line or from build tool SBT. I use SBT.

// It allows entry of Scala expressions and they can be evaluated

// Command line provide most common Unix commandline "hotkeys" like backwards search CTRL + R

// show println("Hello World")

// This worked because there are automatic imports and you can interactively add more imports
// from your project

// So for each demo I will do a import so I get easy access to code examples.

// So Tuples

// This is a tuple expression

// SHOW val t1 = (1,"a")

// SHOW scala> val mySecondTuple = ('a, 3.0d, List(1,2,3))
//  mySecondTuple: (Symbol, Double, List[Int]) = ('a,3.0,List(1, 2, 3))

// SHOW access of elements

// CLAIM So tuples is mostly for the gray zone between individual standard objets, collections and custom classes

// For example you have method that returns the highest and lowest value of a collection

// SHOW JAVA CODE can't be done, unless you return an array or collection

// NOW SHOW SCALA CODE (this file)

// import Tuples._

// SHOW findMinMax(List(1,3,4,5,55))

// Talk about other examples - find longest word in a collection and tell it's position as well...

// WE'LL GET BACK TO THAT!!! (NAME LIST DEMO)






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
