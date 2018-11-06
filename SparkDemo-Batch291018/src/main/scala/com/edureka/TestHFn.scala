package com.edureka

object TestHFn {
  
  //2,7  -- > 2+3+4+5+6+7
  //2,7  -- > 2*2+3*3+4*4+5*5+6*6+7*7
  
  
  def sumInts(a:Int, b:Int):Int = {
    if(a>b) 0 else a+sumInts(a+1,b)
  }
  
  def sumSqrs(a:Int, b:Int):Int = {
    if(a>b) 0 else a*a+sumSqrs(a+1,b)
  }
  
  def sumCubes(a:Int, b:Int):Int = {
    if(a>b) 0 else a*a*a+sumCubes(a+1,b)
  }
  
  def HAInts(fn:(Int) => Int, a:Int, b:Int):Int = {
    if(a>b) 0 else fn(a) +HAInts(fn,a+1,b)
  }
  
  var sI = (a:Int) => a
  var sS = (a:Int) => a*a
  var sC = (a:Int) => a*a*a
  
  def fact(a:Int):Int = {
    if(a == 0) {
      1
    }else{
      a*fact(a-1);
    }
  }
  
  HAInts(sI,1,2)
  HAInts(sS,1,2)
  HAInts(sC,1,2)
  HAInts(fact,3,4)
}