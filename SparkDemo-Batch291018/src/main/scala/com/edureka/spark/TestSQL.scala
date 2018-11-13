package com.edureka.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext

object TestSQL {
  def main(args: Array[String]): Unit = {
    
    val sparkConf = new SparkConf
    
    sparkConf.setAppName("SparkSQL-Helloworld")
    sparkConf.setMaster("local[*]");
    sparkConf.set("spark.submit.deployMode", "client");
    
    
    val sc = new SparkContext(sparkConf);
    
    val sqlContext = new SQLContext(sc);
  }
}