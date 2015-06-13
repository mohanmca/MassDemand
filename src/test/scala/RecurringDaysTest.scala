

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import scala.collection.mutable.Stack
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import massdemand.RecurringDays
import io.lamma.DayOfWeek

@RunWith(classOf[JUnitRunner])
class RecurringDaysTest extends FlatSpec with Matchers {

  "RecurringDaysTest" should "Generate next 52 recurring day for weekly API " in {
    RecurringDays.recurringDays(DayOfWeek.FRIDAY).length should be(52)
    RecurringDays.recurringDays(DayOfWeek.SATURDAY).length should be(52)
  }
}