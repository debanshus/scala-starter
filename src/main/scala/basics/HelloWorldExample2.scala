package basics

object HelloWorldExample2 extends App {
  println("hello world from scala app")

  println("number of arguments: " + args.length)

  println("arguments: "+ args.mkString(","))
}
