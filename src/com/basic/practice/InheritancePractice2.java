package com.basic.practice;

class Bank{
	
	String accountHolder;
	
	double money;

	
	public void deposit(String accountHolder,double money) {
		
		this.accountHolder=accountHolder;
		
		this.money= money;
		
		System.out.println("Deposit the Money on our Bank"+" " + accountHolder +" "+money);
	}
	
	
}

class Sbi extends Bank{
	
	
	String accountHolder= "Hari";
	
	@Override
	public void deposit(String accountHolder,double money) {
		int a=20;
		super.deposit(accountHolder, money);
		System.out.println("Deposit Money"+accountHolder + " "+money);
	}
}

public class InheritancePractice2 {

	public static void main(String[] args) {
		
		Sbi b= new Sbi();
		
		b.deposit("Ranga",20000.00);

	}

}
