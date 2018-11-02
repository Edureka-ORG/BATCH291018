package com.edureka

object TestLoop {
  
  def main(args:Array[String]):Unit = {
    
    var str:String = "Helloworld";
    str.foreach(println);
    
    val l = List(1,2,3);
    l.foreach(println);
    
    var r = 1 to 20;
    
    for(i <- r) 
    {
      println(i)
    }
    
    var in = "Helloworld"
    var len = in.length();
    
    for (i <- 0 until len) {
      println(in(i));
    }
    
    for(i <- 0 to 3; j<- 2 to 5){
      println("i ="+i+" j="+j);
    }
    
    for(i <- 0 to 3; j<- 2 to 5; if(i == j); x = 4 -i){
      println(s"i=$i j=$j x= $x");
    }
    
    var s = for (i <- 0 to 10) yield i*2
    s.foreach(println)
    
    
    var x = 10;
    while(x < 20)
    {
      println(x)
      x = x + 2;
    }
    
    do {
      println(x)
    }while(x < 20)
  }
}