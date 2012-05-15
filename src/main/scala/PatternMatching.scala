
object PatternMatching {

  case class IP(byte1:String = "127", byte2:String = "0", byte3:String = "0", byte4:String = "1")


  def country(ip:IP):String = ip match {
    case IP( "192", "71", "170", _ )  => "Sweden"
    case IP( "209", "47", "43", _ )   => "US"
    case _                            => "Not known"
  }

}
