package com.basic.practice;

class Animal {

	public void eat() {
		System.out.println("Animals Are Eating Food");
	}
}

class Dog extends Animal {

	public void display() {

		System.out.println("Dog are very awesome");

	}

}

public class InheritenceConcept {

	public static void main(String[] args) {

		Dog d = new Dog();

		d.display();
		d.eat();
		
		Animal a= new Animal();
		
		a.eat();
		
		
		Dog sub=(Dog) new Animal(); // TypeCasting
		
		sub.display();
		sub.eat();
		
		
		Animal sup= new Dog();
		
		sup.eat();
		

	}

}
