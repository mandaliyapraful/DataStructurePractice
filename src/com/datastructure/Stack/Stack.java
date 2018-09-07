/**
 * 
 */
package com.datastructure.Stack;

/**
 * @author mandaliya
 *
 */
public class Stack {
	private String[] stackArray;

	private int stackSize;

	private int topOfStack;

	public Stack(int size) {
		this.stackSize = size;
		stackArray = new String[stackSize];
		topOfStack = -1;
	}

	public void push(String input) {
		if (topOfStack + 1 < stackSize) {
			topOfStack++;
			stackArray[topOfStack] = input;
		} else {
			System.out.println("Sorry the stack is full");
		}
		displayStack();
		System.out.println();
		System.out.printf("Push [%s] was done to the stack", input);
	}

	public String pop() {
		if (topOfStack >= 0) {
			System.out.println();
			System.out.printf("POP [%s] from the stack ", stackArray[topOfStack]);
			String val = stackArray[topOfStack];
			stackArray[topOfStack] = null;
			topOfStack--;
			displayStack();
			return val;
		} else {
			System.out.println("Stack is empty ");
			return "";
		}
	}

	public void displayStack() {
		for (int i = topOfStack; i > 0; i--) {
			System.out.println();
			System.out.printf("[%s]  [%s]",i,stackArray[i]);
		}
	}
	
	public String peek(){
		displayStack();
		System.out.println();
		System.out.printf("PEEK value from stack is [%s]",stackArray[topOfStack]);
		return stackArray[topOfStack];
	}

	public static void main(String[] args) {
		Stack  stack = new Stack(10);
		stack.pop();
		stack.push("2");
		stack.push("10");
		stack.push("20");
		stack.push("39");
		stack.push("40");
		stack.push("58");
		stack.push("60");
		stack.pop();
		System.out.println();
		stack.peek();
	}
}
