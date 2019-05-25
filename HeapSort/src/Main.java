//
//public class Main {
//	public static void main(String[] args) {
//		//insert the file take the values.
////		int[] values = {
////				 39113,
////
////				   54915,
////
////				   26190,
////
////				   37212,
////
////				   58848,
////
////				   31396,
////
////				   29855,
////
////				    3671,
////
////				   44600,
////
////				   48081,
////
////				   21194,27000,34985, 33255,3222,
////				   18811,
////
////				    1351,
////
////				   20234,
////
////				   41776,
////
////				   13450,
////
////				   10752,
////
////				   44224,
////
////				   44584,
////
////				   14467,
////
////				   50190,
////
////				   61028,
////
////				   23783,
////
////				   26678,
////
////				   13863,
////
////				   26446
////
////				   
////};
//		Heap heap = new Heap(10);
////		for (int i = 0; i < values.length; i++) {
////			heap.insert(values[i]);
////		}
//		heap.insert("t");
//		heap.insert("o");
//		heap.insert("d");
//		heap.insert("a");
//		heap.insert("y");
//		heap.insert("i");
//		heap.insert("s");
//		heap.insert("e");
//		heap.insert("m");
//		heap.insert("u");
//		
//		heap.printHeap();
//		//System.out.println(heap.Peek());
//		heap.sort();
////		
//		heap.printHeap();
//		
//		
//	}
//}


import java.util.LinkedList;



public class Main {
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
	public static void main(String args[]) {
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
		int array[] = {29,37,42,46,48,49,51,58,59,64,65,69,37,31,42,60,32,12,41,30,40,27,26,31,26,51,33,49,36};
		array = mergeSort(array);
		printArray(array);
		
	}

	
}
