

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import scala.collection.mutable.Stack
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class LammaDateTest extends FlatSpec with Matchers {

  "A stack " should "Pop value in last-in-first-out order " in {
    val stack = Stack[Int]()
    stack.push(1)
    stack.push(2)

    stack.pop() should be(2)
    stack.pop() should be(1)
  }
}