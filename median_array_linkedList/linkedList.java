//package median_array_linkedList;
//
//import java.util.Scanner;
//
//public class linkedList {
//	// public class linkedList{
//// 	public class Node{
//// 		int data;
//// 		Node next;
//// 		Node(int data){
//// 			this.data = data;
//// 			next = null;
//// 		}
//// 	}
//// 	Node head;
//// 	public static void insert(int data){
//// 		Node new_node = new Node(data);
//// 		new_node.data = data;
//// 		new_node.next = null;
//// 		 if(head == null){
//// 			head = new_node;
//// 		}
//// 		else{
//// 			Node last = new_node;
//// 			while(last.next != null){
//// 					last = last.next;
//
//// 			}
//// 			last.next = new_node;
//// 		}
//// 	}
//	public class SinglyLinkedListNode{
//		int data;
//		SinglyLinkedListNode next;
//		SinglyLinkedListNode(int data){
//			this.data = data;
//			next = null;
//		}
//	}
//	SinglyLinkedListNode head;
//	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
//            SinglyLinkedListNode new_node = new SinglyLinkedListNode(data);
//            if(llist == null){
//            	llist = new_node;
//            }
//            else{
//            	SinglyLinkedListNode last_node = new_node;
//            	while(last_node != null){
//            		last_node = last_node.next;
//            	}
//            	last_node.next = new_node;
//
//            }
//           
//            return llist;
//
//
//    }
////    static SinglyLinkedListNode insertAtStart(SinglyLinkedListNode llsit,int data){
////    		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
////    		node.next = null;
////    		node.next = llist;
////    		llist = node;
////   	 	}
//	static void show(SinglyLinkedListNode llist) {
//		 SinglyLinkedListNode print = llist;
//         while(print != null) {
//         	System.out.println(print.data);
//         	print = print.next;
//         }
//         System.out.println(print.data);
//		
//	} 
//	private static final Scanner scanner = new Scanner(System.in);
//	public static void main(String args[]){
//		linkedList llist = new linkedList();
//		int llistCount = scanner.nextInt();
//		for (int i = 0; i < llistCount; i++) {
//            int llistItem = scanner.nextInt();
////            SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem);
//            llist.head = llist_head;  
//        }
//		
//	}
//
//
//
//}
//
