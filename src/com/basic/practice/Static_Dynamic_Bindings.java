package com.basic.practice;


class Person{
	
	public void walk() {
		System.out.println("Animals are Walking on road");
	}
}

class Cat extends Person{
	
	public void walk() {
		System.out.println("Dog is Walking on road");
	}
}

public class Static_Dynamic_Bindings {
	
	/**
	 * 
	 * Connecting Method call to Method Body is Know as the Binding.
	 * 
	 *  2-types Of Bindings
	 *  
	 *  1.Static Binding:(When type Of Object determined by Compile-time is Know as the Static Binding.Priavte ,Final,Static Method )
	 *  2.Dynamic Binding:(When type of Object determined by run-time is know as the Dynamic Binding).
	 *  
	 * @param args
	 */
	
	
	final int i=10;
	
	private void eat() {
		System.out.println("Dog is Eating a Food");
	}
	
	public static void main(String[] args) {
		
		Static_Dynamic_Bindings bindings= new Static_Dynamic_Bindings();
		
		bindings.eat();
		
		Person animal= new Cat();
		animal.walk();
		
	}

}
