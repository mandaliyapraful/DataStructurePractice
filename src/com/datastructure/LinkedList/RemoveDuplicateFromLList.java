/**
 * 
 */
package com.datastructure.LinkedList;

/**
 * @author mandaliya
 *
 */
public class RemoveDuplicateFromLList {
	
	public void removeDup(Node head){
		Node next = head.next;
			
	}
	
	public static void main(String[] args) {
		RemoveDuplicateFromLList duplicateFromLList = new RemoveDuplicateFromLList();
		LinkedList llist = new LinkedList();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(6);
		llist.display();
		System.out.println(llist.head.data);
	}

}
