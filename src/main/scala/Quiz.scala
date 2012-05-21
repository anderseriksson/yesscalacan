/**
 * Quiz for Scala presentation.
 */

object Quiz {

  def whatIsThisMethodDoing(in: String): String = {
    in.toList.map( x => if ("bcdfghjklmnpqrstvxz".toList.contains(x)) x + "o" + x else x ).mkString
  }

}
