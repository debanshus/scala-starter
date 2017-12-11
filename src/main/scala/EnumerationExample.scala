import Color.Color

object EnumerationExample extends App {

  println(s"printing enum values: ${Color.red}, ${Color.blue}, ${Color.white}")
  println(s"printing enum id's: ${Color.red.id}, ${Color.blue.id}, ${Color.white.id}")

  val enumValues = Color.values
  println("printing all values of enum: ")
  enumValues.foreach(println)

  val something: Color = Color.blue
  var patternMatchResult = something match {
    case v if v == Color.red => "matched with red"
    case v if v == Color.green => "matched with green"
    case v if v == Color.blue => "matched with blue"
    case _ => "matched with nothing"
  }
  println(s"pattern matching result: $patternMatchResult")

}

object Color extends Enumeration {
  var red = Value("RED")
  var green = Value("GREEN")
  var blue, white = Value("SOMETHING")

  type Color = Value
}
