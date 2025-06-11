package javaprogram;

public class FloydsTriangle {

	public static void main(String[] args) {
		// out for loop for number of rows
		
		int c=1;//variable to print patter
		for (int i = 1; i <= 5; i++) {
			//inner loop to print the pattern
			//for every iteration we want inner loop to iterate based on value of i
			//example: for first iteration i=1 so one time, for 2nd iteration i=2 so iterate inner loop 2 times
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();//we need this line so that every iteration of we move to next row
		}
		

	}

}
