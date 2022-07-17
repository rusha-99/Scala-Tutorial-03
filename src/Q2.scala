

object Q2 {

  def convertTempToFahrenheit(celsius: Double): Double = {
    celsius * 1.8000 + 32.00;

  }

  def main(args: Array[String]) {
    println(convertTempToFahrenheit(35)); 
  }
}