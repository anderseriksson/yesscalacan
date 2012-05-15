object CaseClasses {

  /**
   * Key benefits of named params: Short. Flexible. Useful toString. Copy method.
   * TODO: What are the characteristics of case class
   * References future improvements http://docs.scala-lang.org/sips/completed/named-and-default-arguments.html
   */



  case class Apartment(rooms: Int, hasBalcony: Boolean = false, hasWasher: Boolean = false)





  // D E M O

//  scala> import CaseClasses._
//  import CaseClasses._
//
//  scala> Apartment(4, hasWasher = true)
//  res1: CaseClasses.Apartment = Apartment(4,false,true)
//
//  scala> Apartment(4)
//  res2: CaseClasses.Apartment = Apartment(4,false,false)

//  scala> res2.copy(hasWasher = true)
//  res5: CaseClasses.Apartment = Apartment(4,false,true)

  
  def categorize(apartment: Apartment): String = {
    apartment match {
      case Apartment(1, _ , _ ) => "Etta"
      case Apartment(x, true , _ ) => "Balcony with " + x + " rooms!"
      case Apartment(_, _ , true ) => "Anything with a washer!"
      case _ => "Unknown apartment"
    }
  }
}