package javaprogram;

import java.util.Scanner;

public class SumOfDigitsInOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		sc.close();
		int sumOfDigits=0;
		while(number>0)
		{
			int remainder = number%10;
			sumOfDigits += remainder;
			number = number/10;
			
		}
		System.out.println("The sum of of digits is: "+ sumOfDigits);

	}

}
