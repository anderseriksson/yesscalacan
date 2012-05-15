/**
 * Idea: show concept of apply() and unApply() methods. Perhaps this is just a generalization of
 * case classes so perhaps it is not worth it?
 *
 * Still, if you want to avoid the shortcoming of case classes (that they show concrete
 * implementation) then extractors are nice! See discussion PIS2E chapter 26.6
 * Other examples http://booksites.artima.com/programming_in_scala_2ed/examples/html/ch26.html
 */
@deprecated
object Family {

  def apply(familyMember: FamilyMember*): List[FamilyMember] = {
    familyMember.toList
  }

  //  def unapply ...

}

sealed abstract class FamilyMember;

class Father extends FamilyMember;

class Mother extends FamilyMember;

class Daughter extends FamilyMember;

class Son extends FamilyMember;
