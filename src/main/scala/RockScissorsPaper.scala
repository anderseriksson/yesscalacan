/**
 * Demonstrate match case
 *
 * Created by Anders Eriksson.
 * http://en.wikipedia.org/wiki/Rock-paper-scissors
 *
 *  Should try to find a better example with input that sometimes is
 *  ignorable (thus using _ ) and
 */
@deprecated
class RockScissorsPaper {

  def play(a: String, b: String): String = {

    (a, b) match {
      case ("Rock", "Scissors") => "Rock wins"
      case ("Rock", "Paper") => "Paper wins"
      case ("Scissors", "Paper") => "Scissors wins"
      case ("Scissors", "Rock") => "Rock wins"
      case ("Paper", "Rock") => "Paper wins"
      case ("Paper", "Scissors") => "Scissors wins"
      case (x, y) if x == y => "Draw!"
      case _ => "Invalid input!"
    }

  }




}
