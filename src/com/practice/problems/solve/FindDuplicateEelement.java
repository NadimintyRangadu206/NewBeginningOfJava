package com.practice.problems.solve;

import java.util.Arrays;

public class FindDuplicateEelement {

	public static void duplicate(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					System.out.println(Integer.valueOf(arr[i]));

				}

			}
		}

	}

	public static void reverse(int arr[]) {

		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.print(arr[i] + ",");

		}
		System.out.println();

	}

	public static void evenPostion(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				System.out.print(arr[i] + ",");
			}
		}

		System.out.println();

	}

	public static void oddPostion(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 != 0) {
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println();

	}

	public static void largestElement(int arr[]) {

		int maxValue = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > maxValue) {

				maxValue = arr[i];

			}
		}
		System.out.println(maxValue + " ");

	}

	public static void smallestElement(int arr[]) {

		int minValue = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < minValue) {

				minValue = arr[i];

			}
		}
		System.out.println(minValue + " ");

	}

	public static void sumElements(int arr[]) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			count += arr[i];
		}

		System.out.println(count);

	}

	public static void sortedElements(int arr[]) {
		// 9,4,6,2,5,1

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {// small to Big
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]);

		}
		System.out.println();

	}

	public static void thirdLargestElement(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int temp = 0;

				if (arr[i] < arr[j]) {
					temp = arr[i];

					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}

		System.out.println(arr[2]);
		System.out.println(arr[1]);
		System.out.println(arr[0]);

	}

	public static void secondSmallestElement(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				int temp = 0;

				if (arr[i] > arr[j]) {
					temp = arr[i];

					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}

//		System.out.println(arr[2]);
		System.out.println(arr[1]);
		System.out.println(arr[0]);

	}

	public static void removeDuplicateElement(int arr[]) {

		int remove[] = new int[arr.length];

		int visited = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != -1)
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {

						arr[j] = visited;

					}

				}
			remove[i] = arr[i];
		}

		for (int i = 0; i < remove.length; i++) {

			if (remove[i] != -1) {
				System.out.println(remove[i]);
			}

		}

	}

	public static void multipleMatrix(int arr1[][], int arr2[][]) {

		int matrix[][] = new int[3][3];

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr1[i].length; j++) {

				matrix[i][j] = arr1[i][j] * arr2[i][j];

			}
			System.out.println();

		}

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j]);

			}
			System.out.println();

		}

	}

	public static void evenElement(int arr[]) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 != 0) {
               System.out.println(arr[i]);
			}
		}

	}
	
	public static void tranposeMatrix(int arr1[][]) {

		int matrix[][] = new int[3][3];

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr1[i].length; j++) {

				matrix[i][j] = arr1[j][i];

			}
			System.out.println();

		}

		
		System.out.println();
		
		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr1[i].length; j++) {

				System.out.print( arr1[i][j]+" ");

			}
			System.out.println();

		}
		
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j]+" ");

			}
			System.out.println();

		}

	}


	public static void main(String[] args) {

		FindDuplicateEelement.duplicate(new int[] { 4, 5, 6, 7, 5, 6 });
		FindDuplicateEelement.reverse(new int[] { 4, 5, 6, 7, 5, 6 });
		FindDuplicateEelement.evenPostion(new int[] { 4, 5, 6, 7, 5, 6 });
		FindDuplicateEelement.oddPostion(new int[] { 4, 5, 6, 7, 5, 6 });
		FindDuplicateEelement.largestElement(new int[] { 4, 5, 6, 7, 5, 6 });
		FindDuplicateEelement.smallestElement(new int[] { 4, 5, 6, 7, 5, 6 });
		FindDuplicateEelement.sumElements(new int[] { 4, 5, 6, 7, 5, 6 });
		FindDuplicateEelement.sortedElements(new int[] { 9, 4, 6, 2, 5, 1 });
		FindDuplicateEelement.thirdLargestElement(new int[] { 9, 4, 6, 2, 5, 1 });
		FindDuplicateEelement.secondSmallestElement(new int[] { 9, 4, 6, 2, 5, 1 });
		FindDuplicateEelement.removeDuplicateElement(new int[] { 4, 5, 6, 7, 5, 6 });
		FindDuplicateEelement.multipleMatrix(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } },
				new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } });
		
		FindDuplicateEelement.evenElement(new int[] { 4, 5, 6, 7, 5, 6 });
		
		FindDuplicateEelement.tranposeMatrix(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } });
		
	}
}
