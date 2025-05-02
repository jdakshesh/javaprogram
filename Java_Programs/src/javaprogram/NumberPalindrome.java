package javaprogram;

import java.util.Scanner;

public class NumberPalindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int OriginalNumber = number;
		int revNumber = 0;
		sc.close();
		while(number>0)
		{
			int remainder = number%10;
			revNumber = revNumber*10 + remainder;
			number = number/10;
			
		}
		if(revNumber==OriginalNumber)
			System.out.println(OriginalNumber+" is a palindrome number");
		else
			System.out.println(OriginalNumber+" is not a palindrome number");
	}


}
