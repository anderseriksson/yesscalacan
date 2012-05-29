import io.BufferedSource
import scala.util.Random

/**
 * Created by Anders Eriksson.
 */

object BookRaffle {

  val attendeesRaw: BufferedSource = scala.io.Source.fromFile("/Users/anders/Documents/jayway/scala/scalapreso20120530/Attendees-3514705579.csv")

  val attendeesList = attendeesRaw.getLines().toList.tail.map( _.split(","))
    
  val namePairList = attendeesList.map(x => (x(4) + " " +x(3)).filter(_ != '"'))

  def winner():String = {
    namePairList(Random.nextInt(namePairList.size))
  }

}
