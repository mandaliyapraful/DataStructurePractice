/**
 * 
 */
package com.datastructure.LinkedList;

/**
 * @author Mandaliya
 *
 */
public class InsertNode {

	public LinkedList createLinkedList(int size) {

		LinkedList llist = new LinkedList();
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

	public void insertInMiddleNode(LinkedList llist, int NodeData) {
		int count = 0;
		int mid = llist.size()/2;
		Node n = llist.head;
		while(n!=null){
		//	System.out.print(n.data+ " ");
		
			if(mid == count){
				//System.out.println(llist.size()/2);
				Node mNode = new Node(NodeData);
				Node tNode = n.next;
				n.next = mNode;
				mNode.next = tNode;
			}
			n = n.next;
			count ++;
		}
		System.out.println();
		llist.display();
		

	}

	public static void main(String[] args) {
		InsertNode insertNode = new InsertNode();
		LinkedList llist = insertNode.createLinkedList(4);
		insertNode.insertInMiddleNode(llist, 7);  
		
	}

}
