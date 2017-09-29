package findthepoint

import scala.io._

/**
  * Created by kevin on 29/09/2017
  */
object Solution {

  def main(args: Array[String]) {
    Source.stdin.getLines().drop(1).foreach(calculateRForLine)
  }

  def calculateRForLine(line: String): Unit = {
    val points = line.split(" ")
      .map(v => v.toInt)
      .grouped(2)
      .toList
      .map(v => (v(0), v(1)))

    val (p, q) = (points.head, points(1))

    val r = ( (q._1 - p._1) + q._1, (q._2 - p._2) + q._2)

    println(s"${r._1} ${r._2}")
  }

}
