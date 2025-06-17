package datastructure;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int a[] = { 41, 62, 23, 46, 2, 9, 89, 25, 15, 65 };
		MergeSort ms =new MergeSort();
		 // Call Sort function to sort the array
		ms.sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
	}
	// Merge Sort function: divides the array into halves and sorts them
	public void sort(int a[],int begin, int end) {
		if(begin<end) {
		
		// Find the middle point to divide the array into two halves
		 int middle =(begin+end)/2; //find the middle element
		// Recursively sort the first half
		 sort(a,begin,middle);
		 // Recursively sort the second half
		 sort(a,middle+1,end);
		 // Merge the sorted halves
		 
		merge(a,begin,middle,end);
		}
	}
	
	//Merge function: merges two sorted sub-arrays into one sorted array
	public void merge(int[] a, int begin, int middle, int end) {
		// Find sizes of two sub-arrays to be merged
		int leftSize = middle-begin+1; // size of left subarray
		int rightSize = end-middle; // size of right subarray
		
		// Create temporary arrays
		int leftArray[] = new int[leftSize];
		int rightArray[] = new int[rightSize];
		for(int i=0;i<leftSize;i++)
		{
			leftArray[i]=a[begin+i];
		}
		for(int j=0;j<rightSize;j++)
		{
			rightArray[j] = a[middle+1+j];
		}
		
		// Initial indexes of first and second subarrays
		int i=0;
		int j=0;
		// Initial index of merged subarray
		int k= begin;
		
		  // Merge the temporary arrays back into arr[left..right]
		while(i<leftSize && j<rightSize)
		{
			if(leftArray[i]<rightArray[j])
			{
				a[k]=leftArray[i];
				i++;
			}
			else
			{
				a[k]= rightArray[j];
				j++;
			}
			
			k++;
		}
		
		// Copy remaining elements of Left[], if any
		while(i<leftSize)
		{
			a[k]=leftArray[i];
			i++;
			k++;
		}
		
		// Copy remaining elements of Right[], if any
		while(j<rightSize)
		{
			a[k]=rightArray[j];
			j++;
			k++;
		}
			
			
	}

}
