package com.basic.practice;

public class InterviewQuestion {

	public static String spaceRemoving(String str) {

		String result = "";

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != ' ') {

				sb.append(str.charAt(i));

			}

		}

		result = sb.toString();

		return result;
	}

	public static void main(String[] args) {

//		InterviewQuestion interviewQuestion= new InterviewQuestion();

		System.out.println(InterviewQuestion.spaceRemoving("e2e hiring"));

	}
}
