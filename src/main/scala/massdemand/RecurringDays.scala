package massdemand

import io.lamma._
import io.lamma.DayOfMonth.NthDayOfMonth

/**
 * @author Mohan
 */
object RecurringDays {
  def recurring(dayOfWeek: io.lamma.DayOfWeek): List[Date] = {
    val priorDay = today.previous(dayOfWeek)
    val range = (1 to 52)
    val futureDays = range.map { x => priorDay + (x * 7) }
    futureDays.toList
  }
  def monthly(dayOfMonth: Int): List[Date] = {
    val range = (0 to 11)
    val nthDayOfMonth = today.firstDayOfMonth.plusDays(dayOfMonth-1)
    val futureDays = range.map { x => nthDayOfMonth.plusMonths(x) }
    futureDays.toList
  }

  def today = Date(now.get(java.util.Calendar.YEAR), now.get(java.util.Calendar.MONTH) + 1, now.get(java.util.Calendar.DATE))
  def now = new java.util.GregorianCalendar()
}