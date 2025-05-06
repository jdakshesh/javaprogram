package javaprogram;

import java.util.Arrays;

public class CompareArrayUsingInBuiltMethod {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		if(Arrays.equals(a, b))
		{
			System.out.println("Both arrays are equal");
		}
		else
		{
			System.out.println("Both arrays are not equal");
		}
	}

}
