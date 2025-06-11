package javaprogram;

public class RightAlphabetTriangle {

	public static void main(String[] args) {
		int letter = 65; // ASCII value for 'A'
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<=i;j++)
			{
			System.out.print((char)(letter + j) + " ");	// Print letters starting from 'A'
			}
			
			System.out.println(); // Move to the next line after each row
		}
		
		}
		

	}

