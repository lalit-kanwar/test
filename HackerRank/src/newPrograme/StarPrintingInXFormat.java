package newPrograme;

public class StarPrintingInXFormat {

	public static void main(String[] args) {
		// System.out.println("lalit");
		int b = 5;
		for (int i = 1; i <= 5; i++) {

			int a = i;
			for (int j = 1; j <= 5; j++) {
				if ((a == b) && (i == j)) {
					System.out.print(" * ");
					b--;
					continue;
				}
				if (j == a) {
					System.out.print("* ");
				}
				if (j == b) {
					System.out.print("* ");
					b--;
				}
				System.out.print(" ");

			}
			System.out.println();
		}
	}
}