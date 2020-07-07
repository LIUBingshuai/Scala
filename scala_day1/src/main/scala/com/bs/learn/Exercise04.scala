package com.bs.learn

object Exercise04 {
  def main(args: Array[String]): Unit = {
    // i可以是一个代码块
    //    val res = for (i <- 1 to 10) yield i * 2
    //    println(res)
    //
    //    for (i <- Range(1,10,2)){
    //      println("i = " + i)
    //    }
    var sum = 0
    for (i <- 1 to 100 if i % 9 == 0) {
      //      println("i = " + i)
      sum = sum + i

    }
    println(sum)

    var loop = true
    var sum1 = 0
    for (i <- 1 to 100 if loop == true) {
      sum1 += i
      if (sum1 > 20) {
        println(i)
        loop = false
      }
    }


  }
}