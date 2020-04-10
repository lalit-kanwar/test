package com.java.stringprograme;

public class CountMaxSequenseNumber {

	public static int maxCount(int[] a) {
		int max = 1;
		int count = 1;
		for (int i = 1; i < a.length; i++) {
			if ((a[i] - a[i - 1]) <= 1) {

				count++;
				// System.out.println(count);
			} else {
				count = 1;
			}
			if (max < count) {
				max = count;
				// System.out.println("max " + max);
			}
		}

		return max;
	}

	public static void main(String[] args) {
		// int[] a = { 1, 2, 3, 5, 6, 7, 8 };
		int[] a = { 0, 1, 2, 3, 3, 3, 4, 5, 9, 10, 11, 13 };

		System.out.println("max Count " + maxCount(a));

	}

}
