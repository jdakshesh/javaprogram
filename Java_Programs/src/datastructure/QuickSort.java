package datastructure;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {50,25,119,41,62,21,65,84,33,21};
		QuickSort qs = new QuickSort();
		qs.sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
		}
	 // The main QuickSort function
	public  void  sort(int a[], int lowerBound,int upperBound)
	{
		if(lowerBound<upperBound) {
		int location = partition(a,lowerBound,upperBound);
		sort(a,lowerBound,location-1);
		sort(a,location+1,upperBound);
		
		}
	}
	
	// Partition function: rearranges the array around the pivot
	public int partition(int a[],int lowerBound, int upperBound) {
		
		int pivot = a[lowerBound];//considering first element as pivot
		int start = lowerBound;
		int end = upperBound;
		// wrap the while loop which swap the start and end  around pivot around while loop so that rearranging happens till
        // start index remains less than end index
		while(start<end)
		{
			//if start index value is less equal to pivot increment start
			while(a[start]<=pivot)
			{
				start++;
			}
			//if end index value is greater than pivot decrement end
			while(a[end]>pivot)
			{
				end--;
			}
			//if start is less than end swap start and end with each other
			if(start<end)
			{
				swap(a,start,end);
			}
			
		}
		
		
		//if start is > end swap lowerBound with end
		swap(a,lowerBound,end);
		return end;
		
		
	}
	
	// Simple swap function
	public void swap(int[] a, int s, int e) {
		int temp;
		temp = a[s];
		a[s] = a[e];
		a[e] = temp;
		
	}
}
