//In bubble sort number of phases required to do sorting is number of element in array-1
//for ex: if array has 7 elements we need 6 phases to complete the sorting
package datastructure;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {35,1,5,16,3,9,12};
		int temp;
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));

	}

}
