/**
 * 
 */
package com.datastructure.Queue;

/**
 * @author mandaliya
 *
 */
public class Queue {
	
	private String queueArray[];
	
	private int queueSize;
	
	private int front,rear,numberOfItem = 0;
	
	public Queue(int size) {
		this.queueSize = size;
		queueArray = new String[queueSize];
	}
	
	public void insert(String input){
		if(numberOfItem + 1 <= queueSize){
			queueArray[rear] = input;
			rear ++;
			numberOfItem ++;
			System.out.println();
			System.out.printf(" Element insertes [%s] ",input);
		}else{
			System.out.println("QUEUE is full ");
		}
	}
	
	public void remove(){
		if(numberOfItem > 0){
			System.out.println(" Removed element "+queueArray[front]);
			queueArray[front] = null;
			front++;
			numberOfItem--;
		}else{
			 System.out.println("QUEUE is empty ");
		}
	}
	public void display(){
		System.out.println();
		for(int i = 0;i < queueSize ;i ++){
			if(i == front ){
				System.out.printf("["+i+"] - [%s] - [%s] ",queueArray[front],"Front");
			}else if(i == rear){
				System.out.printf("["+i+"] - [%s] - [%s] ",queueArray[rear],"Rear");
			}else{
				System.out.printf("["+i+"] - [%s] ",queueArray[i]);
			}
			System.out.println();
		}
		
	}
	
	public void priorityInsert(String input){
		int i;
		if(numberOfItem == 0){
			insert(input);
		}else{
			for (i = numberOfItem-1;i >=0 ;i--){
				if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){
					queueArray[i+1] = queueArray[i];
					
				}else{
					break;
				}
			}

			queueArray[i+1] = input;
			rear++;
			numberOfItem++;
		}
	}
	public static void main(String[] args) {
		Queue queue = new Queue(10);
		queue.insert("1");
		queue.insert("2");
		queue.insert("3");
		queue.insert("4");
		queue.remove();
		queue.insert("6");
		queue.insert("7");
		queue.insert("8");
		queue.remove();
		queue.insert("9");
		queue.insert("0");
		queue.display();
		System.out.println();
		
		Queue pQueue = new Queue(5);
		pQueue.priorityInsert("50");
		pQueue.priorityInsert("10");
		pQueue.priorityInsert("80");
		pQueue.priorityInsert("60");
		pQueue.priorityInsert("15");
		pQueue.display();
/*		queue.remove();a
		queue.remove();
		queue.display();
*/		
	}
}
