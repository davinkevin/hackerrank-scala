package algorithms.Implementation.gradingstudents

import scala.io.Source

/**
  * Created by kevin on 15/10/2017
  */
object Solution {
  def main(args: Array[String]): Unit = {
    Source.stdin.getLines().drop(1).foreach(computeNote)
    //"73 67 38 33".split(" ").toList.foreach(computeNote)
  }

  def computeNote(note: String): Unit = {
    val modifiedNote = note.toInt match {
      case v if v < 38 => v
      case v if gapToNextGrade(v) < 3 => v + gapToNextGrade(v)
      case v => v
    }

    println(modifiedNote)
  }

  def gapToNextGrade(note: Int): Int = {
    5 - note % 5
  }
}
