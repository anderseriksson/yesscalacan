object CaseClasses {








  case class Apartment(rooms: Int,
                       hasBalcony: Boolean = false,
                       hasWasher: Boolean = false)




















  def createSellingHeadlineFor(apartment: Apartment): String = {
    apartment match {
      case Apartment(rooms,_ ,_) if rooms > 7 => "Luxurious spacious flat"
      case Apartment(1, _, _) => "For students!"
      case Apartment(_, true, true) => "Both balcony and washer!"
      case Apartment(rooms, true, _) => "Nice balcony with " + rooms + " rooms!"
      case Apartment(_, _, true) => "Laundry machine included!"
      case _ => "Very nice average flat"
    }
  }
















}