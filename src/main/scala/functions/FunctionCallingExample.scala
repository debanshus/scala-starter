package functions

object FunctionCallingExample {
  def main(args: Array[String]): Unit = {
    functionWithDouble(10.5)
    functionWithInt(10)
    functionWithString("apple")

    println(s"${functionGeneric(10.5)}")
    println(s"${functionGeneric(10)}")
    println(s"${functionGeneric("apple")}")
    println(s"${functionGeneric()}")

    functionWithVarArgs()
    functionWithVarArgs("a")
    functionWithVarArgs("a", "b", "c")
    functionWithVarArgs(List("hello", "excuse"): _*)
  }

  def functionWithDouble(a: Double): Unit = {
    println(s"function with double parameter: $a")
  }


  def functionWithInt(a: Int): Unit = {
    println(s"function with integer parameter: $a")
  }


  def functionWithString(a: String): Unit = {
    println(s"function with string parameter: $a")
    List(1, 2)
  }

  def functionGeneric[T](a: T): List[T] = {
    a match {
      case d: Double =>
        println(s"$a is a double")
        List(a)
      case d: Int =>
        println(s"$a is a integer")
        List(a)
      case d: String =>
        println(s"$a is a string")
        List(a)
      case d: Unit =>
        println(s"$a is a unit")
        List(a)
      case _ =>
        println(s"$a is of non-supported type")
        List(a)
    }
  }

  def functionWithVarArgs(a: String*): Unit = {
    println(s"printing arguments: ${a.mkString(" , ")}")
  }
}
