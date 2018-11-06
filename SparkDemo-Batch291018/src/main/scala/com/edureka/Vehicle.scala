package com.edureka

class Vehicle(speed:Int) 
{
  
  val mph:Int = speed;
  def race() = println("Racing");
}

class Car(speed:Int) extends Vehicle(speed) {
  
 override def race() = println("Car Racing");
}