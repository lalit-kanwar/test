package newPrograme;

public class BinaryToDecimal {
	public static void main(String args[]) {
		long sum = 0;
		long result = 0;
		String s = "0101";
		for (int i = s.length() - 1; i <= 0; i--) {
			result = (int) Math.pow(2, i);
			if (s.charAt(i) == '1')
				sum = sum + result;
		}
		System.out.println(sum);

		// String s = "1001010101011010111001011101010101010101";
		// long result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = (long) (result + (s.charAt(i) - '0') * Math.pow(2, s.length() - i - 1));
		}
		System.out.println(result);
	}
}