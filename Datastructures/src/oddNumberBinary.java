import java.util.Scanner;

public class oddNumberBinary {
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int x = in.nextInt();
	        int count = 0;
	        boolean answer = false;
	        String valueOfBinary = Integer.toBinaryString(x);
	        for(int i=0;i<valueOfBinary.length();i++){
	       
	            if(valueOfBinary.charAt(i) == '1') {
	            	count+=1;
	            	
	            }
	           
	           
	            
	        }
	        if((count % 2) != 0) {
            	answer = true;
            	
            }
	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	        System.out.println(answer);
	    }
}
