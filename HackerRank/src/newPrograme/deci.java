package newPrograme;

import java.util.Scanner;

class deci {

	int convert(int n) {
		int tem = 1, power = 0;
		int decimal = 0;
		for (int j = 0; j < n; j++) {
			if (n == 0) {
				break;
			} else {
				while (n > 0) {
					tem = n % 10;
					decimal += (tem * (Math.pow(2, power)));
					n = n / 10;
					power++;
				}
			}
		}
		return decimal;
	}

	public static void main(String args[]) {
		System.out.print("enter the binary no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		deci dc = new deci();
		int i = dc.convert(n);
		System.out.print(i);
	}

}