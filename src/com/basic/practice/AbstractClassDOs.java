package com.basic.practice;

abstract class AbstractKeyWordDos {

	int size;

	String bookName;

	public abstract void book(int size);

	public abstract void book(int size, String bookName);

	public abstract void player();
	
	
	 public String sample() {
		return "That is called Book Name:"+"===";
		 
	 }

}

class Admin extends AbstractKeyWordDos {

	String name;
	int i;

	Admin(String s1, int i1) {

		this.name = s1;
		this.i = i1;

		System.out.println(name + "-----" + i1);
	}

	@Override
	public void book(int size) {

		this.i = size;

		System.out.println("The size Of The book IS :" + size);

	}

	@Override
	public void player() {

		String name = "Cummins";

		System.out.println("The player of the match is :" + name);

	}

	@Override
	public void book(int size, String bookName) {

		this.i = size;
		this.name = bookName;

		System.out.println(i + "===" + name);

	}

}

public class AbstractClassDOs {

	public static void main(String[] args) {

		Admin admin = new Admin("Social", 20);

		admin.book(50);

		admin.player();
		admin.book(40,"RANGA");
		
		System.out.println(admin.sample());
	}

}
