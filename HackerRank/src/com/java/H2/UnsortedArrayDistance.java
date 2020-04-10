package com.java.H2;

import java.util.Scanner;

public class UnsortedArrayDistance {
	public static void main(String[] args) {
		while (true) {
			System.out.println("How many value you want to enter");
			Scanner sc = new Scanner(System.in);
			int value = sc.nextInt();
			System.out.println("plz enter " + value + " value(unsorted form) with space seperator :");
			int arr[] = new int[value];
			for (int i = 0; i < value; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("your given value are : ");
			for (int i = 0; i < value; i++) {
				System.out.print(arr[i] + " ");
			}

			for (int i = 0; i < value; i++) {
				for (int j = 1; j < value - i; j++) {
					if (arr[j - 1] > arr[j]) {
						int temp = arr[j - 1];
						arr[j - 1] = arr[j];
						arr[j] = temp;
					} // if

				} // inner for

			} // outer for
			System.out.println();// ("Sorted element are");
			for (int i = 0; i < value; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();// o/p value are :...................................

			int[] xa = new int[value - 1];

			for (int i = 0; i < value - 1; i++) {
				xa[i] = arr[i + 1] - arr[i];
			}
			System.out.print("xa : ");// xa values......................call count value after this
										// line..................
			// int tempval=0;
			// int val1=0,val2=0,add=0;
			for (int i = 0; i < value - 1; i++) {

				System.out.print(xa[i] + " ");// printing xa value................

			}

			System.out.println();// sorted xa values....................................

			/*
			 * for(int i=0;i<value-1;i++){ for(int j=1;j<(value-1)-i;j++){ if(xa[j-1] >
			 * xa[j]){ int temp = xa[j-1]; xa[j-1] = xa[j]; xa[j] = temp; }//if
			 * 
			 * }//inner for
			 * 
			 * }//outer for
			 * 
			 */
			System.out.println();// ("o/p value are :");
			int tempval = 0;
			int val1 = 0, val2 = 0;
			// int[] xa=new int[value-1];
			for (int i = 0; i < value - 1; i++) {
				int min = arr[i];
				int minplus = arr[i + 1];
				int x = minplus - min;

				if (i == 0) {
					tempval = x;
					val1 = arr[i];
					val2 = arr[i + 1];
				}

				if (tempval > x) {
					tempval = x;
					val1 = arr[i];
					val2 = arr[i + 1];
					// System.out.println(val1+" "+val2+",");

				}

			}

			/*
			 * int count=0; int temp=xa[0]; for(int i=0;i<value-1;i++){ if(xa[i]==temp){
			 * count++;//should count only once ; } }
			 * System.out.println("total pair value with small distance is : "+count);
			 */
			System.out.println("total pair value with small distance is : ");
			int tempvalue = tempval;
			for (int i = 0; i < value - 1; i++) {
				if (xa[i] == tempvalue) {
					System.out.print("(" + arr[i] + "," + arr[i + 1] + ")");
				}
			}

			// System.out.println(val1+" "+val2+",");
			System.out.println();
			System.out.println(".......................................................");
			System.out.println();

		}

	}

	// find Distnace between digit king of programe
}
