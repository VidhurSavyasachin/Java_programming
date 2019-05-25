package median_array_linkedList;

import java.util.Scanner;

public class SumOfPowersOfValues {
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] result = new int[n];
	        int sum = 0;
	        for(int i=0;i<result.length;i++) {
	        	result[i] = (int)Math.pow(2, i);
	        	sum+=result[i];
	        	
	        }
	        System.out.println(sum);
	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	      
	    }
}
