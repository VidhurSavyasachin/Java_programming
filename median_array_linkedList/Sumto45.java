package median_array_linkedList;

import java.util.Scanner;

public class Sumto45 {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] st = s.toCharArray();
        int sum = 0;
        int[] val = new int[s.length()];
        for (int i = 0; i < val.length; i++) {
        	if(st[i]!='?'){
			val[i] = Character.getNumericValue(s.charAt(i));
        	sum+=val[i];
        	}
		}
        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(45-sum);
    }
}
