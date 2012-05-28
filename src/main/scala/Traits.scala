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

  trait AddAnders extends AbstractDictionary {
    abstract override def addWord(word: String): String = {
      super.addWord(word + " & Anders")
    }
  }


  class Dictionary extends AbstractDictionary {

    override def addWord(word: String): String = {
      word
    }

  }

}