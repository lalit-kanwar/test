package com.java.stringprograme;

import java.util.Scanner;

public class MaxRepetitionsInString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("Enter the String");
		// String str = "Hi i am lalit and i am here";
		// in.nextLine();
		String str = "abcabcc";
		int count = 0;
		String temp = "";
		int num = 0;
		char val = 32;
		int value = 0;
		System.out.println(val + "lalit");
		for (int i = 0; i < str.length(); i++) {
			char c1 = str.charAt(i);

			for (int j = i; j < str.length(); j++) {
				char c2 = str.charAt(j);

				if (c2 != 32) {
					if (c1 == c2 && temp.indexOf(c1) == -1) {
						count = count + 1;
						if (num < count) {
							num = count;
							val = c2;

						}
					}
				}
			}
			// if()

			if (temp.indexOf(c1) == -1) {
				temp = temp + c1;
				System.out.println("The Character   " + c1 + "   has occurred   " + count + "    times");
			}
			value = value + (count % 2);
			// System.out.println(value + "---");
			count = 0;
		}
		System.out.println(num + " " + val);
		System.out.println(value);

	}
}