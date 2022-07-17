

object Q5 {

  def timeEasyPace(miles: Int): Int = {
    miles * 8;
  }

  def timeTempo(miles: Int): Int = {
    miles * 7;
  }

  def main(args: Array[String]) {

    println(timeEasyPace(2) + timeTempo(3) + timeEasyPace(2));

  }
}