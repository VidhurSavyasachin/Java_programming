package median_array_linkedList;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        boolean result = true;
        String reverse = "";
        for (int i = 0; i < N; i++) {
            String W = in.next();
            for(int j=W.length()-1;j>=0;j--) {
            		reverse+=W.charAt(j);
            	
            }
            if(W.equals(reverse)) {
            	result = true;
            	
            }else {
            	result = false;
            	
            }
            System.out.println(result);
            reverse = "";
            
        }


  
    }
}