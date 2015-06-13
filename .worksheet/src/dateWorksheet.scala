import org.joda.time.Months

object dateWorksheet {
  import io.lamma._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); 

  val date = new java.util.Date();System.out.println("""date  : java.util.Date = """ + $show(date ));$skip(38); 
  val firstJan2015 = Date(2015, 1, 1);System.out.println("""firstJan2015  : io.lamma.Date = """ + $show(firstJan2015 ));$skip(48); 

  val now = new java.util.GregorianCalendar();System.out.println("""now  : java.util.GregorianCalendar = """ + $show(now ));$skip(85); val res$0 = 

  //val julyDates = Date(2015, 7, 7).daysOfMonth.toList

  firstJan2015.dayOfWeek;System.out.println("""res0: io.lamma.DayOfWeek = """ + $show(res$0));$skip(126); 
  val today = Date(now.get(java.util.Calendar.YEAR), now.get(java.util.Calendar.MONTH) + 1, now.get(java.util.Calendar.DATE));System.out.println("""today  : io.lamma.Date = """ + $show(today ));$skip(229); 
  def recurringDays(dayOfWeek: io.lamma.DayOfWeek): List[Date] = {
    val priorDay = today.previous(dayOfWeek)
    val range = (1 to 356 by 7)
    val futureDays = range.map { x => priorDay + (x - 1) }
    futureDays.toList
  };System.out.println("""recurringDays: (dayOfWeek: io.lamma.DayOfWeek)List[io.lamma.Date]""");$skip(36); val res$1 = 

  recurringDays(DayOfWeek.FRIDAY);System.out.println("""res1: List[io.lamma.Date] = """ + $show(res$1))}
}
