class Agenda (val meetings: List[Meeting]) {

  def printDaySchedule(day: String): Unit = {
    val meetingsForTheDay = meetings.filter(_.day == day)
    if (meetingsForTheDay.isEmpty) {
      println(s"There are no meetings on $day")
    } else {
        println(s"$day:")
        for (meeting <- meetingsForTheDay) println(s"  ${meeting.time}: ${meeting.name}")
    }
  }

}

