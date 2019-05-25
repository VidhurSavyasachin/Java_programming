package median_array_linkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDup {
	  public static void main(String args[]) {
	        Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        int[] val = new int[N];
	        for (int i = 0; i < N; i++) {
	            int X = in.nextInt();
	            val[i] = X;
	        }
	        LinkedHashSet<Integer> v = new LinkedHashSet<Integer>();
	        for(int i = 0; i < N; i++){
	        	  v.add(val[i]);
	        	}
Iterator newI = v.iterator();
while(newI.hasNext()) {
	  System.out.println(newI.next());
	}
	        // Write an action using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	       
	    }
}
