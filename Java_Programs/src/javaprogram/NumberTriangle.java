package javaprogram;

public class NumberTriangle {

	public static void main(String[] args) {
		//outer loop for number of rows
		for(int i=0;i<5;i++) {
			//inner loop to print the triangle
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+ " ");
				
			}
			System.out.println();
		}
		
	}

}
