package com.java.stringprograme;

public class StringCharCountNRepeatFounds {

	public static long repeatNTimes(String s, long n) {
		long count = 0;
		if (s.toString() == "a") {
			// Integer val4 = Integer.valueOf("10", 10);
			count = Long.valueOf(n).longValue();
			System.out.println(s.contains("a") + "====" + count);
			// break;
		}

		if (s.toString() != "a") {

			for (int y = 0; y < s.length(); y++) {
				if (s.charAt(y) == 'a') {
					count++;
					System.out.println("1st" + count);
				}
			}
			int len = s.length();
			long val = n / len;
			count = count * val;
			StringBuilder builder = new StringBuilder();
			for (int i = 1; i <= val; i++) {
				builder.append(s);

			}

			System.out.println("second" + count);

			if (n > (val * s.length())) {
				long remain = n % len;// - (val * s.length());
				for (int j = 0; j < remain; j++) {
					builder.append(s.charAt(j));
					if (s.charAt(j) == 'a') {
						count++;
						System.out.println(count);
					}
				}
			}

			System.out.println(builder);
			System.out.println(count);

		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String s = "aba";
		// long n = 10;
		String s = "a";
		long n = Long.valueOf(10000).longValue();
		long s1 = repeatNTimes(s, n);
		System.out.println(s1);
	}

}
