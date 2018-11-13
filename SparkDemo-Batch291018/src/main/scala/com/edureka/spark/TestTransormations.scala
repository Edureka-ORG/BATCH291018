package com.edureka.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object TestTransormations {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf();
    sparkConf.setAppName(WordCountDriver.getClass.getName);
    sparkConf.setMaster("local[*]");
    sparkConf.set("spark.submit.deployMode", "client");

    val sc = new SparkContext(sparkConf);

    val input = List("DEER", "RIVER", "DEER", "RIVER", "DEER", "RIVER", "DEER", "RIVER", "DEER", "RIVER", "RIVER");

    val inputRDD = sc.parallelize(input, 2);

    val fn = (i: String) => i.length();
    val lengthRDD = inputRDD.map(fn);

    val filterFn = (i: Int) => i > 2
    val filterRDD = lengthRDD.filter(filterFn);

    val keyValuePairRDD = lengthRDD.zip(inputRDD);

    val groupRDD = keyValuePairRDD.groupByKey()

    val joinInput = List("DEER", "RIVER", "DEER", "RIVER", "DEER", "RIVER", "DEER", "RIVER", "DEER", "RIVER", "RIVER","ELEPHANT","CAT");
    val joinInputRDD = sc.parallelize(joinInput, 2);

    val joinLengthRDD = joinInputRDD.map(fn);

    val joinKeyValuePairRDD = joinLengthRDD.zip(joinInputRDD);

    val jRDD = keyValuePairRDD.join(joinKeyValuePairRDD);
    val dRDD = jRDD.distinct
    val iRDD = inputRDD.intersection(joinInputRDD);
    
    

    lengthRDD.collect().foreach(println);
    filterRDD.collect().foreach(println);
    keyValuePairRDD.collect().foreach(println);
    groupRDD.collect.foreach(println)
    jRDD.collect().foreach(println)
    dRDD.collect().foreach(println)
    iRDD.collect().foreach(println)


  }
}