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
