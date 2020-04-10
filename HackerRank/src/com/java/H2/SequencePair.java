package com.java.H2;

import java.util.Scanner;

public class SequencePair {
	public static void main(String[] args) {
		System.out.println("this is my pair programe :(-,-)=10 ");
		// ={1,4,5,9,7,3,8,4,5};//1,9,,3,7,,5,5;
		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter how many value you want to enter : ");
		int value = 9;
		System.out.println("plz enter " + value + " values");
		int[] a = new int[] { 1, 4, 5, 9, 7, 3, 8, 4, 5 };
		/*
		 * for (int i = 0; i < a.length; i++) { a[i] = sc.nextInt(); }
		 */
		System.out.println();// ("Sorted element are");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		// sort element
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length - i; j++) {
				if (a[j - 1] > a[j]) {
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				} // if
			} // inner for
		} // outer for
		System.out.println();
		System.out.println();// ("Sorted element are");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// .......... main logic......................

		int mid = a.length / 2;
		System.out.println();
		int[] s = new int[a.length];
		int z = 0;
		for (int i = 0; i < mid + 1; i++) {
			int x = a[i];
			if (x != z) {
				for (int j = a.length - 1; j > mid; j--) {
					z = x;
					int y = a[j];
					if ((x + y) == 10) {
						System.out.print("(" + a[i] + "," + a[j] + ")" + " ");
					} // inner if
				} // inner for
			} // outer if
		} // outer for

	}
}// ex i/p : 1 3 9 7 5 2 3 4 1
	// o/p : (1,9) (3,7)
