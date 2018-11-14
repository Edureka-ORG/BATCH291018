package com.edureka.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.SparkSession

object TestSQL {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf

    sparkConf.setAppName("SparkSQL-Helloworld")
    sparkConf.setMaster("local[*]");
    sparkConf.set("spark.submit.deployMode", "client");

    val spark = SparkSession.builder().config(sparkConf).getOrCreate();

    val hdfsPeopleInput = "hdfs:/user/edureka_144865/Datasets/people.json"
    spark.sparkContext.setLogLevel("DEBUG");
    val pDF = spark.read.json(hdfsPeopleInput);
    pDF.show();
    spark.sparkContext.setLogLevel("INFO");

    //    val sc = new SparkContext(sparkConf);
    //
    //    val sqlContext = new SQLContext(sc);
    val pdf = spark.read.json("hdfs:/user/edureka_144865/Datasets/people.json")
    pdf.show();
    pdf.printSchema();
    
    pdf.select("name").show()
    
    import spark.implicits._;
    pdf.select($"name",$"age"+1).show
    
    pdf.createOrReplaceTempView("people");
    spark.sql("select age,count(*) from people group by age").show()
  }
}