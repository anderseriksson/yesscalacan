import util.Random
import System.currentTimeMillis

object ParallelCollections {}

  class Data(val a:Int = 0 , val b:Int = 0)

  object Data {
    def apply(n:Int):List[Data] = {
      val r = new Random
      val lists = for { i <- 0 to n } yield new Data(r.nextInt(10000), r.nextInt(10000))
      lists.toList
    }
  }

  trait Computation {
    def f(data:Data):Int =  {
      var result:Int = 0
      for (i <- 1 until 1000000) {
        result -= data.a/2
        result += data.a * data.b
        result -= data.b/2
      }
      result
    }
    def compute(list:List[Data]):Int
  }

  object SequentialImplementation extends Computation {
    def compute(list:List[Data]):Int = list.map{f}.max
  }

  object ParallelImplementation extends Computation {
    def compute(list:List[Data]):Int = list.par.map{f}.max
  }

  object ParallelExperiment {
    def main(args: Array[String]) {
      val list = Data(args(0).toInt)
      var t1 = currentTimeMillis()
      SequentialImplementation.compute(list)
      var t2 = currentTimeMillis()
      println("Sequential " + (t2-t1) + " (ms)")
      t1 = currentTimeMillis()
      ParallelImplementation.compute(list)
      t2 = currentTimeMillis()
      println("Parallel " + (t2-t1) + " (ms)")
    }
  }

// In SBT console
/*

> run 4
[info] Running ParallelExperiment 4
Sequential 54 (ms)
Parallel 234 (ms)
[success] Total time: 0 s, completed May 27, 2012 11:20:33 AM

> run 400
[info] Running ParallelExperiment 400
Sequential 4052 (ms)
Parallel 1029 (ms)
[success] Total time: 5 s, completed May 27, 2012 11:20:46 AM

*/

