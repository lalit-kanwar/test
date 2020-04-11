package com.java.H1;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= 100; i++) {
			if (i <= 5) {
				if (i % 2 == 0) {
					System.out.println("not weared");
				} else {
					System.out.println("weird");
				}
			}

			if ((i > 5) && (i <= 20)) {
				if (i % 2 == 0) {
					System.out.println("weird");
				} else {
					System.out.println("weird");
				}

			}

			if (i > 20) {
				if (i % 2 == 0) {
					System.out.println("not wierd");
				} else {
					System.out.println("weird");
				}
			}

		}
	}

}
