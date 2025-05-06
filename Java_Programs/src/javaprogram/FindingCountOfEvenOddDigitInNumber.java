package javaprogram;

import java.util.Scanner;

public class FindingCountOfEvenOddDigitInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		int evencount=0;
		int oddcount=0;
		while(number>0)
		{
			int remainder = number%10;
			if(remainder%2==0) {
				evencount++;
			}
			else
			{
				oddcount++;
			}
			number =number/10;
		}
		System.out.println("The count of even digit is: " +evencount);
		System.out.println("The count of even digit is: " +oddcount);
		sc.close();
	}

}
