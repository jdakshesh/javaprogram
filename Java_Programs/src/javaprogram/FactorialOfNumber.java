package javaprogram;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int number = scanner.nextInt();
		int fact = factorial(number);
		System.out.println("Factorial of "+ number+ " is: "+fact);
		scanner.close();
		}

	public static int factorial(int n) 
	{
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
	}
}
