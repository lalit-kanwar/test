package com.java.H2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StringPairs {

	static class PairUtil {

		private List<String> ls;
		String listString = "";
		String retriveString = ""+'"';
		public PairUtil(){
			
		}
		
		public void setPairList(List<String> ls){
			this.ls = ls;
		}
		
		public List<String> getPairList(){
			return ls;
		}
		
		public String getPairString(){
		    return 	retriveString.substring(0, retriveString.length()-1)+'"';
		}
		
		public void pairStrings(){
			Iterator<String> iterator = ls.iterator();
			while(iterator.hasNext()){
				listString = listString + iterator.next();
			}
			
			String[] list = listString.split(",");
			for(int i = 0; i < list.length; i++){
				boolean flag = true;
				int valueI = Integer.parseInt(list[i].trim());
				if(flag)for(int j = i+1; j < list.length; j++){
					int valueJ = Integer.parseInt(list[j].trim());
					if(valueI + valueJ == 10){
						flag = false;
						retriveString = retriveString + "(" + valueI + ","+ valueJ + ")" + ",";
					}
				}
			}
			ls.clear();
			ls.add(retriveString.substring(0, retriveString.length()-1)+'"');
		}
	}

		public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter list numbers:");
		String listNumbers = scan.nextLine();
		PairUtil returnUtil = new PairUtil();
		List<String> ls = new ArrayList<String>();
		ls.add(listNumbers);
		returnUtil.setPairList(ls);
		returnUtil.pairStrings();
		System.out.println(returnUtil.getPairString());
		//System.out.println(returnUtil.getPairList());
		scan.close();
	}

}

/*input :1, 8, 2, 3, 5, 7
 output : "(8,2),(3,7)"
 
 input : 1, 4, 5, 6, 3, 9, 0, 2, 3, 5, 6, 7, 4, 6
 output: "(1,9),(4,6),(4,6),(4,6),(5,5),(6,4),(3,7),(3,7),(6,4),(4,6)"
 */
