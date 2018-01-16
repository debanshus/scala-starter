package basics

object VariableDeclaration extends App {
  val fruit: String = "Apple"
  //fruit = "orange"
  println(fruit)

  var price: Double = 10.5
  price = 15.7
  println(price)

  lazy val count: Int = 10
  println(count)

  var population: Long = _
  population = 15466831L
  println(population)

  println(s"This fruit is $fruit")

  //type inferencing
  var person = "Martin"
  var age = 45
  person.concat(" Odersky")
  age = age + 10
  println(s"$person is $age years old")


}
