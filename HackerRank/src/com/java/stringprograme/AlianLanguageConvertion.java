package com.java.stringprograme;

public class AlianLanguageConvertion {

	public static void main(String[] args) {
		Test t = new Test();
		String s1 = "lalit";
		String s2 = t.fromDefaultLanguage(s1);
		System.out.println("main " + s1);
		System.out.print("alian " + s2);
	}
}

class Test {
	public String DEFAULT_TRANSLATION = "EN";
	public StringBuilder sb = new StringBuilder();

	public String fromDefaultLanguage(String languageTokens) {
		// languageTokens;
		for (int i = 0; i < languageTokens.length(); i++) {
			int i1 = languageTokens.charAt(i) + 3;
			char c1 = (char) i1;
			// System.out.println(c1);
			sb.append(Character.toString(c1));

		}

		return sb.toString();

	}
}
