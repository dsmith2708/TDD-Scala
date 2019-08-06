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
    x % 3 match {
      case 0 => true
      case _ => false
    }
  }

  def divisibleByFiveBool(x: Int): Boolean = {
    true
  }

}
