package com.edureka.spark




// spark2-submit --verbose --master yarn --deploy-mode client --class com.edureka.spark.WordCountDriver sparkdemo-batch291018_2.11-1.0-SNAPSHOT.jar hdfs:/user/edureka_<YOUR-ID>/WordCount.txt
object TestParallelize {
  
  def main(args: Array[String]): Unit = {
    import org.apache.spark.SparkConf
    import org.apache.spark.SparkContext
    
    println("TestParallelize-Spark");
    
    val sparkConf = new SparkConf();
    sparkConf.setAppName("TestParallelize");
    sparkConf.setMaster("local[3]");
    sparkConf.set("spark.submit.deployMode", "client");
    
    val sc = new SparkContext(sparkConf);
    
    val inputColl = Array(1 to 20);
    
    val inputRDD = sc.parallelize(inputColl, 3);
    
    inputRDD.glom.collect();
    
    
  }
  
}