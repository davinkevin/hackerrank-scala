package algorithms.warmup.comparethetriplets

import scala.io.Source

/**
  * Created by kevin on 08/10/2017
  */
object Solution {

  def main(args: Array[String]): Unit = {
    val (aliceScore, bobScore) = (Source.stdin.getLines()
      .slice(0, 2)
      .map(v => v.split(" ").toList.map(v => v.toInt))
      .toList match {
      case List(a, b) => (a, b)
    })
      .zipped
      .toList
      .foldLeft((0, 0)) {
        (acc, tup) => { tup match {
            case (x, y) if x > y => (acc._1+1, acc._2)
            case (x, y) if x < y => (acc._1, acc._2+1)
            case (x, y) if x == y => acc
          }
        }
      }

    println(s"$aliceScore $bobScore")
  }
}
