package com.edureka

object TestControlStructures {
  
  def main(args: Array[String]): Unit = {
    
    var x = 31;
    if(x < 20) {
      println("In the for loop");
    }
    
    var s = if( x%2 == 0) {
      "EVEN" }
    else {
      "ODD"
    }
    println(s)
    
    var an = if( x%2 == 0) {
      "EVEN" }
    else {
      1
    }
    println(an)
  }
  
}