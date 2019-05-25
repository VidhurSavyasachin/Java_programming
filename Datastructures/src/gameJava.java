import java.util.*;
import java.util.HashMap; 
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.lang.Object;

public class gameJava {
	
	    
	        
public static void main(String args[]) {
	 Scanner in = new Scanner(System.in);
     int N = in.nextInt();
     int M = in.nextInt();
     if (in.hasNextLine()) {
         in.nextLine();
     }
     int count = 0;
     int countCol = 0;
    char[][] a = new char[N][M];
     for (int i = 0; i < N; i++) {
         String S = in.nextLine();
         char[] s = S.toCharArray();
         for(int j=0;j<M;j++) {
        	 a[i][j] = s[j];
        	 if(a[0][j]=='*') {
        		count++;
        	 }
        	 System.out.println("T/F" + a[i][0]);
        	 
        	  System.out.println("arr[" + i + "][" + j + "] = "
                      + a[i][j] + "Col "  + count + " Row "+ countCol ); 
     
         }
//         if(a[i][0]=='*') {
//    		 countCol++;
//    	 }
         count=0;
         
}
}
}
//int[] colSum =new int[array[0].length];
//for (int i = 0; i < array.length; i++){   
//    for (int j = 0; j < array[i].length; j++){                
//        sum += array[i][j];
//        colSum[j] += array[i][j];
//    }
//    System.out.println("Print the sum of rows =" + sum);
//}  
//for(int k=0;k<colSum.length;k++){
//    System.out.println("Print the sum of columns =" + colSum[k]);
//} 
/*
 * 
 * 
 * 
3
4
..**
.**.
***.
 */

	

