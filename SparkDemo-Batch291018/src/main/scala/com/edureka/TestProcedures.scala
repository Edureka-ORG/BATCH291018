package com.edureka

object TestProcedures {
  
  def rect_area(length:Float, breadth:Float) {
    val area = length*breadth;
    println(area);
  }
  def main(args: Array[String]): Unit = {
    rect_area(23.5f,34.5f)
  }
}