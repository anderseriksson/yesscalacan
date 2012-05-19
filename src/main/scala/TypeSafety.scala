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

//  /**
//   * Example of type pattern in a for loop THAT DOES NOT COMPILE
//   * @param in
//   * @return
//   */
//  def justStrings(in: List[Any]): List[String] = {
//    for (s: String <- in) yield s
//  }

//  scala> import TypeSafety._
//  import TypeSafety._
//
//  scala> justAs(List(A("1"), None, A("2"), None, "a"))
//  res1: List[TypeSafety.A] = List(A(1), A(2))



}
