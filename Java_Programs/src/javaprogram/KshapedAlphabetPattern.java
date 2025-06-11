package javaprogram;

public class KshapedAlphabetPattern {

	public static void main(String[] args) {
		int letter = 65; // ASCII value for 'A'

		for (int k = 5; k > 0; k--) { // Loop for the number of rows
			for (int j = 0; j <k; j++) { // Loop for spaces before letters
				System.out.print((char) (letter + j) + " ");
			}

			System.out.println(); // Move to the next line after each row
		}
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print((char) (letter + j) + " "); // Print letters starting from 'A'
			}

			System.out.println(); // Move to the next line after each row
		}
		System.out.println();
	}

}
