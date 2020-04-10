package newPrograme;

import java.util.Scanner;

public class StringMatchingProgram {

	public static void main(String[] args) {

		System.out.println("String matching program");

		String s1 = "lalit kumar kanwar is in office";

		System.out.println("plz enter any string to check value available or not ");
		Scanner sc = new Scanner(System.in);
		String s2 = sc.next();
		int len = s1.split(" ").length;

		for (int i = 0; i < len; i++) {

			String[] rev = s1.split(" ");

			if (rev[i].equalsIgnoreCase(s2)) {

				System.out.println("String available");
				break;
			} else {
				System.out.println("String Not available");
				break;
			}

		}

	}

}
