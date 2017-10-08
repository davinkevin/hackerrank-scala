package simplearraysum

import scala.io.Source

/**
  * Created by kevin on 08/10/2017
  */
object Solution {

  def main(args: Array[String]) {
    val sum = Source.stdin.getLines()
      .slice(1, 2)
      .flatMap(v => v.split(" "))
      .map(v => v.toInt)
      .sum

    println(sum)
  }
}
