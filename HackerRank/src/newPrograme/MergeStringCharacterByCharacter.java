package newPrograme;

public class MergeStringCharacterByCharacter {
	public static void main(String[] args) {

		String s1 = "geeks";
		String s2 = "forgeeks";
		System.out.println(merge(s1, s2));
	}

	// function for merging two strings
	public static String merge(String s1, String s2) {
		StringBuilder finalString = new StringBuilder();
		int i = 0, j = 0;
		while (i < s1.length() && j < s2.length()) {

			finalString.append(s1.charAt(i++));
			finalString.append(s2.charAt(j++));

			System.out.println(finalString);

			/*
			 * if (j < s1.length()) { finalString.append(s1.charAt(j)); j++; } } if (j <
			 * s1.length()) { finalString.append(s1.substring(j)); }
			 */

		}
		return finalString.toString();
	}
}