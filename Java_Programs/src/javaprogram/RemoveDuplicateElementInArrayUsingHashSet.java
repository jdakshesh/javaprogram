package javaprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementInArrayUsingHashSet {

	public static void main(String[] args) {
		int a[]= {5,3,4,5,5,5,4,9,7,6,9};
		Set<Integer> set = new HashSet<Integer>();//HashSet does not accept duplicate
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		/*convert set to array using toArray method, however toArray return
		 type is object, so we need to convert it to integer type by creating integer object as show-cased in below
		 code line*/
		
		Integer b[] = set.toArray(new Integer[set.size()]);//we are using Integer class here
		//to print array convert it to string
		System.out.println(Arrays.toString(b));
	}

}
