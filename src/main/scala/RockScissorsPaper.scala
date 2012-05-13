/**
 * Demonstrate match case
 *
 * Created by Anders Eriksson.
 * http://en.wikipedia.org/wiki/Rock-paper-scissors
 *
 */

class RockScissorsPaper {

  def play(a: String, b: String): String = {

    (a, b) match {
      case ("Rock", "Scissors") => "Rock wins"
      case ("Scissors", "Paper") => "Scissors wins"
      case ("Paper", "Rock") => "Paper wins"
      case (x, y) if x == y => "Draw!"
      case _ => "Invalid input!"
    }

  }


}
