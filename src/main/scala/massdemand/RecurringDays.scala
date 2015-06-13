package massdemand

import io.lamma._

/**
 * @author Mohan
 */
object RecurringDays {
  def recurringDays(dayOfWeek: io.lamma.DayOfWeek): List[Date] = {
    val priorDay = today.previous(dayOfWeek)
    val range = (1 to 52)
    val futureDays = range.map { x => priorDay + (x*7 - 1) }
    futureDays.toList
  } 

  def today = Date(now.get(java.util.Calendar.YEAR), now.get(java.util.Calendar.MONTH) + 1, now.get(java.util.Calendar.DATE))
  def now = new java.util.GregorianCalendar()
}