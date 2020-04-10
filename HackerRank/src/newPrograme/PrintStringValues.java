package newPrograme;

import java.util.Scanner;

public class PrintStringValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hell this is my programe");

		Scanner scn = new Scanner(System.in);
		System.out.println("plz enter any  string value which you want to enter");
		String s1 = scn.nextLine();
		System.out.println("Plz enter how many digit you want to Print");
		int d1 = scn.nextInt();
		int l1 = s1.length();

		int value = d1 / l1;
		for (int i = 0; i < value; i++) {
			System.out.print(s1);
		}
		if (d1 > (l1 * value)) {
			int a1 = d1 - (l1 * value);
			for (int i = 0; i < a1; i++) {

				System.out.print(s1.charAt(i));
			}
		}

	}

}
