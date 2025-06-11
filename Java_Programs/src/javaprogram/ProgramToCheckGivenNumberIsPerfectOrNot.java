//on adding all the divisor of number except itself and resultant of divisor is number itself is called perfect number
//Ex: divisor of 6 is 1,2,3 & 6, if we add all the divisor excluding 6 the resultant is 6
package javaprogram;

import java.util.Scanner;

public class ProgramToCheckGivenNumberIsPerfectOrNot {

	public static void main(String[] args) {
		System.out.println("Enter Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int sum = 0;
		for(int i=1;i<num;i++) {
			
			if(num%i==0)
			{
				sum = sum+i;
			}
			
		}
		if(num==sum) {
			System.out.println(num+ " is perfect number");
		}
		else
			System.out.println(num+ " is not a perfect number");

	}

}
