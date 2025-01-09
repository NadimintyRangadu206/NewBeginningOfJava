package com.basic.practice;

class CentralBank {

	String accountHolder;

	int monbileNo;

	public CentralBank(String accountHolder, int mobileNo) {

		this.accountHolder = accountHolder;
		this.monbileNo = mobileNo;

	}
	
	
	public void deposite(int a,int b) {
		
		System.out.println(a+" "+b);
		
	}
	
}

class IndusLand extends CentralBank {
	
	

	public IndusLand(String accountHolder, int mobileNo ,double deposit) {
		
		super(accountHolder, mobileNo);
		
		
		
		System.out.println(accountHolder+" "+mobileNo+" "+deposit);
		
	}

	String accountHolder = "Raju";

	public void display() {

		System.out.println(accountHolder);

		System.out.println(super.accountHolder);
	}
	

	public void deposit(int a,int b,int c) {
		
		
		super.deposite(a, b);
		
		System.out.println(a+" "+" "+b+" "+c);
	}
}

public class SuperKeyWordPractice {

	public static void main(String[] args) {

		IndusLand sbi = new IndusLand("Ranga",28942992,20000.00);

		sbi.display();
		
		sbi.deposit(20, 40, 60);

	}
}
