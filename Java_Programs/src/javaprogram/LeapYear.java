package javaprogram;
/*A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
A leap year (except a century year) can be identified if it is exactly divisible by 4.
A century year should be divisible by 4 and 100 both.
A non-century year should be divisible only by 4.*/

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		LeapYear leapYear = new LeapYear();
		leapYear.leapYearCal();

	}

	public void leapYearCal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = scanner.nextInt();
		

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is leap year ");

		}

		else {
			System.out.println(year + " is not leap year ");

		}

		scanner.close();
	}

}
