package com.edureka.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkConf

object TestDataset {
  
  def main(args: Array[String]): Unit = {
     val sparkConf = new SparkConf

    sparkConf.setAppName("SparkSQL-Dataset")
    sparkConf.setMaster("local[*]");
    sparkConf.set("spark.submit.deployMode", "client");

    val spark = SparkSession.builder().config(sparkConf).getOrCreate();
    
    val e1 = Employee("Andy",32);
    val e2 = Employee("Sandy",30);
    val e3 = Employee("Joe",28);
    
    val emps = Seq(e1,e2,e3);
    
    import spark.implicits._;
    
    val empDS = emps.toDS
  }
}