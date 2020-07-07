package com.bs.learn

import scala.collection.mutable.ArrayBuffer

object Exercise08 {
  def main(args: Array[String]): Unit = {
    val rowSize = 11
    val colSize = 11
    val chessMap = Array.ofDim[Int](rowSize, colSize)
    chessMap(1)(2) = 1
    chessMap(2)(3) = 2

    val sparseArr = ArrayBuffer[Node]()
    val node = new Node(rowSize, colSize, 0)
    sparseArr.append(node)
    for (i <- 0 until chessMap.length) {
      for (j <- 0 until chessMap(i).length) {
        if (chessMap(i)(j) != 0) {
          val node = new Node(i, j, chessMap(i)(j))
          sparseArr.append(node)
        }
      }
    }
    for (node <- sparseArr) {
      printf("%d\t%d\t%d\n", node.row, node.col, node.value)
    }
    //存盘

    //读盘

    //稀疏数组->原始数组
    val newnode = sparseArr(0)
    val rowSize1 = newnode.row
    val colSize1 = newnode.col
    val chessMap1 = Array.ofDim[Int](rowSize1, colSize1)
    for (i <- 1 until sparseArr.length) {
      val node = sparseArr(i)
      chessMap1(node.row)(node.col) = node.value
    }

    for (item <- chessMap1) {
      for (item2 <- item) {
        printf("%d\t", item2)
      }
      println()

    }


  }
}

class Node(val row: Int, val col: Int, val value: Int)
