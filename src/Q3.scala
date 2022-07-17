

object Q3 {

  def volumeOfSphere(radius: Double): Double = {
    4 / 3 * math.Pi * radius * radius * radius;
  }

  def main(args: Array[String]) {
    println(volumeOfSphere(5));
  }
}