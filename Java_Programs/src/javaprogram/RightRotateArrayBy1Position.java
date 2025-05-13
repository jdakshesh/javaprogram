package javaprogram;

import java.util.Arrays;

public class RightRotateArrayBy1Position {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int size = arr.length;
		//store the last element into a temp variable
		int last = arr[size - 1];
		//now shift the element on right to left with help of loop
		for(int i= size-1;i>0;i--)
		{
			arr[i]=arr[i-1]; //move the left element to right
		}
		
		//now add the last element stored in temp variable to index 0
		arr[0]=last;
		//print the array
		System.out.println(Arrays.toString(arr));

	}

}
