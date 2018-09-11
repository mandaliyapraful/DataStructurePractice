/**
 * 
 */
package com.datastructure.LinkedList;

import java.util.Stack;

/**
 * @author mandaliya
 *
 */
public class PalindromeCheck {

	
	public boolean checkPalindrome(LinkedList llist){
		Node n = llist.head;
		int count = 0;
		Stack stack = new Stack<>();
		while(n != null){
				stack.add(n.data);
			n = n.next;
		}
		while(llist.head != null){
			if(llist.head.data !=(int) stack.pop())
			{
				return false;
			}else{
				llist.head = llist.head.next;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		PalindromeCheck palindromeCheck = new PalindromeCheck();
		LinkedList llist = new LinkedList();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(2);
		llist.push(1);
		System.out.println(palindromeCheck.checkPalindrome(llist));
	}
}
