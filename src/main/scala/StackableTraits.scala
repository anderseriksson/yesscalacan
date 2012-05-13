import scala.collection.mutable

/**
 * @author Amir Moulavi
 */

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


object StackableTraits {
  def main(args: Array[String]) {
    val dictionary1 = new Dictionary with CaseInsensitiveWord with Trimmer
    dictionary1.addWord("    aMiR    ")
    println(dictionary1.wordsList)
    val dictionary2 = new Dictionary with Trimmer with UpperCaseWord
    dictionary2.addWord("    aMiR    ")
    println(dictionary2.wordsList)
  }
}
