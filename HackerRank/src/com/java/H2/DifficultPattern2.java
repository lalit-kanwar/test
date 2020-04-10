package com.java.H2;

import java.util.Scanner;

public class DifficultPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("this is my pattern for 1 to 99");
		Scanner sc = new Scanner(System.in);
		System.out.print("plz enter value you want to make pattern : ");
		while (true) {
			int v = sc.nextInt();
			if ((v <= 9) && (v >= 1)) {
				for (int i = v; i >= 1; i--) {
					for (int j = v; j >= i; j--) {
						System.out.print(" " + j);
					}
					for (int k = i - 1; k >= 1; k--) {
						System.out.print(" " + i);
					}
					for (int l = i - 1; l >= 1; l--) {
						System.out.print(" " + i);
					}
					for (int m = i + 1; m <= v; m++) {
						System.out.print(" " + m);
					}
					System.out.println();
				}

				for (int i = 2; i <= v; i++) {
					for (int j = v; j >= i; j--) {
						System.out.print(" " + j);
					}
					for (int k = 2; k <= i; k++) {
						System.out.print(" " + i);
					}
					for (int l = 2; l <= i; l++) {
						System.out.print(" " + i);
					}
					for (int m = i + 1; m <= v; m++) {
						System.out.print(" " + m);
					}
					System.out.println();

				}
			} else {
				System.out.println("plz enter upto 1 to 9 value only");
			}
		} // while

	}

}
