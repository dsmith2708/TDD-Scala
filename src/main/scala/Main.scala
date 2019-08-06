object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  def fizzBuzz(x: Int): String = {
    x match {
      case 0 =>"0"
      case 1 =>"1"
      case 2 =>"2"
    }
  }

  def divisibleByThreeBool(x: Int): Boolean = {
    true
  }

  def divisibleByFiveBool(x: Int): Boolean = {
    true
  }

}
