package com.practice.problems.solve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class StringRelatedProblems {

	public static String swapString(String s1, String s2) {
		
		s1=s1+s2;
		
		s2=s1.substring(0,s1.length()-s2.length());
		
		s1=s1.substring(s2.length());

//		       String str[]=new String[2];
//		       
//		       str[0]=s2;
//		       str[1]=s1;
//		       
//		       s1=str[0];
//		       s2=str[1];
		       
		return s1+" "+s2;

	}

	public static List<Character> duplicateCharacter(String s1) {

		List<Character> list = new ArrayList<>();

		for (int i = 0; i < s1.length(); i++) {

			for (int j = i + 1; j < s1.length(); j++) {

				if ((s1.charAt(i) == s1.charAt(j)) && (s1.charAt(i) != ' ')) {

					list.add(s1.charAt(i));
				}
			}
		}

		Collections.sort(list);

		return list;
	}

	public static void charPercentage(String s1) {

		int totalChar = s1.length();

		int lowCount = 0;

		int upCount = 0;

		int noCount = 0;

		int otherCount = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {

				lowCount++;
			} else if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z') {

				upCount++;
			} else if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {

				noCount++;
			} else {
				otherCount++;
			}

		}

		int lper = (lowCount * 100) / totalChar;

		int uper = (upCount * 100) / totalChar;
		int nper = (noCount * 100) / totalChar;
		int oper = (otherCount * 100) / totalChar;

		System.out.println(lper + "%");
		System.out.println(uper + "%");
		System.out.println(nper + "%");
		System.out.println(oper + "%");

		System.out.println();

	}

	public static boolean checkAnagram(String s1, String s2) {

		boolean flag = false;

		s1 = s1.toLowerCase();

		s2 = s2.toLowerCase();

		char ch1[] = s1.toCharArray();

		char ch2[] = s2.toCharArray();

		Arrays.sort(ch1);

		Arrays.sort(ch2);

		if (s1.length() != s2.length()) {

			return flag;
		}

		String a1 = String.valueOf(ch1);

		String a2 = String.valueOf(ch2);

		if (a1.equals(a2)) {

			flag = true;
		} else {
			flag = false;
		}

		return flag;

	}

	public static Date stringToDate(String str) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");

		Date d = formatter.parse(str);

		return d;
	}

	public static int stringToInt(String str) {

		int i = Integer.valueOf(str);

		return i;
	}

	public static String reverse(String str) {

		String s[] = str.split(" ");

		StringBuffer sb = new StringBuffer();

//		ArrayList<String> l = new ArrayList<>();

		for (String st : s) {
			String c = " ";
			for (int i = st.length() - 1; i >= 0; i--) {

				c += String.valueOf(st.charAt(i));
//				c+=st.charAt(i);

			}
//			l.add(c);

			sb.append(c);

		}

		return sb.toString();
	}

	public static String toGGle(String str) {

		String s[] = str.split(" ");

		StringBuffer sb = new StringBuffer();

		for (String t : s) {

			String copy = " ";

			for (int i = 0; i < t.length(); i++) {

				copy += (char) (t.charAt(i) - 32);
			}
			sb.append(copy);

		}

		System.out.println(reverse(sb.toString()));

		return sb.toString();
	}

	public static void main(String[] args) throws ParseException {
		
		System.out.println(swapString("Hello", "World"));

		System.out.println(duplicateCharacter("India is my country"));

		charPercentage("India is my country 100%");

		System.out.println(checkAnagram("Keep", "Peek"));

		System.out.println(toGGle("this is javatpoint"));

		System.out.println(stringToInt("72264726"));

		System.out.println(stringToDate("02/01/2025"));

		String ct = "Java";

		String ne = new String("Java");

		System.out.println(ct.equals(ne));
		System.out.println(ct == ne);
		System.out.println(ne.intern() == ct);

	}

}
