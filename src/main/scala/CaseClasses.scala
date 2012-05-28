object CaseClasses {





  case class Apartment(rooms: Int,
                       hasBalcony: Boolean = false,
                       hasWasher: Boolean = false)












  def createSellingHeadlineFor(apartment: Apartment): String = {
    apartment match {
      case Apartment(x, _ , _ ) if x > 7 => "Luxurious spacious flat"
      case Apartment(1, _ , _ ) => "For students!"
      case Apartment(_, true , true ) => "Both balcony and washer!"
      case Apartment(x, true , _ ) => "Nice balcony with " + x + " rooms!"
      case Apartment(_, _ , true ) => "Laundry machine included!"
      case _ => "Misc flat"
    }
  }





}