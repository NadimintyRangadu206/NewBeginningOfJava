package com.practice.problems.solve;

public class MathClassMtds {

	public static void addition(int x, int y) {

		int z = Math.addExact(x, y);
		System.out.println(z);

		int s1 = Math.subtractExact(x, y);
		System.out.println(s1);

		double sq = Math.sqrt(4);
		System.out.println(sq);

		double po = Math.pow(x, y);
		System.out.println(po);

	}

	public static void main(String[] args) {

		MathClassMtds.addition(2, 3);
	}

}
