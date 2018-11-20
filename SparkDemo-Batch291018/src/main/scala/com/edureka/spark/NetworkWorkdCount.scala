package com.edureka.spark

import org.apache.spark.streaming.StreamingContext
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.streaming.Seconds
import org.apache.spark.storage.StorageLevel

object NetworkWorkdCount {
  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf();
    sparkConf.setAppName("WordCount - SparkStreaming");
    sparkConf.setMaster("local[*]");
    sparkConf.set("spark.submit.deployMode", "client");
    sparkConf.set("spark.ui.enabled", "true");

    val sc = new SparkContext(sparkConf);

    val ssc = new StreamingContext(sc, Seconds(10));

    //DEER RIVER RIVER
    val dStream = ssc.socketTextStream("localhost", 4444, StorageLevel.MEMORY_AND_DISK);
//    ssc.textFileStream(directory)

    val words = dStream.map(iLine => iLine.split(",")); //{DEER,RIVER,RIVER}

    val pairs = words.map(word => (word, 1))
    val wordCounts = pairs.reduceByKey(_ + _)

    wordCounts.print();

    ssc.start();

    ssc.awaitTermination();

  }
}