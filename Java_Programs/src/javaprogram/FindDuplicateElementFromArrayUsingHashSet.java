package javaprogram;

import java.util.HashSet;

public class FindDuplicateElementFromArrayUsingHashSet {

	public static void main(String[] args) {
		int a[]= {3,4,5,3,6,4};
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hset.add(a[i])==false)
			{
				System.out.println(a[i]+" is duplicate element in array ");
			}
		}
	}

}
