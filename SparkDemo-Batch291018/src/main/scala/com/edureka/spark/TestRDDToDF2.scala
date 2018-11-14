package com.edureka.spark

import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkConf
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.StringType
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.Row

object TestRDDToDF2 {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf

    sparkConf.setAppName("SparkSQL-RDD-DF-DS-2")
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

    val empRDD = spark.sparkContext.textFile(empInput);

    val schemaStr = "name,age";
    val fields = schemaStr.split(",").map(fieldName => StructField(fieldName, StringType, nullable = true))

    val schema = StructType(fields);

    var fn = (iLine: String) => {
      val columns = iLine.split(",")
      Row(columns(0), columns(1))
    }

    val empROWS = empRDD.map(fn);
    import spark.implicits._;
    val empDF = spark.createDataFrame(empROWS, schema);

  }
}