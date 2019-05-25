

public class ListNodeInJava {
	static ListNode head;
	static ListNode head2;
	
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	  }
	
	static void push(int x) {
		ListNode newNode = new ListNode(x);
		
		newNode.next = head;
		head = newNode;
		
	}
	static void push2(int x) {
		ListNode newNode = new ListNode(x);
		
		newNode.next = head2;
		head2 = newNode;
		
	}
static class Solution {
		
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2) {
	    ListNode currentNode = l1;
	    	ListNode currentNodel2 = l2;
	    	int sum1 = 0,sum2 =0;
	    	int[] arr = new int[3];
	    	int[] arr1= new int[3];
	    	int[] result = new int[arr.length];
	    	while(currentNode != null && currentNodel2 != null) {
	    		arr[sum1] = currentNode.val;
	    		arr1[sum2] = currentNodel2.val;
	    		ListNode next = currentNode.next;
	    		ListNode nextl2 = currentNodel2.next;
				currentNode = next;
				currentNodel2 = nextl2;
				sum1++;
				sum2++;
			}
	    	StringBuilder strNum = new StringBuilder();
	    	StringBuilder strNum1 = new StringBuilder();
	    	for (int num : arr) 
	    	{
	    	     strNum.append(num);
	    	}
	    
	    	for (int num : arr1) 
	    	{
	    	     strNum1.append(num);
	    	}
	    	int finalInt = Integer.parseInt(strNum.toString());
	    	int finalInt1 = Integer.parseInt(strNum1.toString());
	    	int result_value = finalInt + finalInt1;
	    	System.out.println(result_value);
	   return currentNode;
	    	
	    }
	}
	static void printList(ListNode head) {
		while(head!=null) {
			System.out.println(head.val + " ");
			head = head.next;
		}
	}
	public static void main(String args[]) {
		ListNodeInJava ls = new ListNodeInJava();
		ListNodeInJava ls1 = new ListNodeInJava();
		Solution s = new Solution();
		//100 //100
		head = null;
		ListNode ln = new ListNode(1);
		ln.next = new ListNode(0);
		ln.next.next = new ListNode(0);
		ListNode ln2 = new ListNode(1);
		ln2.next = new ListNode(0);
		ln2.next.next = new ListNode(0);
//	
		System.out.println("");

		s.addTwoNumbers(ln,ln2);

		
		
		
	  
	       
	}
}
//