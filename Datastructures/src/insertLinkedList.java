import java.util.LinkedList;

public class insertLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			
		}
	}

	public int searchInsert(int[] nums, int target) {
	    int i=0; 
	    int j=nums.length-1;
	 //0<=3
	    //1
	    while(i<=j){
	        int mid = (i+j)/2;
	 
	        if(target > nums[mid]){
	            i=mid+1;
	        }else if(target < nums[mid]){
	            j=mid-1;
	        }else{
	            return mid;
	        }
	    }
	 
	    return i;
	}

	
	
	
	public static void main(String args[]) {
		insertLinkedList in = new insertLinkedList();
		int[] nums = {1,3,5,6};
		System.out.println(in.searchInsert(nums, 7));
	}
}
