object PatternMatching extends App {

  var values = List("apple", "potato", "ubuntu", "windows", "alto")

  for (value <- values) {
    var result = value match {
      case "apple" => "fruit"
      case "potato" => "vegetable"
      case "ubuntu" | "windows" => "operating system"
      case _ => "nothing"
    }

    println(s"$value is a/an $result")
  }

  var list = List("hello", 0.25, 1, 0.67F, true)
  for (item <- list){
    item match {
      case item: Int => println(s"${item} is integer")
      case item: Double => println(s"${item} is double")
      case item: Float => println(s"${item} is float")
      case item: String => println(s"${item} is string")
      case item: Boolean => println(s"${item} is boolean")
    }
  }
}