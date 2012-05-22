object CaseClasses {

  /**
   * Key benefits of named params: Short. Flexible. Useful toString. Copy method.
   * TODO: What are the characteristics of case class
   * References future improvements http://docs.scala-lang.org/sips/completed/named-and-default-arguments.html
   */

  case class Apartment(rooms: Int, hasBalcony: Boolean = false, hasWasher: Boolean = false)


  // D E M O

// FIRST SHOW JAVA CODE

//  scala> import CaseClasses._
//  import CaseClasses._
//
//  scala> Apartment(1)
//  res17: CaseClasses.Apartment = Apartment(1,false,false)

//  scala> res17.hasBalcony
//  res20: Boolean = false

//  scala> val fyra = Apartment(4, hasWasher = true)
//  fyra: CaseClasses.Apartment = Apartment(4,false,true)
//
//  scala> val tvåa = fyra.copy(rooms = 2)
//  tvåa: CaseClasses.Apartment = Apartment(2,false,true)

// CLAIM but the biggest gain with case classes is pattern matching!
  
// DEMO COMPLETE


  
  //PATTERN MATCH DEMO FIRST SHOW THIS CODE

//  scala> categorize(res0)
//  res1: String = För studenter
//
//  scala> categorize(Apartment(7,hasWasher = true))
//  res2: String = Tvättmaskin ingår!
//
//    scala> categorize(Apartment(8,hasWasher = true))
//  res3: String = Paradvåning

// CLAIM It is very easy to read and understand what this code does!!!

// BACK TO PATTERNMATCH object

  def categorize(apartment: Apartment): String = {
    apartment match {
      case Apartment(x, _ , _ ) if x > 7 => "Paradvåning"
      case Apartment(1, _ , _ ) => "För studenter"
      case Apartment(x, true , _ ) => "Trivsam balkong med " + x + " rum!"
      case Apartment(_, _ , true ) => "Tvättmaskin ingår!"
      case _ => "Diverse lägenhet"
    }
  }
}