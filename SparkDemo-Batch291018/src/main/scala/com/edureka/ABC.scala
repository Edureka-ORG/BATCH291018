package com.edureka

trait ABC {
  def isEqual(m:Any):Boolean;
  
  def isNotEqual(m:Any):Boolean = !isEqual(m);
  
}

trait xyz {
  def test(x:Int):Int;
}