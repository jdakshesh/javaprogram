/*compare elements of neighboring index and add to array if elements are not duplicate
 and for last element add to array blindly so that it is not missed if element just before
 last index are duplicate of last element*/
package javaprogram;

public class DeleteDuplicateFromSortedArrayUsingIndex {

	public static void main(String[] args) {
		int[] a= {3,4,4,5,5,5,6,7,9,9};
		int j=0;
		//for loop to compare the elements and remove duplicate
		for(int i=0;i<a.length-1;i++)
		{
		  
			if(a[i]!=a[i+1]) {
				a[j]=a[i];
				j++;
		  }
		//adding last element to array
		 
		}
		 a[j]=a[a.length-1];
	
		/*now array still have repeated element, so we use j 
	value and write a for loop to print value unto index value j*/
	
		for(int k=0;k<=j;k++)
		{
			System.out.print(a[k]+ " ");
		}
	
}
}
