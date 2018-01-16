package functions

class ImplicitFunctionExample(s: String) {
  def isApple(): Boolean = s == "apple"
}

object CheckIfApple {
  implicit def checkIfApple(s: String) = new ImplicitFunctionExample(s)
}

object MainExample extends App {
  val fruit1 = "apple"
  val fruit2 = "orange"

  println(s"Is Apple ? $fruit1.isApple()")
}
