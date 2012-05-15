import scala.collection.mutable

object Traits {





  abstract class AbstractDictionary {
    def addWord(word: String)
  }

  trait CaseInsensitiveWord extends AbstractDictionary {
    abstract override def addWord(word: String) {
      super.addWord(word.toLowerCase)
    }
  }

  trait Trimmer extends AbstractDictionary {
    abstract override def addWord(word: String) {
      super.addWord(word.trim)
    }
  }

  trait UpperCaseWord extends AbstractDictionary {
    abstract override def addWord(word: String) {
      super.addWord(word.toUpperCase)
    }
  }


  class Dictionary extends AbstractDictionary {
    private val words = mutable.Set[String]()

    override def addWord(word: String) {
      words.add(word)
    }

    def wordsList: List[String] = words.toList

  }










  /*
    scala> import Traits._
    import Traits._

    scala> val dic = new Dictionary with CaseInsensitiveWord with Trimmer
    dic: Traits.Dictionary with Traits.CaseInsensitiveWord with Traits.Trimmer = $anon$1@339dd9

    scala> dic.addWord("     aMiR    ")

    scala> dic.wordsList
    res1: List[String] = List(amir)

    scala> val dic2 = new Dictionary with Trimmer with UpperCaseWord
    dic2: Traits.Dictionary with Traits.Trimmer with Traits.UpperCaseWord = $anon$1@bec2

    scala> dic2.addWord("     aMiR    ")

    scala> dic2.wordsList
    res3: List[String] = List(AMIR)
  */
}