/**
 * Created by Anders Eriksson.
 */

object TypeSafety {

  case class A(s: String)

  /**
   * Example of pattern in a for loop
   * @param in
   * @return
   */
  def justAs(in: List[Any]): List[A] = {
    for (A(s) <- in) yield A(s)
  }

}
