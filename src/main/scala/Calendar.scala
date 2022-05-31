import scala.collection.mutable.ArrayBuffer

class Calendar {

  var new_date: ArrayBuffer[Date] = ArrayBuffer.empty[Date]

  def schedule(date: Date): Any = new_date match {
    case date if new_date == date => println("You can't have two tasks, at the same time")
    case _ => new_date += date
  }
}

