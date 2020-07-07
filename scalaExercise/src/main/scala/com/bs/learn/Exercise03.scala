package com.bs.learn

object Exercise03 {
  def main(args: Array[String]): Unit = {
    //    def quickSort(list: List[Int]): List[Int] = list match{
    //      case Nil => Nil
    //      case ::(pivot,t) => quickSort(t.filter(_<=pivot)) ++List(pivot) ++ quickSort(t.filter(_>pivot))
    //    }
    //    println(quickSort(List(1,3,5,4,6,2)))

    //    def quickSort(a:List[Int]):List[Int]={
    //      if (a.length < 2) a
    //      else quickSort(a.filter(_ < a.head)) ++
    //        a.filter(_ == a.head) ++
    //        quickSort(a.filter(_ > a.head))
    //    }

    val a = List(1, 2, 3, 4, 5)
    a match {
      case x :: Nil => println("type 1, ", x)
      case Nil => println("type 2, ", Nil)
      case 1 :: 2 :: x => println("type 3, ", x)
      case _ => println("do not match")
    }
  }

}
