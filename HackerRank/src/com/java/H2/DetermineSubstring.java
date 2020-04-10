package com.java.H2;

import java.util.Scanner;

public class DetermineSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Main String:");
		String mainString = scan.nextLine();
		System.out.println("Enter sub string which you want to search");
		String subString = scan.nextLine();
		if(getSubString(mainString, subString)) System.out.println("YES");
		else  System.out.println("NO");
		scan.close();
	}
	
	public static boolean getSubString(String mainString, String subString){
			for(int j = 0; j < mainString.length(); ){
				boolean flag = true;
				int c = 0;
				String compareString = "";
				if(mainString.charAt(j) != ' ' && j + subString.length() <= mainString.length()){
					for(int k = j; k < j + subString.length(); k++){
						compareString = compareString + mainString.charAt(k);
					}
				}else{
					flag = false;
				}
					
				if(compareString.length() == subString.length())for(int i = 0; i < subString.length(); i++){
					if(compareString.charAt(i) == subString.charAt(i)) {
						c++;
					}
				}
				if(c == compareString.length() && c == subString.length()){
					return true;
				}
				if(flag){
					j = j + subString.length();
				}else{
					j++;
				}
			}
			return false;
	}

}

/*Sample input: "This is a string", "is a"
Sample output: "Yes"
*/
