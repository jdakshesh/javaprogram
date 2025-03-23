package javaprogram;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		MultiplicationTable multiTable = new MultiplicationTable();
		multiTable.multiTable();
		
	}
	
	public void multiTable()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scanner.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+ " x "+ i+" ="+ (i*num));
		}
		scanner.close();
	
	}

}
