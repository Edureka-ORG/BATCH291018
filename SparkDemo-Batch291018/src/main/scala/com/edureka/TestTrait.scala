package com.edureka

class TestTrait extends ABC with xyz{
  
  override def isEqual(m:Any):Boolean = {
    return true;
  }
  
  override def test(x:Int):Int = {
    return x;
  }
}