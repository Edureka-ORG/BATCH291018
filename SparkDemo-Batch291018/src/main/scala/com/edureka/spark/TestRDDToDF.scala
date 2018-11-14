package com.edureka.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkConf

object TestRDDToDF {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf

    sparkConf.setAppName("SparkSQL-RDD-DF-DS")
    sparkConf.setMaster("local[*]");
    sparkConf.set("spark.submit.deployMode", "client");

    val spark = SparkSession.builder().config(sparkConf).getOrCreate();
    val empInput = args(0);
    /**
     * INTERNET ISSUE
     * "John",28
     * "Andy",36
     * "Clarke",22
     * "Kevin",42
     * "Richard",51
     */
    val fn = (line:String) => {
      val column = line.split(",");
      Employee(column(0),column(1).toLong)
    }
    val empRDD = spark.sparkContext.textFile(empInput);
    import spark.implicits._
    val empDS = empRDD.map(fn).toDS();
    empDS.createGlobalTempView("employee");
    spark.sql("select * from employee").show();

  }
}