package com.edureka.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object TestTransformation2 {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf();
    sparkConf.setAppName(WordCountDriver.getClass.getName);
    sparkConf.setMaster("local[*]");
    sparkConf.set("spark.submit.deployMode", "client");

    val sc = new SparkContext(sparkConf);

    val input = List("ONE", "TWO", "TWO", "FOUR", "FIVE", "SIX", "EIGHT", "EIGHT", "NINE", "NINE", "TEN");

    val inputRDD = sc.parallelize(input, 2);
    
    val addOne = inputRDD.map(w=> (w,1))
    
    /**
    {("TWO",1),("TWO",1),("TWO",1),("TWO",1),("TWO",1) }  --> TWO -> {1,1,1,1,1} --> acc = 1, i =1
    																										 acc = 2, i =1
    																										 acc = 3, i =1
    																										 acc = 4, i =1
    																										 "TWO",5
    * 
    */
    
    val fn = (acc:Int,i:Int) => acc+i;
    
    var rDD = addOne.reduceByKey(fn)
    
    val dRDD = inputRDD.distinct();
    
    val a = sc.parallelize(1 to 20, 2);
    val b = sc.parallelize(10 to 30, 2);
    
    val unionRDD = a.union(b);
    
    
    val paraInput = List("DEER RIVER RIVER","CAT BEAR RIVER");
    
    val paraRDD = sc.parallelize(paraInput);
    
    val splitRDD = paraRDD.flatMap(i => i.split(" "));
    val colalesceRDD  = splitRDD.coalesce(1);
    colalesceRDD.collect().foreach(println)
    
    val substractRDD = a.subtract(b);
    substractRDD.collect().foreach(println)
    
    
    rDD.collect.foreach(println);
    dRDD.collect.foreach(println);
    unionRDD.collect.foreach(println);
    
  }
}