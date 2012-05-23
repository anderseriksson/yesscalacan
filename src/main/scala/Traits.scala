import scala.collection.mutable

object Traits {


  abstract class AbstractDictionary {
    def addWord(word: String): String
  }

  trait Lower extends AbstractDictionary {
    abstract override def addWord(word: String): String = {
      super.addWord(word.toLowerCase)
    }
  }

  trait Trimmer extends AbstractDictionary {
    abstract override def addWord(word: String): String = {
      super.addWord(word.trim)
    }
  }

  trait Upper extends AbstractDictionary {
    abstract override def addWord(word: String): String = {
      super.addWord(word.toUpperCase)
    }
  }

  trait Adder extends AbstractDictionary {
    abstract override def addWord(word: String): String = {
      super.addWord(word + " & Anders")
    }
  }


  class Dictionary extends AbstractDictionary {

    override def addWord(word: String): String = {
      word
    }

  }


  /*

scala> import Traits._
import Traits._

scala> val d1 = new Dictionary with Upper with Trimmer
d1: Traits.Dictionary with Traits.Upper with Traits.Trimmer = $anon$1@6dcfef5e

     // NOTE THIS IS DONE AT INSTANTIATION AND NOT AT CLASS DECLARATION!!!!

scala> d1.addWord("Amir")
res0: String = AMIR

scala> d1.addWord("Amir ")
res1: String = AMIR

scala> val d1 = new Dictionary with Upper with Adder
d1: Traits.Dictionary with Traits.Upper with Traits.Adder = $anon$1@64c8dcb7

scala> d1.addWord("Amir")
res2: String = AMIR & ANDERS

scala> val d1 = new Dictionary with Adder with Upper
d1: Traits.Dictionary with Traits.Adder with Traits.Upper = $anon$1@3c1e9711

scala> d1.addWord("Amir")
res3: String = AMIR & Anders

 */
}