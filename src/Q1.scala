

object Q1 {

  def areaOfDisk(radius: Int): Double = {
    radius * radius * math.Pi;
  }
  
  def main(args: Array[String]) {
     println(areaOfDisk(5));     
  }
}