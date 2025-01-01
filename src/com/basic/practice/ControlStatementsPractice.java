package com.basic.practice;

import java.util.Scanner;

public class ControlStatementsPractice {

	public static void main(String[] args) {

		System.out.println("For Loop");

		for (int i = 0; i <= 10; i++) {

			System.out.println(i);

		}

		System.out.println("For Each Loop");
		int arr[] = new int[10];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;

		for (int i : arr) {

			System.out.println(i);
		}

		System.out.println("While Loop");

		int i = 0;
		while (i <= 10) {

			System.out.println(i);

			i++;

		}

		System.out.println("do-While Loop");

		do {

			System.out.println(i);
			i++;

		} while (i <= 15);

		System.out.println("Decision Making Statements");

		int j = 1;

		while (j <= 10) {

			if (j == 5) {

				System.out.println("Condition is Satishfy then now teriminated by loop ");

				break;

			} else {
				j++;
			}

		}

		System.out.println("Switch Statement");

		String str[] = new String[7];

		str[0] = "Monday";
		str[1] = "TuesDay";
		str[2] = "WednesDay";
		str[3] = "ThursDay";
		str[4] = "FriDay";
		str[5] = "SaturDay";
		str[6] = "Sunday";

//		String day = "Sunday";
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter  Name Of the Day here");
		
		String day=scanner.next();

		switch (day) {

		case "Monday":
			System.out.println("This day is Monday");
			break;

		case "TuesDay":
			System.out.println("This day is TuesDay");
			break;
		case "WednesDay":
			System.out.println("This day is WednesDay");
			break;
		case "ThursDay":
			System.out.println("This day is ThursDay");
			break;
		case "FriDay":
			System.out.println("This day is FriDay");
			break;
		case "SaturDay":
			System.out.println("This day is SaturDay");
			break;

		case "Sunday":
			System.out.println("This day is Sunday");
			break;

		default:

			System.out.println("No Day is Matching ");
			break;

		}

	}

}
