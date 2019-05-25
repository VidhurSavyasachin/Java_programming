package median_array_linkedList;

import java.util.Scanner;

public class CheckingValidation {
	public static void main(String args[]) {
	  Scanner in = new Scanner(System.in);
      String u = in.nextLine();
      char[] str = u.toCharArray();
      String result = "";
      boolean hasNonAlpha = u.matches("^.*[^a-zA-Z0-9 ].*$");

    	  if(u.length() >= 3 && u.length() <=20 && hasNonAlpha == false) {
		result = "VALID";
    	  }
    	  else {
    		  result = "INVALID";
    	  }
	
      System.out.println(result);
      // Write an action using System.out.println()
      // To debug: System.err.println("Debug messages...");

}
	}
