package com.basic.practice;


class ClassA{
	
	int i=10;
	
	public void display() {
		
		System.out.println("Class A"+" "+i);
		
	}
}

class B extends ClassA{
	
	int i=10;
	
	public void show() {
		
		super.display();
		
		System.out.println("Class B "+" "+i);
	}
}

public class InheritancePractice1 {


	public static void main(String[] args) {
	
		
		B b= new B();
		
		b.display();
		b.show();
		
		ClassA a= new B();
		
		a.display();
		
			
		

	}

}
