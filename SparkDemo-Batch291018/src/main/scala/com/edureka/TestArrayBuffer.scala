package com.edureka

import scala.collection.mutable.ArrayBuffer

//import scala.Mutable.
object TestArrayBuffer {
  def main(args: Array[String]): Unit = 
  {
    
    var a = ArrayBuffer[Int]();
    
    a +=1;
    a += (2,3,4)
    a ++=Array(5,6,7)
    
    a.foreach(println)
  }
}