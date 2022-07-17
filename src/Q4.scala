

object Q4 {

  def priceWithDiscount(noOfCopies: Int): Double = {
    (24.95 * noOfCopies) - (24.95 * noOfCopies * 0.4)
  }

  def shippingCost(noOfCopies: Int): Double = {
    if (noOfCopies <= 50) {
      (3 * (noOfCopies));
    } else {
      (3 * noOfCopies) + ((noOfCopies - 50) * 0.75);
    }

  }
  def totalCost(noOfCopies: Int): Double = {
    priceWithDiscount(noOfCopies) + shippingCost(noOfCopies);
  }

  def main(args: Array[String]) {
    
    printf("%.2f",totalCost(60));
   
  }
}