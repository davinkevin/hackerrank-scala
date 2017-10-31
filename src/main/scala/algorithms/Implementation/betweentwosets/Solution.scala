package algorithms.Implementation.betweentwosets

import scala.io.Source

/**
  * Created by kevin on 15/10/2017
  */
object Solution {
  def main(args: Array[String]): Unit = {
    val n = Source.stdin.getLines().slice(1, 3).toList
    val a = n.head.split(" ").map(_.toInt).toSet
    val b = n(1).split(" ").map(_.toInt).toSet

    println((a.min to b.max)
      .count(v =>
        a.forall(i => v % i == 0) &&
        b.forall(j => j % v == 0)
      )
    )
  }
}
