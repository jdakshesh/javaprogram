package datastructure;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = {35,1,5,16,3,9,12};
		//define variable to hold current value of current index of outer loop
		int current;
		//define variable to hold the index value of outer loop so that it does not changes when outer loop value is incremented
		int j;
		//outer loop should start at 1 as we are comparing current value with previous one
		for(int i=1;i<a.length-1;i++)
		{
			//assign the a[i] value to current and assign j= index i
			current = a[i];
			j=i;
			while(j>0&&a[j-1]>current)
			{
				a[j]=a[j-1];//if above condition is met assign a[j] value to a[j-1]
				j--;// Decrement the value of j to compare current value to previous value
			}
			
			a[j]=current;//assign the current value to j
		}
		System.out.println(Arrays.toString(a));
	}

}
