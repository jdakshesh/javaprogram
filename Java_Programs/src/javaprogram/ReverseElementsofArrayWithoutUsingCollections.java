/*Solution Approach
 1. We will swap the element at first and last index
 2. Similarly we will swap the element of 2nd index with second-last index*/
package javaprogram;

import java.util.Arrays;

public class ReverseElementsofArrayWithoutUsingCollections {

	public static void main(String[] args) {
		int a[] = {5,2,7,9,8,0};
		int start = 0;
		int last = a.length-1;
		int temp;
		while(start<last)
		{
			//swapping the elements using temp variable
			temp = a[start];
			a[start]=a[last];
			a[last]=temp;
			//now increment the start and decrement the last to swap second and second last element and so on
			start++;
			last--;
		}
		System.out.println(Arrays.toString(a));

	}

}
