package com.basic.practice;

import java.time.LocalDateTime;
import java.time.LocalTime;


 interface Vehicle {
	
	 public abstract void bike();
	 
	 public abstract void car();
 }
 
 
 class Car implements Vehicle{

	@Override
	public void car() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bike() {
		// TODO Auto-generated method stub
		
	}
	

	 
 }
 
// class Bike implements Vehicle{
//
//	
//
//	@Override
//	public void car() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void bike() {
//		// TODO Auto-generated method stub
//		
//	}
	 
// }
	 

 

public class FirstProgram {
	
	public static void main(String[] args) {
		
		
	  LocalDateTime dateTime= LocalDateTime.now();
	  System.out.println(dateTime);
	  
	  LocalTime t= LocalTime.now();
	  System.out.println(t);
	  
	  
	  Vehicle vehicle= new Car();
	  
	
	
	  
	  
	}

}
