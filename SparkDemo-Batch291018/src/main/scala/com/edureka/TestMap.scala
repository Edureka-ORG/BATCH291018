package com.edureka

object TestMap {
  def main(args: Array[String]): Unit = {
    
    val mapping = Map("k1"->"v1","k2"->"v2")
    
    mapping.foreach(println)
    
    mapping.keys.foreach(println)
    
    mapping.values.foreach(println)
    
    println(mapping.contains("k1"));
        println(mapping.contains("v1"));

    println(mapping.getOrElse("k1", "zzz"));
        println(mapping.getOrElse("k4", "zzz"));

    
  }
}