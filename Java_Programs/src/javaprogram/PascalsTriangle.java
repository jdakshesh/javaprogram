/*Pascal's Triangle is a triangular array of numbers where each number 
is the sum of the two numbers directly above it. It starts with a single
 1 at the top, and each subsequent row contains numbers formed 
 by adding adjacent numbers from the row above. The edges 
 of the triangle are always 1.*/
	
//Every row in pascal's triangle starts and ends with 1.
/*Approach:
 1. Define the number of rows you want to print.
 2. Find the number of spaces needed in each row.
 3. Find how many numbers to print in each row.
 2. Use a nested loop to iterate through each row and column.
 3. For each row, calculate the value at each position using the formula:
	C(n, k) = n! / (k! * (n - k)!)
	where n is the row number and k is the position in that row.
 */
package javaprogram;

public class PascalsTriangle {

	public static void main(String[] args) {
		// outer loop for number of rows
		for(int i=0;i<=5;i++)
		{
			// inner loop for spaces
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			
			//declare variable to store value as 1 as we want to start each row with 1
			int number = 1;
			//inner loop for printing numbers
			{
				for(int k=0;k<=i;k++)
				{
					System.out.print(number + " ");
					//calculate the value for the next number in the row
					number = number * (i - k) / (k + 1);
				}
			}
			System.out.println(); // move to the next line after each row
		}

	}

}
