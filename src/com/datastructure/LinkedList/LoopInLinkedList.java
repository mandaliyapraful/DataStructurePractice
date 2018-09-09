/**
 * 
 */
package com.datastructure.LinkedList;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author mandaliya
 *
 */


public class LoopInLinkedList {
	

public boolean checkLoop(Node head){
	HashSet<Node> nodes = new HashSet<Node>();
	while(head != null){
		if(!nodes.contains(head)){
			System.out.println(head.data);
			nodes.add(head);
		}else{
			return true;
		}
		head = head.next;
	}
	return false;
}
	public static void main(String[] args)  {
		LoopInLinkedList inLinkedList = new LoopInLinkedList();
		LinkedList llist = new LinkedList();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.push(5);
		
		//create the loop in Linkedlist
		llist.head.next.next.next.next = llist.head.next;
		
		System.out.println(inLinkedList.checkLoop(llist.head));
	}

}
