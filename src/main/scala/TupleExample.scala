object TupleExample extends App {
  var tupleOne = Tuple2(1, "One")
  println(s"printing single tuple: $tupleOne")

  var tupleTwo = Tuple2(2, "Two")
  println(s"accessing tuple variable: $tupleTwo._1 - $tupleTwo._2")

  var tupleThree = (3, "Three")

  var tuples = List(tupleOne, tupleTwo, tupleThree)

  tuples.foreach(tuple => {
    tuple match {
      case (1, "One") => println("this is one")
      case (2, "Wrong") => println("this is wrong")
      case t if t._2 == "Three" => println("this is three")
      case _ => println("matches nothing")
    }
  })
}
