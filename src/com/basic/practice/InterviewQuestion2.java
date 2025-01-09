package com.basic.practice;

public class InterviewQuestion2 {

	public static void main(String[] args) {

		Long l1 = new Long(200l);
		Long l2 = new Long(200l);

		Long l3 = 20L;
		Long l4 = 20L;

		Long l5 = l1;
		Long l6 = l2;

		System.out.println(l1.hashCode() == l2.hashCode());
		System.out.println(l1 == l2);
		System.out.println(l3 == l4);
		System.out.println(l5.hashCode() == l6.hashCode());
		System.out.println(l5 == l6);

	}

}
