package com.edureka.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

// spark2-submit --verbose --master yarn --deploy-mode client --class com.edureka.spark.WordCountDriver sparkdemo-batch291018_2.11-1.0-SNAPSHOT.jar hdfs:/user/edureka_<YOUR-ID>/WordCount.txt
object WordCountDriver {
  
  def main(args: Array[String]): Unit = {
    
    println("WordCount-Spark");
    
    val sparkConf = new SparkConf();
    sparkConf.setAppName("WordCountDriver");
    sparkConf.setMaster("local[*]");
    sparkConf.set("spark.submit.deployMode", "client");
    
    val sc = new SparkContext(sparkConf);
    
    
    val input = List("DEER","RIVER","DEER","RIVER","DEER","RIVER","DEER","RIVER","DEER","RIVER","RIVER");
    
    val inputRDD = sc.parallelize(input, 2);
    
    inputRDD.countByValue().foreach(println);
    
    val wordCountInput = args(0)
    
   val wcRDD  = sc.textFile(wordCountInput);
   
   val words = wcRDD.flatMap(line=>line.split(" "))
   val reduceRDD = words.map(w=>(w,1)).reduceByKey(_+_);
   reduceRDD.collect().foreach(println);
   inputRDD.countByValue().foreach(println);
    
//    val input = args(0);
//    println("Input is :"+input)
//    val inputRDD = sc.textFile(input);
//    
//    inputRDD.collect().foreach(println);
    
    
  }
  
}