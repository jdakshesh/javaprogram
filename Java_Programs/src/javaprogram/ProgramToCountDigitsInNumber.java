package javaprogram;

import java.util.Scanner;

public class ProgramToCountDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		int digitCount = 0;
		sc.close();
		while(number>0)
		{
			digitCount++;
			number=number/10;
		}

		System.out.println("Count of digit in number is: "+ digitCount);
	}

}
