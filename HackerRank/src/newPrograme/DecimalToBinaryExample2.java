package newPrograme;

public class DecimalToBinaryExample2 {
	public static void toBinary(int decimal) {
		int binary[] = new int[40];
		int index = 0;
		while (decimal > 0) {
			binary[index++] = decimal % 2;
			decimal = decimal / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();// new line
	}

	public static void main(String args[]) {
		System.out.println("Binary of 10 is: ");
		toBinary(10);
		System.out.println("binary of 21 is: ");
		toBinary(21);
		System.out.println("Binary of 31 is: ");
		toBinary(31);
		System.out.println("Binary of 2 is: ");
		toBinary(2);
		System.out.println("Binary of 1 is: ");
		toBinary(1);
		System.out.println("Binary of 0 is: ");
		toBinary(0);
	}
}