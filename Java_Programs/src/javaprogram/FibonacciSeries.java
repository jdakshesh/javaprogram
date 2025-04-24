package javaprogram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int term = sc.nextInt();
		sc.close();
		int n1 =0;
		int n2 =1;
		int n3 =0;
		for(int i=0;i<term;i++)
		{
			
			System.out.print(n1 + " ");
			
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			
		}
		

	}

}
