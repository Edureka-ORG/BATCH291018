package com.edureka

object TestList {
  def main(args: Array[String]): Unit = {
    val lst = 1 :: 2 :: 3 :: Nil

    lst.foreach(println)

    3 :: lst
    lst.foreach(println)
    
    val dLst = List(1,2D,3D,4D,444400l);
    dLst.foreach(println)
    
    var x = List.range(1, 10)
    x.foreach(println)
    
    var f = List.fill(2)("default");
    f.foreach(println)
    
    var t = List.tabulate(5)(x => x*x)
    t.foreach(println)
  }
}