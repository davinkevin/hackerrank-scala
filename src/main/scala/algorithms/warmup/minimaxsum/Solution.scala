package algorithms.warmup.minimaxsum

import scala.io.Source

/**
  * Created by kevin on 14/10/2017
  */
object Solution {
  def main(args: Array[String]): Unit = {
    Source.stdin.getLines().foreach(v => compute(v))
    //compute("1 2 3 4 5")
  }

  def compute(str: String): Unit = {
    val numbers = str.split(" ")
      .toList
      .map(v => BigInt(v))

    val global = numbers.sum
    val maxSum = global - numbers.min
    val minSum = global - numbers.max

    print(minSum + " " + maxSum)
  }
}
