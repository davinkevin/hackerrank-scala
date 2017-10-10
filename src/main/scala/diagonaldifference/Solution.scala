package diagonaldifference

import scala.io.Source

/**
  * Created by kevin on 08/10/2017
  */
object Solution {
  def main(args: Array[String]): Unit = {
    val lines = Source.stdin.getLines().toList
    //val lines = List("3", "11 2 4", "4 5 6", "10 8 -12")
    computeDiagonalDiff(lines)
  }

  private def computeDiagonalDiff(lines: List[String]): Unit = {
    val n = lines.head.toInt
    val matrix = lines.tail.map(v => v.split(" ").toList.map(v => v.toInt))

    var leftToRightDiag = 0
    var rightToLeftDiag = 0

    0.until(n).foreach(v => {
      leftToRightDiag += matrix(v)(v)
      rightToLeftDiag += matrix(v)( n - 1 - v)
    })

    println(Math.abs(leftToRightDiag - rightToLeftDiag))
  }
}
