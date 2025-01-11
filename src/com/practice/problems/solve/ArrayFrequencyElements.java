package com.practice.problems.solve;

public class ArrayFrequencyElements {

	public static void frequency(int arr[]) {

		int freq[] = new int[arr.length];

		int visited = -1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != -1) {

				int count = 1;

				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {

						count++;
						arr[j] = visited;
					}

				}
				freq[i] = count;
			}

		}

		for (int i = 0; i < freq.length; i++) {

			if (arr[i] != visited && freq[i] != 0) {

				System.out.println(arr[i] + "-" + freq[i]);
			}

		}

	}

	public static void main(String[] args) {

		ArrayFrequencyElements.frequency(new int[] { 1, 2, 4, 1, 7, 2 });
	}

}
