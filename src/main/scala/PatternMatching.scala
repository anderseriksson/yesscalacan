
object PatternMatching {

  //FIRST SHOW MATCHER FROM CASE CLASS object

  //THEN SHOW THE ONE BELOW

  //or perhaps not


  // DEMO DONE!




  case class IP(byte1:String = "127", byte2:String = "0", byte3:String = "0", byte4:String = "1")


  def country(ip:IP):String = ip match {
    case IP( "10", _, _, _ )          => "IANA Reserved private 24-bit network range"
    case IP( "172", "16", _, _ )      => "IANA Reserved private 20-bit network range"
    case IP( "192", "168", _, _ )     => "IANA Reserved private 16-bit network range"
    case IP( "192", "71", "170", _ )  => "Sweden"
    case IP( "209", "47", "43", _ )   => "US"
    case _                            => "Not known"
  }



}
