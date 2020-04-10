package com.java.stringprograme;

import java.util.Scanner;

public class NewSortingArrayPrograme {

	public static void main(String[] args) {
		System.out.println("How many value you want to enter");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println("plz enter " + value + " value(unsorted form) with space seperator :");
		int arr[] = new int[value];
		for (int i = 0; i < value; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("your given value are : ");
		for (int i = 0; i < value; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sorting....
		for (int i = 0; i < value; i++) {
			for (int j = 1; j < value - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				} // if

			} // inner for

		} // outer for

		System.out.println();// ("Sorted element are");
		for (int i = 0; i < value; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < value; i++) {
			// int[] val = new int[10];
			int temp = 0;
			if (arr[i] == arr[i + 1]) {
				for (int j = i; j < value; j++) {
					// temp = arr[j];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					arr[i + 1] = arr[i + 2];

					// arr[value - 1] = temp;
					value = value - 1;
				}
			}
		}

		System.out.println();
		System.out.println(".......................................................");
		for (int i = 0; i < value; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
