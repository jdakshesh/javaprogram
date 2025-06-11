package javaprogram;

import java.util.Scanner;

public class ToFindIfGivenNumberIsPowerOf4 {
/*The program checks if a given number is a power of 4 by repeatedly dividing it by 4 and checking the remainder. If the number becomes 1 after successive divisions by 4, 
it is a power of 4; otherwise, it is not.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number the number :");
		int n = sc.nextInt();
		int number = n;
		sc.close();
		boolean isPowerOf4 = false;
		//Starts a while loop that runs as long as n is greater than 0.
		while(n>0)
		{
			//Calculates the remainder when n is divided by 4 and stores it in the variable reminder.
			int reminder =n%4;
			//Checks if the remainder is not 0. If true, it breaks out of the loop, as n is not divisible by 4.
			if(reminder!=0) {
				break;
			}
			n =n/4;
			//Checks if n equals 1. If true, it prints that the number is a power of 4, sets isPowerOf4 to true, and exits the loop.
			if(n==1)
			{
				System.out.println(number+" is power of 4");
				isPowerOf4=true;
				break;
				
			}
			
		}
		//  If isPowerOf4 is still false after the loop, it prints that the number is not a power of 4.
		if(!isPowerOf4)
		{
			System.out.println(number+" is not power of 4");
		}

	}

}
