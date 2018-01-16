package basics

object ControlAndLooping extends App {

  //if else if in expression
  val input = 5
  val number = if (input > 5) "greater than 5" else if (input < 5) "less than 5" else "equal to 5"
  println(s"number = $number")

  //for-to
  println("printing even numbers from 1 to 10, including 10 using for-to")
  for (i <- 1 to 10) if (i % 2 == 0) println(i)

  //for-until
  println("printing odd numbers from 1 to 10, excluding 10 using for-until")
  for (i <- 1 until 11) if (i % 2 != 0) println(i)

  //for-each
  println("printing values from list using for-each")
  val fruits = List("apple", "banana", "orange", "potato", "grape")
  for (fruit <- fruits) println(fruit)

  //conditional for-each
  println("printing values from list with condition using for-each")
  for (fruit <- fruits if fruit != "potato") println(s"fruit : $fruit")

  //multi-variable for loop
  println("printing values from multi-variable for loop")
  for {
    i <- 1 until 10
    j <- 11 until 21
  } println(s"i=$i | j=$j")


  //while loop
  var counter = 0
  while (counter <= 10) {
    println(s"printing counter with while loop: $counter")
    counter+=1
  }

  //do-while loop
  var count = 0
  do {
    println(s"printing counter with do-while loop: $count")
    count+=1
  } while (count <= 10)

}
