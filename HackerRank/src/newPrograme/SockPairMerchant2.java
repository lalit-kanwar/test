package newPrograme;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SockPairMerchant2 {
	public static void main(String[] args) {

		// System.out.println(11 % 2);// reminder
		// System.out.println(11 / 2);// division

		System.out.println();
		int[] ar = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };// o/p=3

		find(ar);
		// System.out.println("end");

	}

	public static void find(int[] ip) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int element : ip) {

			if (map.get(element) == null) {
				map.put(element, 1);

			} else {

				map.put(element, map.get(element) + 1);

			}

		}
		Set<Entry<Integer, Integer>> entryset = map.entrySet();
		int count = 0;
		for (Entry<Integer, Integer> entry : entryset) {
			if (entry.getValue() > 1) {
				count = count + (entry.getValue()) / 2;
			}

		}
		System.out.println("count " + count);
	}

}
