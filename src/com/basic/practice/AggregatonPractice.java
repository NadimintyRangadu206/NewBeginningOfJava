package com.basic.practice;

class Details {

	String city;
	String state;
	String zipCode;

	public Details(String city, String state, String zipCode) {

		this.city = city;

		this.state = state;
		this.zipCode = zipCode;

	}
}

public class AggregatonPractice {

	String name;
	String address;
	String age;

	Details details;

	public AggregatonPractice(String name, String address, String age, Details details) {

		this.name = name;
		this.address = address;
		this.age = age;
		this.details = details;

	}

	
	public void display() {
		
		System.out.println(name+" "+address+" "+age+" "+ details.city+" "+details.state+" "+details.zipCode);
	}
	public static void main(String[] args) {

		Details d = new Details("Bangalore", "Karnataka", "500006");

		AggregatonPractice aggregatonPractice = new AggregatonPractice("Ranga", "Hsr", "25", d);
		aggregatonPractice.display();

	}

}
