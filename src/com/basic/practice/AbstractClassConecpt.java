package com.basic.practice;



 abstract class  Parent{
	 
	 public  abstract void work();
	 
	 public void habit() {
		 
		 System.out.println("Parent Habbit Is alcholic");
	 }
	 
	 Parent (int i,int j){
		 System.out.println("Constructor are used in a Abstract Class");
	 }
	 
	 static {
		 System.out.println("InSide the Abstract Class used the Static Block");
	 }
	 
 }
 
 class Child extends Parent{

	Child(int i, int j) {
		
		super(i, j);
		
		System.out.println(i+" "+j);
				
	}

	@Override
	public void work() {
		System.out.println("Using IMplementation");
		
	}
	 
 }

public class AbstractClassConecpt {

	public static void main(String[] args) {
		
		Parent p= new Child(20, 50);
		
		p.habit();
	

	}

}
