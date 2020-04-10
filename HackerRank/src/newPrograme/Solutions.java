package newPrograme;

public class Solutions {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		for (int i = 0; i <= n - 1; i++) {
			for (int j = i; j < n - i; j++) {
				if (i > j) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;

				} // if

			} // inner for
		} // outer for

		for (int x = 0; x < n - 1; x++) {
			int val = 0;
			if (val != ar[x]) {
				val = ar[x];
			}
			if (val == ar[x]) {

			}

		}
		return 0;
	}//
}// public static vo
