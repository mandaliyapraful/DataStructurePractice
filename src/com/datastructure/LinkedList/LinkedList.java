/**
 * 
 */
package com.datastructure.LinkedList;

/**
 * @author Mandaliya
 *
 */
public class LinkedList {
	
	Node head;
	
	public void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data+ " ");
			n = n.next;
		}
	}
	
	public int size(){
		int count = 0;
		Node n = head;
		while(n!=null){
		//	System.out.print(n.data+ " ");
			n = n.next;
			count ++ ;
		}
		
		return count;
	}
	
	public LinkedList createLinkedList(int size) {

		LinkedList llist = new LinkedList();
		//prev node  
		Node pNode = null;
		// loop till the size mentioned
		for (int i = 0; i < size; i++) {
			if (llist.head == null) { // check if head is null
				llist.head = new Node(i);
			} else {
				Node iNode = new Node(i); // create a node and assign it to
											// head.next
				if (llist.head.next == null) {
					llist.head.next = iNode;
					pNode = iNode; // set prev node for linking
				} else {
					Node cNode = new Node(i); // create a current node
					pNode.next = cNode; // prev node next to point current node
					pNode = cNode; // set prev node to current node
				}
			}

		}
		llist.display();
		return llist;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		
		second.next = third;
		llist.display();
		
	}

}
