package newPrograme;

public class CountingValleyss {

	// TODO Auto-generated method stub

	static int countingValleys(int n, String s) {
		int count = 0;
		int number = 0;
		System.out.println("_");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U') {
				count--;
				System.out.print("/");
			}
			if (s.charAt(i) == 'D') {
				count++;
				System.out.print("\\");
			}
			/**
			 * number++; if (count == number) { System.out.println(""); } if (count <
			 * number) { System.out.print(""); count = number; }
			 */

		}
		System.out.println();
		System.out.println("_");

		String[] x = s.split(" ");
		int v = x.length;
		return v;

	}

	public static void main(String[] args) {
		System.out.println("UDDDUDUU");
		countingValleys(8, "UDDDUDUU");

	}
}