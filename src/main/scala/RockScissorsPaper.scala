/**
 * Demonstrate match case with recursion and guard and default drop out
 *
 * Extra demo if needed
 *
 * http://en.wikipedia.org/wiki/Rock-paper-scissors
 *
 */
object RockScissorsPaper {

  object Hand extends Enumeration {
    val Rock, Scissors, Paper = Value
  }
  
  import Hand._

  def play(a: Value, b: Value): String = {

    (a, b) match {
      case (Rock, Scissors) => Rock + " wins"
      case (Rock, Paper) => Paper + " wins"
      case (Scissors, Paper) => Scissors + " wins"
      case (x, y) if x == y => "Draw!"
      case (x, y) => play(y, x)
      case _ => "Invalid input!"
    }

  }


//  scala> import RockScissorsPaper._
//  import RockScissorsPaper._
//
//  scala> import RockScissorsPaper.Hand._
//  import RockScissorsPaper.Hand._
//
//  scala> play(Rock, Paper)
//  res0: String = Paper wins






}
