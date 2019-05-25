import java.util.Scanner;


public class ThorProgram {
	 public static String toBinary(String text) {
	        StringBuilder sb = new StringBuilder();

	        for (char character : text.toCharArray()) {
	            sb.append(Integer.toBinaryString(character) + "\n");
	        }

	        return sb.toString();

	    }
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String MESSAGE = in.nextLine();
	       
	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");
	        
	        String result = toBinary(MESSAGE);
	        StringBuilder sb = new StringBuilder(result);
	        System.out.println(result);
	        System.out.println(result.length());
	      
	        for (int j = 0; j < sb.length()-1;) {
				
	        	if(sb.charAt(j++) == '1') {
					System.out.print("0 0");
					while(sb.charAt(j)=='1' && j < sb.length()) {
						System.out.print("0");
						j++;
					}
				
				}else {
					System.out.print("00 0");
					while(sb.charAt(j)=='0' && j < sb.length()) {
						System.out.print("0");
						j++;
					}
					
				}
				
				if(j < sb.length()) System.out.print(" ");
				
			}
	      in.close();

	    	  
	       }
	 

	}   
	

