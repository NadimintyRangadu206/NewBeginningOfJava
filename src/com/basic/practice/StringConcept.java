package com.basic.practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringConcept {

	public static void tokens(String str) {

		StringTokenizer st = new StringTokenizer(str, " ");

		ArrayList<String> at = new ArrayList<>();

		while (st.hasMoreElements()) {

			at.add(st.nextToken());

		}

		for (String s : at) {
			System.out.println(s);
		}
	}

	public static void joiner() {

		StringJoiner sj = new StringJoiner(",");

		sj.add("Ranga");
		sj.add("venu");
		sj.add("Alla");
		sj.add("Idrus");

		System.out.println(new String(sj.toString()));

	}

	public static void main(String[] args) {

		String str = "Ranga";
//		str = "Raju";
//		str=str.concat("Java");
		System.out.println(str);

		String s1 = new String("Ranga");
//		s1 = "Raju";

		System.out.println(s1);
		System.out.println(s1.hashCode() == str.hashCode());

		System.out.println(str.equals(s1));
		System.out.println(s1.intern() == str);

		StringBuffer sb = new StringBuffer("Hello");

		sb.append(", World!");

		sb.insert(5, "Java");

		sb.delete(5, 10);

		System.out.println(sb);

		StringConcept.tokens(new String("Java's StringTokenizer class"));
		StringConcept.joiner();

		String[][] arr = new String[][] { { "black", "white", "black", "white" },
				{ "white", "black", "white", "black" }, { "black", "white", "black", "white" },
				{ "white", "black", "white", "black" }, };

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String ");

		String s = sc.next();
		String st = " ";

		for (int i = 0, ch = 'a'; i < arr.length; i++, ch++) {
			char con = (char) ch;
			System.out.println(con);

			for (int j = 0; j < arr[i].length; j++) {

				String copy = String.valueOf(con) + j;

				if (copy.equals(s)) {

					st = arr[i][j];

				}

			}
		}
		System.out.println(st);
	}

}
