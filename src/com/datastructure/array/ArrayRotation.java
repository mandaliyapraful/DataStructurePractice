package com.datastructure.array;

public class ArrayRotation {
	
	public void rotate(int[] input,int shift){
		for(int i=0;i < shift;i++)
			rotateByOne(input);
	}

	private void rotateByOne(int[] input) {
		int temp,i;
		temp = input[0];
		for(i =0;i < input.length - 1;i++ ){
			//swap 
			input[i] = input[i+1];	
		}
		//first element to last position 
		input[i] = temp;
	}
	
	/**
	 * @param input
	 */
	void displayArray(int[] input){
		for (int i : input) {
			System.out.print(i + " ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []input = {1,2,3,4,5,6,7,8,9,10};
		
		int shiftBy = 1;
		
		ArrayRotation arrayRotation = new ArrayRotation();
		arrayRotation.displayArray(input);
		arrayRotation.rotate(input, shiftBy);
		System.out.println();
		arrayRotation.displayArray(input);
	}

}
