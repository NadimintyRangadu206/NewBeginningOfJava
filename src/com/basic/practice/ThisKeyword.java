package com.basic.practice;

public class ThisKeyword {

	String str;

	int num;

	char ch;

	 double d;

	public ThisKeyword(String str, int num, char ch) {

		this.str = str;
		this.num = num;
		this.ch = ch;

	}
	
	public ThisKeyword(String str, int num, char ch,double d) {

		this(str,num, ch);
		this.d=d;
		
		System.out.println(str+" "+num+" "+ch+" "+d);

	}
	

	public void display() {
		System.out.println(str + " " + num + " " + ch);
	}

	public void methodReference() {

		System.out.println("This is Called Method Reference");
	}

	public void callingMethod() {

		this.methodReference();

		System.out.println("This is Called Calling Method");
	}

	public ThisKeyword(int i, int j) {

		System.out.println("Two Argument Construstor" + "==" + i + " ," + j);

	}

	public ThisKeyword(String city, String state, String country) {

		this(20, 50);

		System.out.println("Place Representation" + "---" + city + " " + state + " " + country);

	}

	public static void main(String[] args) {

		ThisKeyword keyword = new ThisKeyword("Ranga", 10, 'N',100.00);

		keyword.display();

		keyword.callingMethod();
		
		ThisKeyword key= new ThisKeyword("Bangalore","Karnataka","India");
		
		System.out.println(key.getClass());
		
		Object obj= new String("JAvaTPoint");
		
		Class c=obj.getClass();
		
		System.out.println(c +" "+c.getName() +" "  );
		
		
	}

}
