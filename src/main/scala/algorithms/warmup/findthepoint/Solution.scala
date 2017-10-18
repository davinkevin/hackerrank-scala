package algorithms.warmup.findthepoint

import scala.io._

/**
  * Created by kevin on 29/09/2017
  */
object Solution {

  def main(args: Array[String]) {
    Source.stdin.getLines().drop(1).foreach(calculateRForLine)
  }

  def calculateRForLine(line: String): Unit = {
    val (p, q) = line.split(" ")
      .map(v => v.toInt)
      .grouped(2)
      .toList
      .map(v => (v(0), v(1)))
    match { case List(a, b) => (a, b) }

    val r = ( 2 * q._1 - p._1, 2 * q._2 - p._2)

    println(s"${r._1} ${r._2}")
  }

}
