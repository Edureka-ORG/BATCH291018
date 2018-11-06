package com.edureka

object PatternMatching {
  
  def main(args: Array[String]): Unit = {
    println(matchTest(1));
     println(matchTest("test"));
      println(matchTest("two"));
      
     val alice = new Person("Alice",23) 
      val bob = new Person("Bob",23)
      val charlie = new Person("Charlie",23);
     
     for ( person <- List(alice,bob,charlie) ) {
       person match {
         case Person("Alice",23)  => println("Hi Alice");
         case _ => "Other"
       }
     }
      
      
  }
  
  def matchTest(x:Any):Any = x match {
    case 1 => "One"
    case "two" => 2
    case y:Int => scala.Int
    case _ => "many"
  }
  
  
} 