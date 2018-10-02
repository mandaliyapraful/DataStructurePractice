/**
 * 
 */
package com.datastructure.sorting;

/**
 * @author mandaliya
 *
 */
public class BubbleSort {
	
	public int[] sort(int arr[]){
		int len = arr.length;
		for(int i = 0 ;i < len-1 ;i++ ){
			
			for(int j = 0 ;j < len - i-1 ; j++){
				if(arr[j+1] < arr[j]){
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
//				System.out.println();
//				display(arr);

			}
		
		}
				return arr;
	}
	
	public void recursiveSort(int arr[],int len){
		if(len == 1){
			return;
		}
		for(int i =0 ;i < len-1; i++){
			if(arr[i+1] < arr[i]){
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}
		}
		recursiveSort(arr, len-1);
	}
	
	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 15, 1, 24, 13, 4 };
		BubbleSort bubbleSort = new BubbleSort();
		int sortedArr[] = bubbleSort.sort(arr);
		//bubbleSort.display(sortedArr);
		bubbleSort.recursiveSort(sortedArr, arr.length);
		bubbleSort.display(arr);
	}
}
