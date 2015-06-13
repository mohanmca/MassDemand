import org.joda.time.Months

object dateWorksheet {
  import io.lamma._

  val date = new java.util.Date()                 //> date  : java.util.Date = Sat Jun 13 17:39:33 SGT 2015
  val firstJan2015 = Date(2015, 1, 1)             //> firstJan2015  : io.lamma.Date = Date(2015,1,1)

  val now = new java.util.GregorianCalendar()     //> now  : java.util.GregorianCalendar = java.util.GregorianCalendar[time=143418
                                                  //| 8373899,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.ca
                                                  //| lendar.ZoneInfo[id="Asia/Singapore",offset=28800000,dstSavings=0,useDaylight
                                                  //| =false,transitions=9,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=
                                                  //| 1,ERA=1,YEAR=2015,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DA
                                                  //| Y_OF_YEAR=164,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=5,HOUR_OF_DA
                                                  //| Y=17,MINUTE=39,SECOND=33,MILLISECOND=899,ZONE_OFFSET=28800000,DST_OFFSET=0]
                                                  //| 

  //val julyDates = Date(2015, 7, 7).daysOfMonth.toList

  firstJan2015.dayOfWeek                          //> res0: io.lamma.DayOfWeek = THURSDAY
  val today = Date(now.get(java.util.Calendar.YEAR), now.get(java.util.Calendar.MONTH) + 1, now.get(java.util.Calendar.DATE))
                                                  //> today  : io.lamma.Date = Date(2015,6,13)
  def recurringDays(dayOfWeek: io.lamma.DayOfWeek): List[Date] = {
    val priorDay = today.previous(dayOfWeek)
    val range = (1 to 356 by 7)
    val futureDays = range.map { x => priorDay + (x - 1) }
    futureDays.toList
  }                                               //> recurringDays: (dayOfWeek: io.lamma.DayOfWeek)List[io.lamma.Date]

  recurringDays(DayOfWeek.FRIDAY)                 //> res1: List[io.lamma.Date] = List(Date(2015,6,12), Date(2015,6,19), Date(2015
                                                  //| ,6,26), Date(2015,7,3), Date(2015,7,10), Date(2015,7,17), Date(2015,7,24), D
                                                  //| ate(2015,7,31), Date(2015,8,7), Date(2015,8,14), Date(2015,8,21), Date(2015,
                                                  //| 8,28), Date(2015,9,4), Date(2015,9,11), Date(2015,9,18), Date(2015,9,25), Da
                                                  //| te(2015,10,2), Date(2015,10,9), Date(2015,10,16), Date(2015,10,23), Date(201
                                                  //| 5,10,30), Date(2015,11,6), Date(2015,11,13), Date(2015,11,20), Date(2015,11,
                                                  //| 27), Date(2015,12,4), Date(2015,12,11), Date(2015,12,18), Date(2015,12,25), 
                                                  //| Date(2016,1,1), Date(2016,1,8), Date(2016,1,15), Date(2016,1,22), Date(2016,
                                                  //| 1,29), Date(2016,2,5), Date(2016,2,12), Date(2016,2,19), Date(2016,2,26), Da
                                                  //| te(2016,3,4), Date(2016,3,11), Date(2016,3,18), Date(2016,3,25), Date(2016,4
                                                  //| ,1), Date(2016,4,8), Date(2016,4,15), Date(2016,4,22), Date(2016,4,29), Date
                                                  //| (2016,5,6), Date(2016,5,13), Date(2016,5,20), Date(2016,5,27))
}