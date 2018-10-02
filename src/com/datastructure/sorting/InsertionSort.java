/**
 * 
 */
package com.datastructure.sorting; 

/**
 * @author mandaliya
 *
 */
public class InsertionSort {
	
	public int[] sort(int arr[]){
		int len = arr.length;
		//if one length then return
		if(len == 1){
			return arr;
		}
		
		for(int i = 1 ;i < len;i++){
		//pick the next element 	
			int key = arr[i];
			
		//compare with all the element in sorted sub_list
		//shift all the elements 
			int j = i-1;
			
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j = j-1; 
			}
		//insert the value
			arr[j+1] = key;
		}
		
		
		return arr;
	}
	
	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[] = { 2, 8, 15, 1, 24, 13, 4 };
		InsertionSort insertionSort = new InsertionSort();
		int[] sortedArr = insertionSort.sort(arr);
		insertionSort.display(sortedArr);
	}

}
