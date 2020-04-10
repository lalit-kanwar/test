package newPrograme;

class TestClass {
	public static void main(String[] args) {

		System.out.println("start");

		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " * 5 = ");
				int a = i * 5;
				System.out.print(a);
				System.out.println();

			}
		}

	}
}