package com.jayway.yesscalacan

/**
 * Created by Anders Eriksson.
 *
 * Other examples http://booksites.artima.com/programming_in_scala_2ed/examples/html/ch26.html
 */

object Family {

  def apply(familyMember: FamilyMember*): List[FamilyMember] = Nil
}

abstract class FamilyMember;

class Father extends FamilyMember;
class Mother extends FamilyMember;
class Daughter extends FamilyMember;
class Son extends FamilyMember;
