package javaprogram;

import java.util.Scanner;

public class ProgramToFindElementIsPresentInArray {

	public static void main(String[] args) {
		int a[] = {3,6,9,6,7,10,15,5,2};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to search in array:");
		int searchNumber = sc.nextInt();
		boolean flag = false;
		for(int i=0;i<a.length;i++)
		{
			if(searchNumber==a[i])
			{
				flag =true;
				System.out.println(searchNumber+" is present in array at index " + i);
				break;
			}
			
		}
		if(!flag)
		{
			System.out.println(searchNumber+" is present not in the array");
			
		}
		
	}

}
