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

  "calling fizzbuzz with 3" should {
    "return string fizz" in {
      Main.fizzBuzz(3) shouldBe "fizz"
    }
  }

  "calling fizzbuzz with 5" should {
    "return string buzz" in {
      Main.fizzBuzz(5) shouldBe "buzz"
    }
  }
  "calling fizzbuzz with 15" should {
    "return string fizzbuzz" in {
      Main.fizzBuzz(15) shouldBe "fizzbuzz"
    }
  }

  "calling fizzbuzz with a negative number" should {
    "return a string of that number if divisible by 3 or 5" in {
      val x = -15
      Main.fizzBuzz(x) shouldBe x.toString
    }
    "return a string of that number if not divisible by 3 or 5" in {
      val x = -14
      Main.fizzBuzz(x) shouldBe x.toString
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
