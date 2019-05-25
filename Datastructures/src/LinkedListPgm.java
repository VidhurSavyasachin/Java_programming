
public class LinkedListPgm {
	static Node head;
	static class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
		}
	}
	
	
	
	
	
	
	static void insertionSort(String[] data) {
		for(int unsortedArray = 1;unsortedArray < data.length;unsortedArray++)
		{
			String newData = data[unsortedArray];
			int i;
			for ( i = unsortedArray; i > 0 && newData.compareTo(data[unsortedArray-1]) < 0 ; i--) {
				
					data[i]  = data[i-1];
				
			
			}
			data[i] = newData;
		}
		
	}
	
	static void printData() {
		Node curr_node = head;
		while(curr_node.next !=null) {
			System.out.println(curr_node.data);
			curr_node = curr_node.next;
			
		}
		System.out.println(curr_node.data);
	}
	public static void main(String[] args) {
		String[] data = {"beta","gamma","alpha","epsilon","delta"};
		insertionSort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
			
		}
		
		
		
		
	}
}
