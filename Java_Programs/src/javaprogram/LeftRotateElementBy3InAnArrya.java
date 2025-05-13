package javaprogram;

import java.util.Arrays;

public class LeftRotateElementBy3InAnArrya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = { 1, 2, 3, 4, 5 };
		int size = a.length;
		int positions = 3;
		for(int j=1;j<=positions;j++) {
		int first = a[0];
		for(int i=0;i<size-1;i++)
		{
			a[i]=a[i+1];
		}
		
		a[size-1]=first;
		}
		System.out.println(Arrays.toString(a));

	}

}
