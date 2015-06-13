import org.joda.time.Months
import massdemand.RecurringDays

object dateWorksheet {
  import io.lamma._

  val date = new java.util.Date()                 //> date  : java.util.Date = Sat Jun 13 18:48:53 SGT 2015
  val firstJan2015 = Date(2015, 1, 1)             //> firstJan2015  : io.lamma.Date = Date(2015,1,1)

  val now = new java.util.GregorianCalendar()     //> now  : java.util.GregorianCalendar = java.util.GregorianCalendar[time=143419
                                                  //| 2534001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.ca
                                                  //| lendar.ZoneInfo[id="Asia/Singapore",offset=28800000,dstSavings=0,useDaylight
                                                  //| =false,transitions=9,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=
                                                  //| 1,ERA=1,YEAR=2015,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DA
                                                  //| Y_OF_YEAR=164,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=6,HOUR_OF_DA
                                                  //| Y=18,MINUTE=48,SECOND=54,MILLISECOND=1,ZONE_OFFSET=28800000,DST_OFFSET=0]
  //val julyDates = Date(2015, 7, 7).daysOfMonth.toList

  firstJan2015.dayOfWeek                          //> res0: io.lamma.DayOfWeek = THURSDAY
  val today = Date(now.get(java.util.Calendar.YEAR), now.get(java.util.Calendar.MONTH) + 1, now.get(java.util.Calendar.DATE))
                                                  //> today  : io.lamma.Date = Date(2015,6,13)

  RecurringDays.monthly(15)                       //> res1: List[io.lamma.Date] = List(Date(2015,6,15), Date(2015,7,15), Date(2015
                                                  //| ,8,15), Date(2015,9,15), Date(2015,10,15), Date(2015,11,15), Date(2015,12,15
                                                  //| ), Date(2016,1,15), Date(2016,2,15), Date(2016,3,15), Date(2016,4,15), Date(
                                                  //| 2016,5,15))
}