package newPrograme;

public class FindMaxDuplicate {
	public static void main(String[] args) {

		System.out.println("hi this is a programe for finding max duplicate digit ");

		// System.out.println("plz enter dijit");
		// Scanner sc = new Scanner(System.in);
		// int n=sc.nextInt();
		int[] n = { 6, 6, 1, 5, 6, 9, 3, 7, 1, 3, 5, 6, 3, 8, 3, 6 };
		int l = n.length;
		int count = 0;
		int value = 0;
		int place = 0;
		for (int i = 0; i < l; i++) {
			count = 0;
			for (int j = i + 1; j < l; j++) {
				if (n[i] == n[j]) {
					count = count + 1;
					if (count > value) {
						value = count;
						place = n[i];

					}
				}

			}

		}
		System.out.println("digit which is double max time is : " + place);
		System.out.println("how many times : " + value);

	}

}
