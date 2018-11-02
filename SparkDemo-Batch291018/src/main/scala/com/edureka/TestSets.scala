package com.edureka

object TestSets {
  def main(args: Array[String]): Unit = {
    val s = Set(1,1,1,12,2,2,2,2,2,4,5,6)
    s.foreach(println)
    
    println(s.head)
    println(s.tail)
    println(s.isEmpty)
    
    val c1 = Set(1,1,1,1,14,5,6,7,43);
    val con=s ++ c1
    println(con.mkString(","))
    val comm = s & c1
    println(comm.mkString(","))
    val in = s intersect c1
    println(in.mkString(","))
    
    
  }
}