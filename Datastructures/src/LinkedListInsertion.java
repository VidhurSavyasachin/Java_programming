
public class LinkedListInsertion {
	static Node head;
	static Node sorted;
	
	static class Node{
		String value;
		Node next;
		Node(String value){
			this.value = value;
		}
	}
	static void push(String x) {
		Node newNode = new Node(x);
		newNode.next = head;
		head = newNode;
	}
	static void linkedList(Node headRef) {
		Node currentNode = headRef;
		sorted = null;
		while(currentNode != null) {
			Node next = currentNode.next;
			
			sortedList(currentNode);
			currentNode = next;
			
		}
		head = sorted;
	}
	static void sortedList(Node headRef) {
		if(sorted == null || (int)(sorted.value.charAt(0)) >= (int)(headRef.value.charAt(0))) {
			headRef.next = sorted;
			sorted = headRef;
		}
		else {
			Node current = sorted;
			while(current.next != null && (int)(current.next.value.charAt(0)) < (int)(headRef.value.charAt(0))) {
				current = current.next;
			}
			headRef.next = current.next;
			current.next = headRef;
		}
		
		
	}
	static void printList(Node head) {
		while(head!=null) {
			System.out.println(head.value + " ");
			head = head.next;
		}
	}
	public static void main(String args[] ) {
		LinkedListInsertion list = new LinkedListInsertion();
		list.push("zello"); 
        list.push("xhas");
        list.push("aLit");
       
        
        System.out.println("\nLinkedList After sorting"); 
        list.printList(list.head); 
	}




}
