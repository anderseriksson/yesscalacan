/**
 * Show difference between a method and a function literal.
 */

class Functions {

  //Method
  def f(x: Int) = x + 1

  //Function literal
  val f1 = {
    (x: Int) => x + 1
  }

}
