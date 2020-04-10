package com.java.stringprograme;

public class StringCharCountNRepeatFound {

	public static long repeatedString(String s, long n) {
		long count = 0;
		int m = s.length();
		for (int y = 0; y < m; y++) {
			if (s.charAt(y) == 'a') {
				count++;

			}
		}

		long val = n / m;
		count = count * val;
		long p = n % m;
		for (int i = 0; i < p; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String s = "aba";
		// long n = 10;
		// String s = "a";
		// long n = (long) 1000000000000.0;
		String s = "udjlitpopjhipmwgvggazhuzvcmzhulowmveqyktlakdufzcefrxufssqdslyfuiahtzjjdeaxqeiarcjpponoclynbtraaawrps";
		long n = 872514961806L;
		long s1 = repeatedString(s, n);
		System.out.println(s1);
	}

}
