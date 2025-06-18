package datastructure;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any number for searching:");

		int num = scanner.nextInt();

		scanner.close();

		int[] a = { 55, 2, 9, 3, 5, 7, 99, 24, 36, 49, 86 };

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				
				System.out.println("the given number is present at index: "+i);
				count++;
				break;
			}
			
			

		}
		if(count==0)
		{
			System.out.println("the given number is not present in the array");
		}

	}

}
