object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  def fizzBuzz(x: Int): String = {
    (divisibleByThreeBool(x), divisibleByFiveBool(x)) match {
      case _ if (x == 0) => x.toString
      case (true, true) => "fizzbuzz"
      case (true, false) => "fizz"
      case (false, true) => "buzz"
      case _ => x.toString()
    }

  }

  def divisibleByThreeBool(x: Int): Boolean = {
    x % 3 match {
      case 0 => true
      case _ => false
    }
  }

  def divisibleByFiveBool(x: Int): Boolean = {
    x % 5 match {
      case 0 => true
      case _ => false
    }
  }

}
