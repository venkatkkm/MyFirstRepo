package com.linkedList;

public class LinkedList {

	Node head;
	
	public static void main(String[] args) {

		LinkedList ls = new LinkedList();
		ls.createLL(5);
		//ls.printLL();
		ls.createLL(3);
		ls.createLL(6);
		ls.createLL(3);
		ls.createLL(6);
		ls.insertAtIndex(2,4);
		ls.replace(1,8);
		//ls.deleteAt(1);
		
		ls.printLL();
		ls.reverseLL();
	}
	
	 void createLL(int nodeValue) {
		 Node n = new Node(nodeValue);
		if(head == null) {
			head = n;
		} else {
			Node t = head;
			while(t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
	}
	 
	 void printLL() {
		 Node n = head;
		 while(n != null) {
			 System.out.print(n.data+"->");
			 n = n.next;
		 }
		System.out.println();
	 }
	 
	 void reverseLL() {
		 Node current = head;
		 Node pre = null;
		 Node nxt = null;
		 while(current != null) {
			 nxt = current.next;
			 current.next = pre;
			 pre = current;
			 current = nxt;
		 }
		
		 while(pre != null && head !=null) {
			
			 if(pre.data != head.data) {
				 System.out.println("not palindrome");
				 break;
			 } else System.out.println("palindrome");
			 pre = pre.next;
			 head = head.next;
		 }
	 }
	 
	 void insertAtIndex(int index,int data) {
		 Node newNode = new Node(data);
		 Node n = head;
		 for(int i=0;i<index-1;i++) {
			 n = n.next;
		 }
		 newNode.next = n.next;
		 n.next = newNode;
	 }
	 void replace(int index,int data) {
		 Node newNode = new Node(data);
		 Node n = head;
		 for(int i=0;i<index-1;i++) {
			 n = n.next;
		 }
		 n = n.next;
		 n.data = newNode.data;
	 }
	 
	 void deleteAt(int index) {
		 Node n = head;
		 if(index>0) {
		 for(int i=0;i<index-1;i++) {
			 n = n.next;
		 }
		
		 Node del = n.next;
		 n.next = del.next;
		 } else {
			 Node temp = head.next;
			 head = temp;
		 }
	 }
	 void deleteLast() {
		 Node temp = head;
		 while(temp.next!=null) {
			 temp = temp.next;
		 }
		 temp = null;
	 }
}
