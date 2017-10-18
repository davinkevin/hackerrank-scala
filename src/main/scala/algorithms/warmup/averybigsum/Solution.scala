package algorithms.warmup.averybigsum

import scala.io.Source

/**
  * Created by kevin on 08/10/2017
  */
object Solution {

  def main(args: Array[String]): Unit = {
    val sum = Source.stdin.getLines().slice(1, 2)
      .flatMap(v => v.split(" ").toList)
      .map(v => BigInt(v))
      .sum

    println(sum)
  }

}
