/**
 * 
 */
package com.datastructure.sorting;

/**
 * @author mandaliya
 *
 */
public class MergeSort {
	  
	public void sort(int arr[], int l, int r){
		
		if(l < r){
			//find middle
			int m = (l+r)/2;
			
			//sort the first and second half
			sort(arr, l, m);
			sort(arr, m+1, r);
			
			//merge the sorted arr
			merge(arr, l, m, r);
		}
	}
	
	private void merge(int[] arr, int l, int m, int r) {
		//find the size of sub array to be merged
		int n1 = m - l + 1;
		int n2 = r - m; 
		//create the temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		//copy data in temp arrays
		for(int i = 0; i < n1; i++){
			L[i] = arr[l + i];
		}
		for(int j = 0; j < n2; j++){
			R[j] = arr[m + 1 + j];
		}
		
		//merge the temp arrays
		//Initial index of merged sub Arrays
		int i = 0, j = 0;
		
		 // Initial index of merged subarry array 
		int k = l;
		
		while(i < n1 && j < n2){
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			}else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		 /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
		
	}		
	public void display(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(" "+arr[i]);
		}
	}

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		mergeSort.sort(arr, 0, arr.length - 1);
		mergeSort.display(arr);
	}

}
