import java.util.Date

/**
 * @author Amir Moulavi
 */

object DuckTyping {


  class Logger {
    def log(c: {def getName: String}, message:String) {
      println("%s - %s: %s".format(new Date(), c.getName, message))
    }
  }

  class Event {
    def getName:String = "EventStore"
  }

  class Command {

  }

}
