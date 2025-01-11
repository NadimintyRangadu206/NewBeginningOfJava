package com.basic.practice;

public class ArrayConcept1 {

	/**
	 * 
	 * find the minimum Value in array
	 * 
	 * @param arr
	 * @return
	 */
	public static int minValue(int arr[]) {

		int minV = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (minV > arr[i]) {
				minV = arr[i];
			}
		}

		return minV;
	}

	public static int maxValue(int arr[]) {

		int maxV = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (maxV < arr[i]) {
				maxV = arr[i];
			}
		}

		return maxV;
	}

	/**
	 * Array Print Direct Access
	 * 
	 * @param args
	 */

	public static int[] directAccess() {

		return new int[] { 4, 7, 9, 10 };

	}

	public static void main(String[] args) {

//		int arr[] = { 33, 3, 5, 4, 44 };

		int i[] = directAccess();

		for (int t : i) {
			System.out.println(t);
		}

		System.out.println(ArrayConcept1.minValue(new int[] { 33, 3, 5, 4, 44 })); // anonymous type of Array

		System.out.println(ArrayConcept1.maxValue(new int[] { 33, 3, 5, 4, 44 }));

		System.out.println("Multi Dimensional Array");

		int arr[][] = new int[3][3]; // int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;

		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;

		for (int m = 0; m < arr.length; m++) {
			for (int n = 0; n < arr[m].length; n++) {

				System.out.print(arr[m][n] + " ");

			}
			System.out.println();
		}

		// Jagged Arrays

		int jagg[][] = new int[3][];

		jagg[0] = new int[3];

		jagg[1] = new int[4];

		jagg[2] = new int[2];

		int count = 0;

		for (int m = 0; m < jagg.length; m++) {
			for (int n = 0; n < jagg[m].length; n++) {

				jagg[m][n] = count++;

			}

		}

		for (int m = 0; m < jagg.length; m++) {
			for (int n = 0; n < jagg[m].length; n++) {

				System.out.print(jagg[m][n] + " ");

			}
			System.out.println();
		}

		Class c = arr.getClass();

		String name = c.getName();
		System.out.println(name);

		// Copying the Array

		char ch[] = new char[] { 'r', 't', 'l', 'a', 'y' };

		char copy[] = new char[2];

		System.arraycopy(ch, 0, copy, 0, 2);

		System.out.println(String.valueOf(copy));

		// Array Cloning.

		int cl[] = new int[] { 5, 6, 7, 8, 9 };

		int clone[] = cl.clone();

		for (int j : clone) {
			System.out.println(j);

		}

		/**
		 * Two Matrix Array
		 */

		int max1[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int max2[][] = new int[][] { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int add[][] = new int[3][3];

		for (int r = 0; r < max1.length; r++) {
			for (int t = 0; t < max2[r].length; t++) {

				add[r][t] = max1[r][t] + max2[r][t];

			}
//			System.out.println();
		}

		
		System.out.println("Print the Addition of  Matrix");
		
		
		for (int r = 0; r < add.length; r++) {
			for (int t = 0; t < add[r].length; t++) {

				System.out.print(add[r][t]+" ");

			}
			System.out.println();
		}
	}
}
