class main {

  def main(args: Array[String]): Unit = {
    val tableFactory = FurnitureFactory("TABLE")
    val lumberQuantity = tableFactory.lumberQuantity("Cherry")
    val cost = tableFactory.calculateCost(lumberQuantity)
    println(cost)


  }

}
