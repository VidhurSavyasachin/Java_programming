package median_array_linkedList;

import java.util.Scanner;

public class Ascii {
	  public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        String answer = "";
	        for (int i = 0; i < N; i++) {
	            int E = in.nextInt();
	            if(E != 32){
	            char ans = (char) (122-E);
	            answer+=ans;
	            }else{
	             char ans = (char) -1;   
	            }
	        }

	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	        System.out.println(answer);
	    }
}
