/**
 * 
 */
package com.datastructure.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Mandaliya
 *
 */
public class RemoveKNode {
	
	public void createNode(LinkedList<Integer> link,int size){
		for(int i = 1;i <= size;i++){ //create the list with given size
			
			link.add(i);
		}
		
	}
	
	public void removeNode(LinkedList<Integer> link,int kth){
		Iterator<Integer> myLInk=link.iterator(); 
		int count=-1;
		while(myLInk.hasNext())
		{
			myLInk.next();
			count++; // to maintain the position
			if(count==kth) //if the current postion is equal to the removed position 
			{//remove the kth Node
				myLInk.remove();
				
			}
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<>();
		
		RemoveKNode kNode = new RemoveKNode();
		kNode.createNode(link, 4);
		System.out.println(link.toString());
		kNode.removeNode(link, 0);
		System.out.println(link.toString());
	}

}
