

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import scala.collection.mutable.Stack
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import massdemand.RecurringDays
import io.lamma.DayOfWeek.FRIDAY
import io.lamma.DayOfWeek.SATURDAY

@RunWith(classOf[JUnitRunner])
class RecurringDaysTest extends FlatSpec with Matchers {

  "RecurringDaysTest" should "Generate next 52 recurring day for weekly API " in {
    RecurringDays.recurring(FRIDAY).length should be(52)
    RecurringDays.recurring(SATURDAY).length should be(52)
  }
}