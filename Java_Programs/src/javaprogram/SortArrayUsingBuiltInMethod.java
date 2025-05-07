package javaprogram;

import java.util.Arrays;

public class SortArrayUsingBuiltInMethod {

	public static void main(String[] args) {
		int a[] = {3,6,9,6,7,10,15,5,2};
		System.out.println(Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}

}
