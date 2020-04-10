package com.java.H1;


	import java.util.*;

	public class Solution {
		static int n;
	    static int[] solve(int[] grades){
	    	 // Complete this function
	    	
	    	for(int grades_i=0; grades_i < n; grades_i++){
	             
	    	if(grades[grades_i]>=37){
	    		
	    		int y=grades[grades_i]/10;
	    		int z=grades[grades_i]%10;
	    		if((z>=3)&&(z<=5)){
	    			grades[grades_i]=(y*10)+5;
	    		}if(z>(5+2)){
	    			grades[grades_i]=(y*10)+10;
	    		}
	    		
	    	}else{
	    		grades[grades_i]=grades[grades_i];
	    	}
	    	
	    	}
			return grades;
			
	           
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("how many value you want to enter");
	         n = in.nextInt();
	        int[] grades = new int[n];
	        for(int grades_i=0; grades_i < n; grades_i++){
	            grades[grades_i] = in.nextInt();
	        }
	        int[] result = solve(grades);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
	        }
	        System.out.println("");
	        

	    }
	}


