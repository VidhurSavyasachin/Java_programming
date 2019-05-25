import java.util.Scanner;

public class Astrick {
	static void print_square(int n) 
    { 
        int i, j; 
           
        for (i = 1; i <= 3; i++) 
        { 
        
            for (j = 1; j <= n+4; j++) 
            { 
            	
                if (i == 1 || i == 3 ||  
                    j == 1 || j == n+4)             
                    System.out.print("*");             
                else           
                    System.out.print(" ");             
            } 
        	
            System.out.println(); 
        } 
       
    } 
	 public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        String w = "Welcome";
	        String decor = "*";
	        int outer = 3;
	        String[] arr = new String[outer];
	        for (int i = 0; i < arr.length; i++) {
				arr[i] = decor;
			}
	        for (int i = 0; i <outer ; i++) {
	        	
	        	for (int j = 0; j < w.length()+(outer*2); j++) {
	        		System.out.print(decor);
				}
	        	System.out.println();
			}
	        for (int i=0; i<outer; i++){
	            System.out.print(decor);
	           
	        }
	        System.out.print("" + w  + "");
	        for (int i=0; i<outer; i++){
	            System.out.print( decor);
	           
	        }
	        System.out.println();
	        for (int i = 0; i <outer ; i++) {
	        	
	        	for (int j = 0; j < w.length()+(outer*2); j++) {
	        		System.out.print(decor);
				}
	        	System.out.println();
			}
	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	       
	    }
}
/*
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int N = in.nextInt();
if (in.hasNextLine()) {
    in.nextLine();
}
int sum = 0;
for (int i = 0; i < N; i++) {
    String S = in.nextLine();
    if(Integer.parseInt(S,2) % 2 != 0){
        sum+=Integer.parseInt(S,2);
    }
  
}
System.out.println(sum);

// Write an action using System.out.println()
// To debug: System.err.println("Debug messages...");


}*/