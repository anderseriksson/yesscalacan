/**
 * Demonstrate match case
 *
 * Created by Anders Eriksson.
 * http://en.wikipedia.org/wiki/Rock-paper-scissors
 *
 *  Should try to find a better example with input that sometimes is
 *  ignorable (thus using _ ) and
 */
class RockScissorsPaper {

  //TODO make class hierarch of the three options (or an enum) and continue from there...
  
  def play(a: String, b: String): String = {

    (a, b) match {
      case ("Rock", "Scissors") => "Rock wins"
      case ("Rock", "Paper") => "Paper wins"
      case ("Scissors", "Paper") => "Scissors wins"
      case (x, y) if x == y => "Draw!"
      case (x, y) => play(y, x)
      case _ => "Invalid input!"
    }

  }




}
