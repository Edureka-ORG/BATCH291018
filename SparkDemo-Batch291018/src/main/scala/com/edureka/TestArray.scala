package com.edureka

object TestArray 
{
  def main(args: Array[String]): Unit = {
    
    var a = Array(1,2,3);
    println(a(0))
    a(1)=3
//    println(a(4));
    a.foreach(println)
    
    var b = new Array[Int](3);
    println(b(0))
    println(b(1))
    
    b.foreach(println)
    b(1) = 2;
    b.foreach(println)
  }
}