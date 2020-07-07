package com.bs.learn

object Exercise06 {
  def main(args: Array[String]): Unit = {
    println(method1(5))
    println("桃子有" + peach(1))
  }

  def method1(n1: Int): Int = {
    if (n1 == 1) {
      1
    } else if (n1 == 2) {
      1
    } else {
      method1(n1 - 1) + method1(n1 - 2)
    }
  }

  def peach(n: Int): Int = {
    if (n == 10) {
      return 1
    } else {
      return (peach(n + 1) + 1) * 2
    }
  }

}
