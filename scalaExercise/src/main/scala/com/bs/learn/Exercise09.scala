package main.scala.com.bs.learn

import scala.io.StdIn

object Exercise09 {
  def main(args: Array[String]): Unit = {
    val queue = new ArrayQueue(6)
    var key = ""
    while (true) {
      println("show:表示显示队列")
      println("exit:表示退出队列")
      println("add:表示添加数字")
      println("get:表示获取数字")

      key = StdIn.readLine()
      key match {
        case "show" => queue.showQueue()
        case "add" => {
          println("请输入一个数")
          val num = StdIn.readInt()
          queue.addQueue(num)
        }
        case "exit" => System.exit(0)
        case "get" => {
          val res = queue.getQueue()
          if (res.isInstanceOf[Exception]) {
            println(res.asInstanceOf[Exception].getMessage)
          } else {
            println(s"取出数据是 $res")
          }
        }
      }
    }

  }

}

class ArrayQueue(arrMaxSize: Int) {
  val maxSize = arrMaxSize
  val arr = new Array[Int](maxSize)
  var front = -1
  var rear = -1

  def isFull(): Boolean = {
    rear == maxSize - 1
  }

  def isEmpty(): Boolean = {
    front == rear
  }

  def showQueue(): Unit = {
    if (isEmpty()) {
      println("队列空")
      return
    }
    for (i <- front + 1 to rear) {
      printf("arr[%d]=%d\n", i, arr(i))
    }
  }

  def addQueue(n: Int): Unit = {
    if (isFull()) {
      println("队列满")
      return
    }
    rear += 1
    arr(rear) = n

  }

  def getQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空")
    }
    front += 1
    return arr(front)
  }

}
