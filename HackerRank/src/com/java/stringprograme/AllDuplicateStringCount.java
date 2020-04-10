package com.java.stringprograme;

import java.util.LinkedList;
import java.util.List;

public class AllDuplicateStringCount {

	public static int deleteString(String s) {

		int count = 0;
		String temp = "";
		List<Integer> s1 = new LinkedList<>();

		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);

			for (int j = i; j < s.length(); j++) {
				char c2 = s.charAt(j);

				if (c2 != 32) {
					if (c1 == c2 && temp.indexOf(c1) == -1) {
						count++;// = count + 1;
					}
				} else {
					continue;
				}
			}
			if (temp.indexOf(c1) == -1) {
				temp = temp + c1;
				System.out.println("The Character " + c1 + " has occurred " + count + "times");
			}

			if (count >= 1) {

				s1.add(count);
			}

			count = 0;
		}

		System.out.println(s1);
		return 0;
	}

	public static void main(String[] args) {
		// String s = "aaabbccccc";
		String s = "aabbcccx";
		// String s = "Hi i am lalit and i am here";
		int result = deleteString(s);
		System.out.println(result);

	}

}
