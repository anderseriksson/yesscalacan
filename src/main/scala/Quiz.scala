/**
 * Created by Anders Eriksson.
 */

object Quiz {

  def whatIsThisMethodDoing(in: String): String = {
    in.toList.map( x => if ("aeiouy".toList.contains(x)) x else x + "o" + x ).mkString
  }

}
