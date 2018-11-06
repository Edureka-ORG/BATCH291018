package com.edureka

object TestHFn2 {
  
  def main(args: Array[String]): Unit = {
    var r = 1 to 9
    
    var rStr = List("Hello","World");
    
//    r.foreach(println)
    
    var f1 = (i:Int) => i*2;
    var f2 = (i:Int) => i%2;
    var f3 = (i:String) => i.length();
    
    def fRL(b:Int, i:Int):Int = {
      println(b +"--->"+i); 
      return b+i;
    }
    var filter = (i:Int) => i%2 ==0
//    
//    r.map(f1).foreach(println)
    r.map((i:Int) => i%2).foreach(println)
     r.map(i => i%2).foreach(println)
      r.map(_%2).foreach(println)
//    rStr.map(f3).foreach(println)
//    r.map("*"*_).foreach(println)
//    r.map(filter).foreach(println)
    
    // r --> 1,2,3,4,5,6,7,8,9
    // reduceLeft = 1+2+3+4+5+6+7+8+9
    //reduceLeft 
    /*			ACC + Input --> ACC
     *  		 1+2 --> 3
     *  		 3+3 --> 6
     *  		6+4  --> 10   
     */
    println( r.reduceLeft(_+_));
     println( r.reduceLeft(fRL));
    
    
    var str = "Mary had a little lamb";
    str.split(" ").foreach(println)
    
  }
  
}