




public class BubbleSort {
	
	
	
	public static void main(String args[]) {
		
		int[] array = {20, 35, -15, 7 ,55, 1 , -22 };
		
		insertionSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		
		
	}
	
	public static void insertionSort(int[] array) {
		for(int firstUnsortedIndex = 1;firstUnsortedIndex < array.length ; firstUnsortedIndex++) {
			int newElement = array[firstUnsortedIndex];
			
			int i;
			
			for(i = firstUnsortedIndex; i > 0 && array[i-1] > newElement;i--) 
			{
				array[i] = array[i-1];
				  
			}
			array[i] = newElement;
		}
		
	}
	
	 
	
	
	public static void selectionSort(int[] array) {
		for (int unsorted =  array.length -1 ; unsorted > 0; unsorted--) {
			int largestIndex = 0;
			for (int i = 1; i <= unsorted; i++) {
				if(array[i] > array[largestIndex]) {
					largestIndex = i;
				}
				swap(array,largestIndex,unsorted);
			}
		}
	}
	
	
	
	
	
	
	public static void BubbleSort(int[] array) {
		for(int unsorted = array.length -1;unsorted > 0;unsorted--) {
			for (int i = 0; i < unsorted; i++) {
				if(array[i] > array[i+1]) {
					swap(array,i,i+1);
				}
			}
		}
	}
	
	
	
	
	
	
	public static void swap(int[] array, int i,int j) {
		
		if(i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
}
