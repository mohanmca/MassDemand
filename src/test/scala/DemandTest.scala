

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import scala.collection.mutable.Stack
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import massdemand.RecurringDays
import io.lamma.DayOfWeek.FRIDAY
import io.lamma.DayOfWeek.SATURDAY
import io.lamma.DayOfWeek

@RunWith(classOf[JUnitRunner])
class DemandTest extends FlatSpec with Matchers {

  "MultiUserDemand" should "User Weekly, and Montly Recurring should add up " in {
    RecurringDays.recurring(DayOfWeek.SATURDAY).take(2)
  }
} 