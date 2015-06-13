import org.joda.time.Months
import massdemand.RecurringDays

object dateWorksheet {
  import io.lamma._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(140); 

  val date = new java.util.Date();System.out.println("""date  : java.util.Date = """ + $show(date ));$skip(38); 
  val firstJan2015 = Date(2015, 1, 1);System.out.println("""firstJan2015  : io.lamma.Date = """ + $show(firstJan2015 ));$skip(48); 

  val now = new java.util.GregorianCalendar();System.out.println("""now  : java.util.GregorianCalendar = """ + $show(now ));$skip(83); val res$0 = 
  //val julyDates = Date(2015, 7, 7).daysOfMonth.toList

  firstJan2015.dayOfWeek;System.out.println("""res0: io.lamma.DayOfWeek = """ + $show(res$0));$skip(126); 
  val today = Date(now.get(java.util.Calendar.YEAR), now.get(java.util.Calendar.MONTH) + 1, now.get(java.util.Calendar.DATE));System.out.println("""today  : io.lamma.Date = """ + $show(today ));$skip(63); 

  val weekly = RecurringDays.recurringDays(Saturday).take(4);System.out.println("""weekly  : List[io.lamma.Date] = """ + $show(weekly ));$skip(50); 
  val monthly = RecurringDays.monthly(20).take(2);System.out.println("""monthly  : List[io.lamma.Date] = """ + $show(monthly ));$skip(46); 
  val jackDemand = weekly.map { x => (x, 2) };System.out.println("""jackDemand  : List[(io.lamma.Date, Int)] = """ + $show(jackDemand ));$skip(48); 
  val jillDemand = monthly.map { x => (x, 10) };System.out.println("""jillDemand  : List[(io.lamma.Date, Int)] = """ + $show(jillDemand ));$skip(59); 
  val allUserDemand = List(jackDemand, jillDemand).flatten;System.out.println("""allUserDemand  : List[(io.lamma.Date, Int)] = """ + $show(allUserDemand ));$skip(68); val res$1 = 
  allUserDemand.filter{case (dt, demand) => dt == Date(2015,6,20) };System.out.println("""res1: List[(io.lamma.Date, Int)] = """ + $show(res$1))}
}
