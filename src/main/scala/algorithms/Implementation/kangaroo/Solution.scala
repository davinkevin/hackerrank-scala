package algorithms.Implementation.kangaroo

import scala.io.Source

/**
  * Created by kevin on 15/10/2017
  */
object Solution {
  def main(args: Array[String]): Unit = {
    val n = Source.stdin.getLines().toList.head.split(" ").map(_.toInt)
    val k1 = (n(0), n(1))
    val k2 = (n(2), n(3))

    val result = if(sameLocation(k1, k2)) "YES" else "NO"

    println(result)
  }

  def sameLocation(k1: (Int, Int), k2: (Int, Int)): Boolean = {
    val (x1, v1) = k1
    val (x2, v2) = k2

    if (v1 < v2) {
      return false
    }

    if (!(x1 < x2) || !(v1 > v2)) {
      return false
    }

    val xDiff = (x1 - x2).abs
    val vDiff = (v1 - v2).abs

    if (xDiff % vDiff == 0) true else false
  }

}
