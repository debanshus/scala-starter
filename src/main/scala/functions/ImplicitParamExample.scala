package functions

object ImplicitParamExample {

  def main(args: Array[String]): Unit = {
    implicit val product = Product(10, 50.5)
    calculatePrice("books")
  }

  def calculatePrice(article: String)(implicit product: Product): Unit = {
    var price = product.unit * product.rate
    println(s"total price of $article is $price")
  }
}

case class Product(var unit: Int, var rate: Double)
