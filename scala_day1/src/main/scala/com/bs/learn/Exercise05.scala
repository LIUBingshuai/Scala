package com.bs.learn

import scala.collection.immutable.Range

object Exercise05 {
  def main(args: Array[String]): Unit = {
    //使用方法
    val dog = new Dog
    println(dog)
    println(dog.sum(10, 10))

    //方法转函数
    val f1 = dog.sum _
    println("f1 = " + f1)
    println("f1 = " + f1(10, 20))

    //函数
    val f2 = (a1: Int, a2: Int) => a1 + a2
    println(f2)
    println(f2(10,20))

  }

}

class Dog {

  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}