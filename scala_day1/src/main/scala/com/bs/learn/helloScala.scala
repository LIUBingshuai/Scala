package com.bs.learn

object helloScala {
  def main(args: Array[String]): Unit = {
    println("hello scala,idea...")
    var arr = new Array[Int](10)

    for (item <- arr) {
      println("item=" + item)
    }
  }
}
