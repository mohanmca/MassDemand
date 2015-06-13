import org.joda.time.Months

object dateWorksheet {
  import io.lamma._

  val date = new java.util.Date()                 //> date  : java.util.Date = Sat Jun 13 17:03:54 SGT 2015
  val firstJan2015 = Date(2015, 1, 1)             //> firstJan2015  : io.lamma.Date = Date(2015,1,1)

  val now = new java.util.GregorianCalendar()     //> now  : java.util.GregorianCalendar = java.util.GregorianCalendar[time=143418
                                                  //| 6234542,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.ca
                                                  //| lendar.ZoneInfo[id="Asia/Singapore",offset=28800000,dstSavings=0,useDaylight
                                                  //| =false,transitions=9,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=
                                                  //| 1,ERA=1,YEAR=2015,MONTH=5,WEEK_OF_YEAR=24,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DA
                                                  //| Y_OF_YEAR=164,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=5,HOUR_OF_DA
                                                  //| Y=17,MINUTE=3,SECOND=54,MILLISECOND=542,ZONE_OFFSET=28800000,DST_OFFSET=0]

  //val julyDates = Date(2015, 7, 7).daysOfMonth.toList

  firstJan2015.dayOfWeek                          //> res0: io.lamma.DayOfWeek = THURSDAY
  val today = Date(now.get(java.util.Calendar.YEAR), now.get(java.util.Calendar.MONTH) + 1, now.get(java.util.Calendar.DATE))
                                                  //> today  : io.lamma.Date = Date(2015,6,13)
  val nextFriday = today.nextOrSame(DayOfWeek.FRIDAY)
                                                  //> nextFriday  : io.lamma.Date = Date(2015,6,19)
  val priorFriday = nextFriday.previous(DayOfWeek.FRIDAY)
                                                  //> priorFriday  : io.lamma.Date = Date(2015,6,12)
 	val range = (1 to 356 by 7 )              //> range  : scala.collection.immutable.Range = Range(1, 8, 15, 22, 29, 36, 43, 
                                                  //| 50, 57, 64, 71, 78, 85, 92, 99, 106, 113, 120, 127, 134, 141, 148, 155, 162,
                                                  //|  169, 176, 183, 190, 197, 204, 211, 218, 225, 232, 239, 246, 253, 260, 267, 
                                                  //| 274, 281, 288, 295, 302, 309, 316, 323, 330, 337, 344, 351)
 	val futureFridays = range.map { x => priorFriday + x   }
                                                  //> futureFridays  : scala.collection.immutable.IndexedSeq[io.lamma.Date] = Vect
                                                  //| or(Date(2015,6,13), Date(2015,6,20), Date(2015,6,27), Date(2015,7,4), Date(2
                                                  //| 015,7,11), Date(2015,7,18), Date(2015,7,25), Date(2015,8,1), Date(2015,8,8),
                                                  //|  Date(2015,8,15), Date(2015,8,22), Date(2015,8,29), Date(2015,9,5), Date(201
                                                  //| 5,9,12), Date(2015,9,19), Date(2015,9,26), Date(2015,10,3), Date(2015,10,10)
                                                  //| , Date(2015,10,17), Date(2015,10,24), Date(2015,10,31), Date(2015,11,7), Dat
                                                  //| e(2015,11,14), Date(2015,11,21), Date(2015,11,28), Date(2015,12,5), Date(201
                                                  //| 5,12,12), Date(2015,12,19), Date(2015,12,26), Date(2016,1,2), Date(2016,1,9)
                                                  //| , Date(2016,1,16), Date(2016,1,23), Date(2016,1,30), Date(2016,2,6), Date(20
                                                  //| 16,2,13), Date(2016,2,20), Date(2016,2,27), Date(2016,3,5), Date(2016,3,12),
                                                  //|  Date(2016,3,19), Date(2016,3,26), Date(2016,4,2), Date(2016,4,9), Date(2016
                                                  //| ,4,16), Date(2016,4,23), Date(2016,4,30), Date(2016,5,7), Date(2016,5,14), D
                                                  //| ate(2016,5,21), Date(201
                                                  //| Output exceeds cutoff limit.
}