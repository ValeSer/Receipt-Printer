class Agenda (val meetings: List[Meeting]) {

  def printDaySchedule(day: String): Unit = {
    val meetingsForTheDay = meetings.filter(_.day == day)
    if (meetingsForTheDay.isEmpty) {
      println(s"There are no meetings on $day")
    } else {
      val morning = meetingsForTheDay.filter(x => !isAfternoon(x.time))
      if (morning.isEmpty) {
        println(s"There are no meetings on $day morning")
      } else {
        println(s"$day morning: ")
        for (meeting <- morning) println(s"  ${meeting.time}: ${meeting.name}")
      }
      val afternoon = meetingsForTheDay.filter(x => isAfternoon(x.time))
      if (afternoon.isEmpty) {
        println(s"There are no meetings on $day afternoon")
      } else {
        println(s"$day afternoon: ")
        for (meeting <- afternoon) println(s"  ${meeting.time}: ${meeting.name}")
      }




    }
  }

  private def isAfternoon(time: String): Boolean = {
    time contains "pm"
  }
}

