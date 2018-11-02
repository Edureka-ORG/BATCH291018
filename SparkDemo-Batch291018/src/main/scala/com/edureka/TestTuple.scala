package com.edureka

object TestTuple {
  
  def main(args: Array[String]): Unit = 
  {
    val address = (1,"SanthNagar","hyderabad",500001);
    println(address._1)
    println(address._2)
    println(address._3)
    println(address._4)
//    println(address._5)
    
    address.productIterator.foreach(println)
    
    val s = ("BBBB","AAAA")
    s.swap.productIterator.foreach(println)
    
    println(address.toString)
    
    
  }
}