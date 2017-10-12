package plusminus

import scala.io.Source

/**
  * Created by kevin on 09/10/2017
  */
object Solution {

  def main(args: Array[String]): Unit = {
    Source.stdin.getLines().drop(1).foreach(v => computeLines(v))
    //computeLines("-4 3 -9 0 4 1")
  }

  def computeLines(v: String): Unit = {
    val numbers = v.split(" ").toList
    val size = numbers.length.toFloat

    (numbers
      .map(v => v.toInt)
      .foldLeft((0, 0, 0))((acc, v) => {
        v match {
          case _ if v > 0 => (acc._1 + 1, acc._2, acc._3)
          case _ if v < 0 => (acc._1, acc._2 + 1, acc._3)
          case _ if v == 0 => (acc._1, acc._2, acc._3 + 1)
        }
      }) match {
      case (x, y, z) => List(x, y, z)
    })
      .map(v => v.toFloat)
      .map(v => v/size)
      .foreach(v => println(v))
  }
}
