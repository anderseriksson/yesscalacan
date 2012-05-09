package com.jayway.yesscalacan

/**
 * Key benefits of named params: Short. Flexible.
 * TODO: What are the characteristics of case class
 * References future improvements http://docs.scala-lang.org/sips/completed/named-and-default-arguments.html
 */
case class Apartment(rooms: Int, hasBalcony: Boolean = false, hasWasher: Boolean = false);




// D E M O

//scala> import com.jayway.yesscalacan.Apartment
//import com.jayway.yesscalacan.Apartment

//scala> new Apartment(4)
//res4: com.jayway.yesscalacan.Apartment = Apartment(4,false,false)

//scala> new Apartment(4, hasWasher = true)
//res5: com.jayway.yesscalacan.Apartment = Apartment(4,false,true)
