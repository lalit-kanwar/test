package com.java.stringprograme;

public class Solution {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int count = 0;
		int len = c.length;
		System.out.println("---" + len);
		for (int i = 0; i < len - 1;) {
			System.out.println("--" + i + "--");// 0 0 0 1 0 0

			if (i <= (len - 1)) {
				if (c[i + 1] == 0) {
					i++;
					count++;
					System.out.println(i + " out " + count);
					if (i <= (len - 2) && (c[i - 1] != 1)) {
						System.out.println(i + "-------" + c.length);
						if ((c[i + 1] == 0) && (c[i] != 1)) {// i's place should not be in 1 then only
							System.out.println(i + " in " + count);
							i++;
							System.out.println(i + " in " + count);
						} /*
							 * else { i++; }
							 */
					}
				} else {
					i++;
					System.out.println(i + " 0n" + count);
				}

			}
		}

		return count;
	}

	public static void main(String[] arg) {

		int[] c = { 0, 0, 0, 1, 0, 0 };
		int d = jumpingOnClouds(c);
		System.out.println(d);
	}

}