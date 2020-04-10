package com.java.H2;

import java.util.Scanner;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programe for 3 line string comparision word to word ");
		System.out.println("plz enter how many line of string u want to enter : ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		String[] s = new String[3];
		System.out.println();
		for (int i = 0; i < value; i++) {
			s[i] = sc.nextLine();
		}
		System.out.println();
		for (int i = 0; i < value; i++) {
			System.out.println(s[i]);
		}

	}

}
