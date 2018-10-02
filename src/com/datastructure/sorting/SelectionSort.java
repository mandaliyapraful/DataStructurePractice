/**
 * 
 */
package com.datastructure.sorting;

/**
 * @author mandaliya
 *
 */
public class SelectionSort {

	public int[] sort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {// increment the min point to
													// next element

			// set the min location
			int min_index = i;

			for (int j = i + 1; j < arr.length; j++) {
				// search minimum in the list
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			if (min_index != i) {
				// swap the value with min_index value
				int temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}

		}
		return arr;

	}

	public void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 8, 15, 1, 24, 13, 4 };

		SelectionSort selectionSort = new SelectionSort();
		int sortedArr[] = selectionSort.sort(arr);
		selectionSort.display(sortedArr);
	}
}
