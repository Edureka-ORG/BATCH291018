package com.edureka

object Reservation {
  private var lastNum = 0;
  
  def getResNum():Int = {
    lastNum = lastNum+1;
    lastNum;
  }
}

class Reservation {
  
  def m1(){
    println("In Class");
  }
  
}