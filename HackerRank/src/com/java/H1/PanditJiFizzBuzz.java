package com.java.H1;

import java.util.Scanner;

public class PanditJiFizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("this is my programe given by punnu");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i <= 100) {

			if ((i % 3 == 0) && (i % 5 != 0)) {
				System.out.println("Fizz");
			} else if ((i % 5 == 0) && (i % 3 != 0)) {
				System.out.println("Buzz");
			} else if ((i % 3 == 0) && (i % 5 == 0)) {

				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);
			}

		}

	}

}
