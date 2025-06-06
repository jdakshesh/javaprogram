/*An Armstrong number is a number that is equal to the sum of its digits 
 each raised to the power of the number of digits. 
 For example, 153 is an Armstrong number because 1³ + 5³ + 3³ = 153. */
package javaprogram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;

        // Count the number of digits
        int n = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();

	}

}
