package javaprogram;

public class StarPyramidPattern {

	public static void main(String[] args) {
		//out loop to define number of row
		for(int i=0;i<5;i++) {
		//inner loop for number of spaces needed
		//in first row we need 5 spaces for (5-i) i.e (5-0)=5
		//in second row we need 4 spaces so (5-1)=4
			for(int j=0;j<5-i;j++)
			{
				System.out.print(" ");
			}
			//this inner loop is to print * with spaces in between
			//in first loop i=0, k=0 so only one iteration allowed
			//in second loop i=1, k =0 and 1 so two iterations
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			//in order to move to next line type below statement
			System.out.println();
		}
		
	}

}
