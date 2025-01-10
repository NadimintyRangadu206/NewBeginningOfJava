package com.basic.practice;

class EConcept {

	private int mNo;

	private String name;
	private char gender;
	private double salary;
	private long accountNo;

	public EConcept(int mNo, String name, char gender, double salary, long accountNo) {

		this.mNo = mNo;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.accountNo = accountNo;

	}

	

	public int getmNo() {
		return mNo;
	}



	public void setmNo(int mNo) {
		this.mNo = mNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public long getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}



	public void print() {

		System.out.println("Print the Full Details Of Employee");

		EConcept concept = new EConcept(mNo, name, gender, salary, accountNo);

		System.out.println(concept.mNo+" "+concept.name+" "+" "+concept.gender+" "+" "+concept.salary+" "+" "+concept.accountNo);
	}

}

public class EncapsulationConcept {

	public static void main(String[] args) {

		EConcept concept = new EConcept(0327672, "Ranga", 'M', 2000.00, 8787843748L);
		
		concept.print();

	}
}
