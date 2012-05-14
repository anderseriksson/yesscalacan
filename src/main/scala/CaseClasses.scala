object CaseClasses {

  /**
   * Key benefits of named params: Short. Flexible. Useful toString
   * TODO: What are the characteristics of case class
   * References future improvements http://docs.scala-lang.org/sips/completed/named-and-default-arguments.html
   */
  case class Apartment(rooms: Int, hasBalcony: Boolean = false, hasWasher: Boolean = false)


  // D E M O

//  scala> import CaseClasses._
//  import CaseClasses._
//
//  scala> new Apartment(4, hasWasher = true)
//  res1: CaseClasses.Apartment = Apartment(4,false,true)
//
//  scala> new Apartment(4)
//  res2: CaseClasses.Apartment = Apartment(4,false,false)

}