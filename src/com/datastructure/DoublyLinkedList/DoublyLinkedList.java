/**
 * 
 */
package com.datastructure.DoublyLinkedList;

import com.datastructure.DoublyLinkedList.Node;

/**
 * @author mandaliya
 *
 */
public class DoublyLinkedList {
	Node head;
	
	public void pushInFront(int data){
		//Step 1 : Allocate the node 
		//Step 2 : Put in the data
		Node new_node = new Node(data);
		//Step 3 : Make next of new_node as head
		new_node.next = head;
		new_node.prev = null;
		
		//Step 4: change prev of head to new node
		if (head != null){ 
			head.prev = new_node;
		}
		//Step 5 : move the head to point new_node
		head = new_node;
	}
	
	public void pushBeforeGivenNode(Node next,int data){
		 if(next == null){
			 System.out.println("The given previous node cannot be null");
			 return;
		 }
		 Node new_node=new Node(data);
		 new_node.next = next;
		 new_node.prev = next.prev;
		 //change the next of prev to new_node
		 if(new_node.prev != null)
			 new_node.prev.next = new_node;
	}
	
	public void pushAfterGivenNode(Node prev,int data){
		if(prev == null){
			System.out.println("The given node cannot be  null");
			return;
		}
		Node new_node = new Node(data);
		new_node.prev = prev;
		new_node.next = prev.next;
		prev.next.prev = new_node;
		prev.next = new_node;
		
	}
	
	public void pushInEnd(int data){
		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		Node new_Node = new Node(data);
		
		last.next =new_Node;
		new_Node.prev = last;
		new_Node.next = null;
	}
	
	public void display(){
		Node n = head;
		while(n!=null){
			System.out.print( "-->"+n.data);
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dllist = new DoublyLinkedList();
		System.out.println("Push in Front");
		dllist.pushInFront(1);
		dllist.pushInFront(2);
		dllist.pushInFront(3);
		dllist.display();
		System.out.println();
		System.out.println("Before");
		//dllist.pushBeforeGivenNode(dllist.head.next, 4);
		dllist.display();
		System.out.println();
		System.out.println("After");
		dllist.pushBeforeGivenNode(dllist.head.next, 5);
		dllist.display();
		System.out.println();
		System.out.println("Push in End");
		dllist.pushInEnd(7);
		dllist.pushInEnd(8);
		dllist.display();
	}

}
