/**
 * 
 */
package com.datastructure.LinkedList;

/**
 * @author Mandaliya
 *
 */
public class ReverseLinkedList {

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
	
	public Node reverseLinkedList(Node head){
		//Node head = llist.head;
		Node prev = null;
		Node curr = head;
		Node next = null;
		while(curr!=null){//second loop
			next = curr.next;//2
			curr.next = prev;//3
			prev = curr;//1
			curr = next;//2
		}
		head = prev;//twist //1->0
		return head;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		LinkedList llist=reverseLinkedList.createLinkedList(6);
		//llist.display();
		llist.head=reverseLinkedList.reverseLinkedList(llist.head);
		System.out.println();
		llist.display();
		
	}

}
