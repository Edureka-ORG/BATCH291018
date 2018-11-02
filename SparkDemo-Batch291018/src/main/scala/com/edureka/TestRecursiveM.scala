package com.edureka

object TestRecursiveM {
  
  def factorial(x:Int):Int = {
    if(x == 0) {
      return 1 
      }
    else {
      print(x+"*")
      x*factorial(x-1);
    }
  }
  
  def main(args:Array[String]):Unit = {
    println(factorial(4));
  }
}