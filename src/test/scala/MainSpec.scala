import collection.mutable.Stack
import org.scalatest._

class MainSpec extends WordSpec with Matchers {

  "The fizzbuzz function" when {
    "called with a positive value not divisible by 3 or 5 and less than 3" should {
      "return a string of that number" in {
        Main.fizzBuzz(1) shouldBe "1"
      }
    }
    "called with a positive value only divisible by 3" should {
      "return a string with the value fizz" in {
        Main.fizzBuzz(3) shouldBe "fizz"
      }
    }
    "called with a positive value only divisible by 5" should {
      "return a string with the value buzz" in {
        Main.fizzBuzz(5) shouldBe "buzz"
      }
    }
    "called with a positive value divisible by both 3 and 5" should {
      "return a string with the value fizzbuzz" in {
        Main.fizzBuzz(15) shouldBe "fizzbuzz"
      }
    }
    "called with a positive value not divisible by 3 or 5 and greater than 5" should {
      "return a string of that number" in {
        Main.fizzBuzz(7) shouldBe "7"
      }
    }
    "called with any number less than or equal to 0" should {
      "return a string of 0 when called with 0" in {
        Main.fizzBuzz(0) shouldBe "0"
      }
      "return a string of -1 when called with -1" in {
        Main.fizzBuzz(-1) shouldBe "-1"
      }
      "return a string of -15 when called with -15" in {
        Main.fizzBuzz(-15) shouldBe "-15"
      }
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
