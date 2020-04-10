package newPrograme;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SockPairMerchant3 {
	public static void main(String[] args) {
		System.out.println("start");
		SockPairMerchant3 s = new SockPairMerchant3();

		int n = 9;
		int[] ar = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };// o/p=3
		int output = s.pairShock(n, ar);
		System.out.println("total pair is " + output);
		System.out.println("end");
	}

	public int pairShock(int n, int[] ar) {

		// print sorted value
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i] + ", ");

		}
		System.out.println();
		/**
		 */
		// print count value
		// ................

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(ar[i]);
		}
		int count = 0;
		int val = 0;

		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			count = 0;
			int j = itr.next();
			// System.out.println("j " + j);
			for (int i = 0; i < n; i++) {
				if (j == ar[i]) {
					count++;
				}

			}
			// System.out.println("count " + count);
			val = val + (count / 2);
			// System.out.println("val " + val);

		}

		// ................
		return val;
	}

}
