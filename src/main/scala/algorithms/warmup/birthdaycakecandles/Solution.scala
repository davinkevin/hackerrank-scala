package algorithms.warmup.birthdaycakecandles

import scala.io.Source

/**
  * Created by kevin on 15/10/2017
  */
object Solution {

  def compute(candles: String): Unit = {
    val candleSizes = candles.split(" ")
      .toList
      .map(v => v.toInt)

    val max = candleSizes.max

    println(candleSizes.count(v => v == max))
  }

  def main(args: Array[String]): Unit = {
    val candles = Source.stdin.getLines().drop(1).toList.head
    //val candles = "3 2 1 3"

    compute(candles)
  }
}
