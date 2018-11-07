package com.edureka.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object WordCountDriver {
  
  def main(args: Array[String]): Unit = {
    
    val sparkConf = new SparkConf();
    sparkConf.setAppName(WordCountDriver.getClass.getName);
    
    val sc = new SparkContext(sparkConf);
    
    val input = "hdfs:/user/edureka_144865/WordCount.txt";
    val inputRDD = sc.textFile(input);
    
  }
  
}