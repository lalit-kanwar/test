package newPrograme;

public class PrintString {
	public static void display(String s1) {
		System.out.println(" " + s1);
	}

	public static void main(String[] a) {
		String s1 = "lalit";
		String s2 = "Anil";

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				display(i + " " + s1);
			}
			if (i % 5 == 0) {
				display(i + " " + s2);
			}
		}
	}

}