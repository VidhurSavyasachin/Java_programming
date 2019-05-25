package median_array_linkedList;

import java.util.Scanner;

public class SequenceOfNumbers {
	public static void main(String args[]) {
//		//10 3 15
//		int start = 10;
//		int length = 6;
//		int increment = 2;
//	//length of array 15;
//		//increment  = 3;
//		//start 10;
////		System.out.println(start+(length*increment));
//		for (int i = 10; i <= start+(length*increment) ; i+=2) {
//			System.out.println(i);
		 Scanner in = new Scanner(System.in);
	        int a = in.nextInt();
	        String deg="";
	        String noDeg = "";
	        String[] answer = new String[a];
	        if (in.hasNextLine()) {
	            in.nextLine();
	        }
	        for (int i = 0; i < a; i++) {
	            String name = in.nextLine();
	            if(name.contains(Character.toString(','))) {
	            deg = name.substring(name.indexOf(','));
	            deg = deg.replace(", ","");
	            answer[i] = deg;
	            }
	            else{
	            	noDeg = "NA";
	            	answer[i]=noDeg;
	            }
	        }
	        for (int i = 0; i < a; i++) {
	            
	            // Write an action using System.out.println()
	            // To debug: System.err.println("Debug messages...");
	           
			   
	            System.out.println(answer[i]);
	        }
	    }
		
		}	
	

