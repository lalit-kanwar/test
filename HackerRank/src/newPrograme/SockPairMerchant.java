package newPrograme;

public class SockPairMerchant {
	public static void main(String[] args) {
		System.out.println("start");
		SockPairMerchant s = new SockPairMerchant();

		int n = 9;
		int[] ar = new int[] { 10, 10, 10, 10, 20, 20, 20, 30, 50 };// o/p=3
		int output = s.pairShock(n, ar);
		System.out.println("pair is " + output);
		System.out.println("end");
	}

	public int pairShock(int n, int[] ar) {

		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i; j > 0; j--) {
				if (ar[j] < ar[j - 1]) {
					temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				}
			}
		}
		// print sorted value
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + ", ");

		}
		System.out.println();
		/**
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		// print count value
		int count = 0;
		int val = 0;
		int i = 0;
		while (i < n) { // for (int i = 0; i < n; i++) {
			count = 0;
			int x = 1;
			for (int j = i; j < n; j++) {
				if (ar[i] == ar[j]) {
					count++;
				} else {
					x++;
					break;
				}
			}
			// val = val + (count / 2);

			System.out.println("count of " + ar[i] + " is " + count);
			// i = count - 1;
			i++;

		}
		System.out.println();
		System.out.println("...... " + val + " ......");
		return val;

	}

}
