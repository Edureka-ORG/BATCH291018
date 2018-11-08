package com.edureka.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

// spark2-submit --verbose --master yarn --deploy-mode client --class com.edureka.spark.WordCountDriver sparkdemo-batch291018_2.11-1.0-SNAPSHOT.jar hdfs:/user/edureka_<YOUR-ID>/WordCount.txt
object WordCountDriver {
  
  def main(args: Array[String]): Unit = {
    
    println("WordCount-Spark");
    
    val sparkConf = new SparkConf();
    sparkConf.setAppName(WordCountDriver.getClass.getName);
    
    val sc = new SparkContext(sparkConf);
    
    val input = args(0);
    println("Input is :"+input)
    val inputRDD = sc.textFile(input);
    
    inputRDD.collect().foreach(println);
    
    
  }
  
}