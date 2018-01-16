package basics

object StringInterpolation {

  def main(args: Array[String]): Unit = {

    val person: String = "martin"
    val age: Int = 52
    println(s"$person is $age years old")

    var someItem: Item = new Item("football", 500.87)
    println(s"price of the ${someItem.name} is ${someItem.price}")

    val price: Double = 50.3
    println(s"${price + 10.5}")

    println(s"is martin ? ${person == "martin"}")

    println(raw"$person\t$age")
  }
}

case class Item(name: String, price: Double)
