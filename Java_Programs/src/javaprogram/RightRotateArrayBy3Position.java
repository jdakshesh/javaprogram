package javaprogram;

import java.util.Arrays;

public class RightRotateArrayBy3Position {

	public static void main(String[] args) {
		/*	1. Decide how many positions you want to move the elements to the right (in this case, 3 positions).
	2. Use an outer loop to repeat the process for the number of positions you want to shift (3 times).
	3. Inside the outer loop, use an inner loop to shift all elements of the array by 1 position to the right:
	4. Save the last element of the array temporarily.
	5. Move each element one position to the right, starting from the end of the array.
	6. Place the saved last element into the first position of the array.
	7. Repeat this process until all elements are shifted by the desired number of positions.*/
		
		int arr[] = { 1, 2, 3, 4, 5 };
		int size = arr.length;
		int positions = 3; // Number of positions to rotate
		 // Store the last element temporarily
		// Loop for the number of positions to rotate
		for(int i=1;i<=positions;i++)
		{
			int last =arr[size - 1];
			for(int j=size-1;j>0;j--)
			{
				arr[j] = arr[j-1];
			}
			
			arr[0]=last;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
