package algorithms.Implementation.appleandorange

import java.util.Scanner

/**
  * Created by kevin on 15/10/2017
  */
object Solution {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)

    val house = sc.nextLine().split(" ").map(v => v.toInt).toList match { case List(x, y) => (x, y)}
    val (appleTree, orangeTree) = sc.nextLine().split(" ").map(v => v.toInt).toList match { case List(x, y) => (x, y)}
    sc.nextLine

    var numberOfAppleOnRoof = 0
    var numberOfOrangeOnRoof = 0

    sc.nextLine
      .split(" ")
      .map(v => v.toInt)
      .foreach {
        case v if house._1 to house._2 contains (appleTree + v ) => numberOfAppleOnRoof += 1
        case v => v
      }

    sc.nextLine
      .split(" ")
      .map(v => v.toInt)
      .foreach {
        case v if house._1 to house._2 contains (orangeTree + v ) => numberOfOrangeOnRoof += 1
        case v => v
      }

    println(numberOfAppleOnRoof)
    println(numberOfOrangeOnRoof)
  }
}
