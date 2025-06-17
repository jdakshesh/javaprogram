package datastructure;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = {35,1,5,16,3,9,12};
		int temp;
		// outer loop for focus element
		for(int i=0;i<a.length-1;i++)
		{
			//define variable to store minimum index assuming value at index i minimum value for current iteration and assigning index i to min index variable
			int min =i;
			//inner loop to find the minimum index value 
			for(int j=i+1;j<a.length-1;j++)
			{
				//comparing value at index j with value at minimum index and if value at j index is less than minimum index replace mimimum index value with j
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			
			temp = a[i];
			a[i]= a[min];
			a[min] = temp;
		}
		
		System.out.println(Arrays.toString(a));
	}	
	
	
}