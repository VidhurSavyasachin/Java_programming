import java.util.Arrays;
import java.util.Scanner;

public class descend {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = {9,8,7,3,6,5,2,4};
		int maximum = arr[0];
		int value = 0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > maximum) {
				maximum = arr[i];
				value = i;
				
			}
			System.out.println(value);
			
             // represents the height of one mountain.
            
            
		}
		for (int i=0; i<arr.length;i++) {
	        for (int k=i;k<arr.length;k++) {

	        if(arr[i] > arr[k]) {

	        int temp=arr[k];
	        arr[k]=arr[i];
	        arr[i]=temp;
	        }
	            }

	    }
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	

	 
}
}
/*
9
8
7
6
5
4
3
2

0
6
7
5
0
8
1
0
*/