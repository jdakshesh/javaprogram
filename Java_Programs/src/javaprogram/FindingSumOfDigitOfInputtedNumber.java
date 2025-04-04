package javaprogram;

import java.util.Scanner;

public class FindingSumOfDigitOfInputtedNumber {

	public static void main(String[] args) {
		FindingSumOfDigitOfInputtedNumber sum = new FindingSumOfDigitOfInputtedNumber();
		sum.inputtedNumber();
		

	}
	public void inputtedNumber()
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int sum = 0;
		while(number>0)
		{
			sum = sum + number%10;
			number = number/10;
			
		}
		System.out.println("Sum of digit is: "+sum);
	}

}