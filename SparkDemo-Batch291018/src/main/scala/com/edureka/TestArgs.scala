package com.edureka

object TestArgs 
{
  
  def add(i:Int=0, y:Int=0) :Int = {
    println("i="+i)
    println("j="+y)
    i+y;
  }
  def main(args: Array[String]): Unit = {
    println(add(2,3));
    println(add(2))
    println(add())
    println(add(y = 29, i=30))
  }
}