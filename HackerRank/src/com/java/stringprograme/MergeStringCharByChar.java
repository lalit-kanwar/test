package com.java.stringprograme;

public class MergeStringCharByChar {

	public static void main(String[] args) {

		String s1 = "lalit";
		String s2 = "ram";
		int len = 0;
		if (s1.length() > s2.length()) {
			len = s2.length();
		} else {
			len = s1.length();

		}
		StringBuilder sb = new StringBuilder();
		String[] s3 = s1.split(" ");
		for (int i = 0; i < len; i++) {

			sb.append(s1.charAt(i));
			sb.append(s2.charAt(i));
		}

		if (s1.length() > s2.length()) {
			sb.append(s1.substring(s2.length(), s1.length()));
		} else {
			sb.append(s2.substring(s1.length(), s2.length()));
		}
		System.out.println(sb);
	}

}
