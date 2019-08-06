import collection.mutable.Stack
import org.scalatest._

class MainSpec extends WordSpec with Matchers {
  "calling fizzbuzz with value 0" should {
    "return string 0" in {
      assert(Main.fizzbuzz(0) === "0")
    }
  }
}
