package com.bs.learn

object Exercise07 {
  def main(args: Array[String]): Unit = {
    println(sayOK("may"))
    println(mysum(19, 23, 11, 22, 33))

  }

  def sayOK(name: String = "jack"): String = {
    return name + "ok"
  }

  def mysum(n1: Int, args: Int*): Int = {
    println("args.length = " + args.length)
    var sum = 0
    for (item <- args) {
      sum += item
    }
    sum
  }
//  def f1 = "vasddf"
//  //等价于
//  def f1()={
//    "vasddf"
//  }

}
