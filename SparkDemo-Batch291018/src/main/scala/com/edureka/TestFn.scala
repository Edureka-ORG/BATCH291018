package com.edureka

class TestFn {
  
  def add(a:Int, b:Int):Int = {
    a+b;
  }
  
  var fn = (a:Int,b:Int) => a+b;
  
  
  
  def HAdd(fn:(Int,Int) => Int, a:Int,b:Int):Int = {
    fn(a,b);
  }
  
  
  HAdd(fn,2,3);
  
}