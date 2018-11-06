package com.edureka


object TestClasses {
  
  def main(args: Array[String]): Unit = {
    
    
    val e = new Employee(12445,"aaa");
//     val e2 = new Employee(12445,"aaa");
    val e2 = Employee.apply(12445,"aaa");
     println(e == e2)
  }
  def test(){
    val c = new Ctr();
    c.m1();
    val d = new Duck(1,"aaa");
    Reservation.getResNum();
    val r = new Reservation;
    r.m1();
    
    
  }
}