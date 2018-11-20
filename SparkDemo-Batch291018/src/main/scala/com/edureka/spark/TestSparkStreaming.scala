package com.edureka.spark

import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.StreamingContext;
import org.apache.spark.{ SparkConf, SparkContext };

object TestSparkStreaming {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf();
    sparkConf.setAppName("Helloworld - SparkStreaming");
    sparkConf.setMaster("local[2]");
    sparkConf.set("spark.submit.deployMode", "client");
    sparkConf.set("spark.ui.enabled", "true");

    val sc = new SparkContext(sparkConf);

    val ssc = new StreamingContext(sc, Seconds(10));
    val dStream = ssc.socketStream("localhost", 4040, null, null);
    dStream.cache();
    
//    dStream.map(r => r.foreach(println));
//    dStream.
    dStream.foreachRDD(rdd => rdd.foreach(println));

    ssc.start();

    ssc.awaitTermination();

  }

}