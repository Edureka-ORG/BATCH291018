package com.edureka

import scala.collection.mutable.ListBuffer

object TestMutalableList {
  
  def sum(l:List[Int]):Int = {
    if(l == Nil){
      return 0
    }else{
    println(l.mkString(","))
    l.head + sum(l.tail)
    }
    
  }
  
  
  
  def main(args: Array[String]): Unit = {
    val lst = new ListBuffer[String]();
    lst += "test"
    lst += "test1"
    lst.foreach(println)
    
    lst += ("aaa","bbb")
    
    lst.foreach(println)
    
    lst -=("aaa")
    
    lst.foreach(println)
    
    
    val l = List(3)
    
    l.foreach(println)
    
    val another = 3::4::l;
    another.foreach(println)
    
    val z = -1 :: another
    z.foreach(println)
    
    
    var x = List(3)
    
    x = 4 :: x
    x = 5 :: x
    x.foreach(println);
    
    val ol = List.range(1, 20);
    ol.foreach(print)
    println
    val fl = ol.filter(e => e > 6);
    fl.foreach(print)
    println
    
    val m1 = List.range(1, 10);
    val m2 = List.range(11,20)
    
    val m3  = m1 ++ m2

    println(m3.mkString(","))
    
    val m4 = m1 ::: m2
    println(m4.mkString(","))
    
    val m5 = List.concat(m1,m2);
    println(m5.mkString(","))
    
    println(m5.head)
    println((5::m5).mkString(","))
    
    sum(m1);
    
    
  }
  
  
  
  
}