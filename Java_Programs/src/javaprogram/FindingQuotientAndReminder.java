package javaprogram;

import java.util.Scanner;

public class FindingQuotientAndReminder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the divisor");
		int divisor =  scanner.nextInt();
		System.out.println("Enter the dividend");
		int dividend =  scanner.nextInt();
		//find Quotient
		System.out.println("Quotient is: " + dividend/divisor);
		//find Reminder
		System.out.println("Reminder is: " + dividend%divisor);
		scanner.close();
	}

}
