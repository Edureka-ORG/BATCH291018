package com.edureka

class Duck(age:Int, color :String) {
  
  
  private var _loc = "";
  
  def this(age:Int,color:String,loc:String){
    this(age,color);
    Reservation.getResNum();
    _loc=loc;
    
  }
  
  private var _size = 1;
  private var _name = "";
  
  def size = _size;  //getter
  
 private def size_=(size:Int):Unit = {   //setter
    _size=size;
  }
 
 def computeSize(i:Int):Int = {
   _size = i;
   size;
 }
  
  
}