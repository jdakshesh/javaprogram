package javaprogram;

import java.util.Scanner;

public class FindFirstOccuranceOfElementInArrayWithoutUsingAlogrithim {

	public static void main(String[] args) {
		int a[]= {1,2,5,5,6,7,5,8};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		sc.close();
		 boolean isFound = false;
		for(int i=0;i<a.length-1;i++)
		{
			if(number == a[i])
			{
				System.out.println("The first occurance of number "+ number+ " is at index: "+ i);
				isFound =true;
				break;
			}
			
				
		}
		if(!isFound)
			System.out.println(number+ " does not exist in the array");

	}

}
