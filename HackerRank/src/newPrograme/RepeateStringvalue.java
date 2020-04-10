package newPrograme;

import java.util.Scanner;

public class RepeateStringvalue {

	public static void main(String[] arg) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Plz enter String");
		String s = scn.nextLine();
		StringBuilder sb = new StringBuilder();
		System.out.println("Plz enter digit you want to print For SubString");
		int digi = scn.nextInt();
		String s1 = s.substring(0, digi);
		int l1 = s.length();
		int value = l1 / digi;
		for (int i = 0; i < value; i++) {
			System.out.print(s1);
		}
		if (digi > (l1 * value)) {
			int a1 = digi - (l1 * value);
			for (int i = 0; i < a1; i++) {

				System.out.print(s1.charAt(i));
			}
		}

	}
}
