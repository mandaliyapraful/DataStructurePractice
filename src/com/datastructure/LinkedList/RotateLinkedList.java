/**
 * 
 */
package com.datastructure.LinkedList;

/**
 * @author Mandaliya
 *
 */
public final class RotateLinkedList {

	public void rotateLinkedList(LinkedList llist, int shift) {
		if(shift == 0) {
			return;
		}
		Node current = llist.head;
		Node nNode = null;
		int count = 1;
		while (count < shift && current != null) {
			current = current.next;
			count ++;
		}
		if(current == null){
			return;
		}
		
		nNode = current;
		
		while (current.next != null) {
			current = current.next;
		}
		current.next = llist.head;
		llist.head = nNode.next;
		nNode.next = null;
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist = llist.createLinkedList(6);
		RotateLinkedList rotateLinkedList = new RotateLinkedList();
		rotateLinkedList.rotateLinkedList(llist, 1);
		System.out.println();
		llist.display();

	}
}
