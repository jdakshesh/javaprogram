package javaprogram;

import java.util.Arrays;

public class MergeTwoSortedArrayIntoThirdSortedArray {

	public static void main(String[] args) {
		/* Things to keep in mind while merging two arrays in Third array
		1. Determine the Size: Calculate the size of the third array, which will be the sum of the sizes of the two input arrays.
	2. Compare Elements: Start comparing the elements of the two arrays from the beginning. Add the smaller element to the third array.
	3. Move Indexes: After adding an element to the third array, move the index forward for the array from which the element was taken, as well as for the third array.
	4. Handle Remaining Elements: If one of the arrays is fully processed, add all the remaining elements from the other array to the third array.

This ensures that the third array is sorted as both input arrays are already sorted.
		 */ 
         int [] a = {1,2,3};
         int [] b = {2,4,5,6};
         int aSize = a.length;
         int bSize = b.length;
         // logic to implement point
         int [] c = new int[aSize+ bSize];
         //logic to implement point 2 and 3
         //i,j and k will be used to move the index
         int i=0;
         int j=0;
         int k=0;
         while(i<aSize && j<bSize){
        	 //comparing array and if a[i] is less than b[i] add the element at a[i] into resultant array     	
        	 if(a[i]<=b[j])
        	 {
        		 c[k]=a[i];
        		 //move the index
        		 i++;
        		 k++;
        	 }else
        	 {
        		 c[k]=b[j];
        		 j++;
        		 k++;
        	 }
         
         }
         
         //logic to implement point 4, we will compare current value of i & j with array size and if it is less than array size add the value current element of a or b to c
         while(i<aSize)
         {
        	 c[k]=a[i];
        	 i++;
        	 k++;
         }
         while(j<bSize)
         {
        	 c[k]=b[j];
        	 j++;
        	 k++;
         }
         
         System.out.println(Arrays.toString(c));
	}

}
