package com.java.stringprograme;

public class CheckCaseOfCharacter {

	public static void main(String[] args) {
		String characters = "HiIamLalit@%*765";
		int length = characters.length();

		for (int i = 0; i < length; i++) {
			char character = characters.charAt(i);
			if (Character.isUpperCase(character)) {
				System.out.println("Given character : " + characters.charAt(i)
						+ " is an Uppercase letter");
			} else if (Character.isLowerCase(character)) {
				System.out.println("Given character : " + characters.charAt(i)
						+ " is a Lowercase letter");
			} else {
				System.out.println("Given character : " + characters.charAt(i)
						+ " is neither Uppercase nor Lowercase letter");
			}
		}

	}
}