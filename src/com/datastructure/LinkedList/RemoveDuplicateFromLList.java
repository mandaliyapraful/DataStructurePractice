/**
 * 
 */
package com.datastructure.LinkedList;

/**
 * @author mandaliya
 *
 */
public class RemoveDuplicateFromLList {

	public void removeDup(Node head) {
		Node next = null;
		while (head != null && head.next != null) {
			next = head;
			while (next.next != null) {
				if (head.data == next.next.data) {
					next.next = next.next.next;
				} else {
					next = next.next;
				}
			}
			head = head.next;
		}
	}

	public static void main(String[] args) {
		RemoveDuplicateFromLList duplicateFromLList = new RemoveDuplicateFromLList();
		LinkedList llist = new LinkedList();
		llist.push(6);
		llist.push(1);
		llist.push(6);
		llist.push(2);
		llist.push(6);
		llist.push(6);
		llist.push(3);
		// llist.display();
		// System.out.println(llist.head.data);
		duplicateFromLList.removeDup(llist.head);
		llist.display();
	}

}
