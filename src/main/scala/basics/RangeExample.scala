package basics

object RangeExample {
  def main(args: Array[String]): Unit = {
    var rangeTo = 1 to 5
    println(s"$rangeTo")
    for (i <- rangeTo) println(i)

    var rangeUntil = 1 until 5
    println(s"$rangeUntil")
    for (i <- rangeUntil) println(i)

    var rangeBy = 1 to 10 by 2
    println(s"$rangeBy")
    for (i <- rangeBy) println(i)

    var rangeChar = 'a' to 'z'
    println(s"$rangeChar")
    for (c <- rangeChar) print(c)

    var list = rangeChar.toList
    println("range to list")
    list.foreach(print(_))
  }
}
