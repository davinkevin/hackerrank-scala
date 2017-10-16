package staircase

import java.util.Scanner

/**
  * Created by kevin on 14/10/2017
  */
object Solution {
  def main(args: Array[String]): Unit = {
    val size = new Scanner(System.in).nextInt
    //val size = 6

    val lines = List.fill(size)(List.fill(size)("#"))

    Range(1, size+1)
        .map(v => stairs(v, size))
        .foreach(println)
  }

  def stairs ( level : Int, size: Int ): String = {
    " " * (size - level) + "#" * level
  }
}
