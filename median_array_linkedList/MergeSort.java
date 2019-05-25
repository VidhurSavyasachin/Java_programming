package median_array_linkedList;

import java.util.LinkedList;



public class MergeSort {
	public static void printArray(int[] array) {
		for(int i: array) {
			System.out.print(i + " ");
		}
		
	}
	public static int[] mergeSort(int[] array) {
			//length lessthan or equal to one.
		if(array.length <= 1) {
			return array;
		}
		else {
			int midpoint = array.length/2;
			int[] left = new int[midpoint];
			int[] right;
			if(array.length % 2 == 0) {
				right = new int[midpoint];
			}else {
				right = new int[midpoint + 1];
			}
			for(int i=0;i<midpoint;i++) {
				left[i] = array[i];
				
			}
			for(int j=0;j<right.length;j++) {
				right[j] = array[midpoint+j];
			}
			int[] result = new int[array.length];
			left = mergeSort(left);
			right = mergeSort(right);
			result = merge(left,right);
			return result;
		}
		
			
	}
	public static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int rightPointer,leftPointer,resultPointer;
		rightPointer = leftPointer = resultPointer = 0;
while(leftPointer < left.length || rightPointer < right.length) {
			
			// If there are items in BOTH arrays...
			if(leftPointer < left.length && rightPointer < right.length) {
				
				// If left item is less than right item...
				if(left[leftPointer] < right[rightPointer]) {
					
					result[resultPointer++] = left[leftPointer++];
					
				} else {
					
					result[resultPointer++] = right[rightPointer++];
					
				}
				
			}
			
			// If there are only items in the left array...
			else if(leftPointer < left.length) {
				
				result[resultPointer++] = left[leftPointer++];
				
			}
			
			// If there are only items in the right array...
			else if(rightPointer < right.length) {
				
				result[resultPointer++] = right[rightPointer++];
				
			}
 			
		}

		
		return result;
	}
//	public static void main(String args[]) {
//		int[] a = {1,4,5};
//		int[] b = {1,3,4};
//		int[] c = {2,6};
//		
//		int aLen = a.length;
//		int bLen = b.length;
//		int cLen = c.length;
//		int[] result = new int[aLen + bLen+cLen];
//		System.arraycopy(a, 0, result, 0, aLen);
//		
//		printArray(result);
//		System.out.println();
//		System.arraycopy(b, 0, result,aLen,bLen);
//		printArray(result);
//		System.out.println();
//		int[] resultj = new int[aLen + bLen];
//		int rLen1 = resultj.length;
//		System.arraycopy(c, 0, result, rLen1, cLen);
//	printArray(result);
//		System.out.println(" ");
//		result = mergeSort(result);
//		printArray(result);
//		
//	}

	
}
