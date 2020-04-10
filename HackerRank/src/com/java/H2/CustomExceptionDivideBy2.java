package com.java.H2;

import java.util.Scanner;

public class CustomExceptionDivideBy2 extends Exception {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("plz enter 1st value");
		int a = scn.nextInt();
		System.out.println("plz enter 2nd value");
		int b = scn.nextInt();

		int c = a / b;
		System.out.println("end line");

	}
}
