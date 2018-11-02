package com.edureka

object TestFunctionsAndMethods {
  
  //Definition of method
  def max(x:Int, y:Int):Int = {
    if(x > y)
      x
    else
      y
  }
  
  def sayHello(){
    println("In Hello");
  }
  
  def sayHello(msg:String){
    println("Hello"+msg)
  }
  
  def func():Int = {
    return 7;
  }
  
  def add(i:Int, y:Int):Int = {
    i+y;
  }
  
  def main(args:Array[String]):Unit = {
    println(max(2,4));
    sayHello
    sayHello("Test")
    println(func)
    println(add(2,3))
  }
}