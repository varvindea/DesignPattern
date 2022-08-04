abstract class FurnitureFactory {

  def lumberQuantity(furnitureType: String): Long

  def calculateCost(lumberQuantity: Long): Long

}

object FurnitureFactory {

  val CHAIR = "CHAIR"
  val TABLE = "TABLE"
  val SOFA = "SOFA"

  def apply(factoryType: String): FurnitureFactory = {
    factoryType match {
      case CHAIR => new ChairFactory()
      case TABLE => new TableFactory()
      case SOFA => new SofaFactory()
    }
  }
}

private class TableFactory() extends FurnitureFactory {
  override def lumberQuantity(furnitureType: String): Long = {
    if (furnitureType.equalsIgnoreCase("cheery"))
      100
    else
      0
  }

  override def calculateCost(lumberQuantity: Long): Long = {
    lumberQuantity * 100
  }
}

private class ChairFactory() extends FurnitureFactory {
  override def lumberQuantity(furnitureType: String): Long = ???

  override def calculateCost(lumberQuantity: Long): Long = ???
}

private class SofaFactory() extends FurnitureFactory {
  override def lumberQuantity(furnitureType: String): Long = ???

  override def calculateCost(lumberQuantity: Long): Long = ???
}

