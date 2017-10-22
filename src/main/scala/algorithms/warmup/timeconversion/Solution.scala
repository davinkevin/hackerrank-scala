package algorithms.warmup.timeconversion

import java.time.LocalTime
import java.time.format.DateTimeFormatter

import scala.io.Source

/**
  * Created by kevin on 15/10/2017
  */
object Solution {
  def main(args: Array[String]): Unit = {
    val input = Source.stdin.getLines().toList.head
    //val input = "06:40:03AM"

    Some(input)
      .map(DateTimeFormatter.ofPattern("hh:m:sa").parse)
      .map(LocalTime.from)
      .map(v => v.format(DateTimeFormatter.ofPattern("HH:mm:ss")))
      .foreach(println)
  }
}
