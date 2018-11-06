package com.edureka

object TestFn2 {
  
  def urlBuilder(ssl:Boolean, domainName:String):(String,String)=> String = {
    
    val schema = if(ssl)"https://"else"http";
    
    (endPoint:String, query:String) => s"$schema$domainName/$endPoint?$query";
  }
  
  def main(args: Array[String]): Unit = {
    
  var getURL = urlBuilder(true,"www.example.com");
  var endPoint = "users";
  var query ="id=1";
  println(getURL(endPoint,query));
  
  }
  
}