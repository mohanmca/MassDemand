import org.joda.time.Months
import massdemand.RecurringDays

object dateWorksheet {
  import io.lamma._

  val date = new java.util.Date()                 //> date  : java.util.Date = Sat Jun 13 20:36:40 SGT 2015
  val firstJan2015 = Date(2015, 1, 1)             //> firstJan2015  : io.lamma.Date = Date(2015,1,1)

  val now = new java.util.GregorianCalendar()     //> now  : java.util.GregorianCalendar = java.util.GregorianCalendar[time=143419
                                                  //| 9000234,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.ca
                                                  //| lendar.ZoneInfo[id="Asia/Singapore",offset=28800000,dstSavings=0,useDaylight
                                                  //| =false,transitions=9,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=
                                                  //| 1,ERA=1,YEAR=2015,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DA
                                                  //| Y_OF_YEAR=164,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DA
                                                  //| Y=20,MINUTE=36,SECOND=40,MILLISECOND=234,ZONE_OFFSET=28800000,DST_OFFSET=0]
                                                  //| 
  //val julyDates = Date(2015, 7, 7).daysOfMonth.toList

  firstJan2015.dayOfWeek                          //> res0: io.lamma.DayOfWeek = THURSDAY
  val today = Date(now.get(java.util.Calendar.YEAR), now.get(java.util.Calendar.MONTH) + 1, now.get(java.util.Calendar.DATE))
                                                  //> today  : io.lamma.Date = Date(2015,6,13)

  val weekly = RecurringDays.recurringDays(Saturday).take(4)
                                                  //> weekly  : List[io.lamma.Date] = List(Date(2015,6,13), Date(2015,6,20), Date(
                                                  //| 2015,6,27), Date(2015,7,4))
  val monthly = RecurringDays.monthly(20).take(2) //> monthly  : List[io.lamma.Date] = List(Date(2015,6,20), Date(2015,7,20))
  val jackDemand = weekly.map { x => (x, 2) }     //> jackDemand  : List[(io.lamma.Date, Int)] = List((Date(2015,6,13),2), (Date(2
                                                  //| 015,6,20),2), (Date(2015,6,27),2), (Date(2015,7,4),2))
  val jillDemand = monthly.map { x => (x, 10) }   //> jillDemand  : List[(io.lamma.Date, Int)] = List((Date(2015,6,20),10), (Date(
                                                  //| 2015,7,20),10))
  val allUserDemand = List(jackDemand, jillDemand).flatten
                                                  //> allUserDemand  : List[(io.lamma.Date, Int)] = List((Date(2015,6,13),2), (Dat
                                                  //| e(2015,6,20),2), (Date(2015,6,27),2), (Date(2015,7,4),2), (Date(2015,6,20),1
                                                  //| 0), (Date(2015,7,20),10))
  allUserDemand.filter{case (dt, demand) => dt == Date(2015,6,20) }
                                                  //> res1: List[(io.lamma.Date, Int)] = List((Date(2015,6,20),2), (Date(2015,6,20
                                                  //| ),10))
}