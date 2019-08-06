import collection.mutable.Stack
import org.scalatest._

class MainTest extends FlatSpec with Matchers {
  Main.fizzBuzz(0,0) should be "0"
}
