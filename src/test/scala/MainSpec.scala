import collection.mutable.Stack
import org.scalatest._

class MainSpec extends WordSpec with Matchers {

  "calling fizzbuzz with value 0" should {
    "return string 0" in {
      Main.fizzBuzz(0) shouldBe "0"
    }
  }

  "calling fizzbuzz with value 0" should {
    "return string 1" in {
      Main.fizzBuzz(1) shouldBe "1"
    }
  }
  "calling fizzbuzz with value 2" should {
    "return string 2" in {
      Main.fizzBuzz(2) shouldBe "2"
    }
  }

  "calling divisibleByThreeBool with 3" should {
    "return true" in {
      Main.divisibleByThreeBool(3) shouldBe true
    }
  }

  "calling divisbleByThreeBool with 2" should {
    "return false" in {
      Main.divisibleByThreeBool(2) shouldBe false
    }
  }

  "calling divisibleByFiveBool with 3" should {
    "return false" in {
      Main.divisibleByFiveBool(3) shouldBe false
    }
  }

  "calling divisibleByFiveBool with 5" should {
    "return true" in {
      Main.divisibleByFiveBool(5) shouldBe true
    }
  }




}
