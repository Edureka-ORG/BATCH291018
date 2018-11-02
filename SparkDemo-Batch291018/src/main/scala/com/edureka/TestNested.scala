package com.edureka

object TestNested {
  
  
  def factorial(x:Int):Int = {
    
    def fact(acc:Int, x:Int):Int = {
      if(x == 0){
        return acc;
      }else{
        fact(x*acc,x-1)
      }
    }
    fact(1,x);
  }
  
  
  
  def main(args: Array[String]): Unit = {
    println(factorial(5));
  }
}