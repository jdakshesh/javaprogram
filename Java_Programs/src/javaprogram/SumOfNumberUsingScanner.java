/*1. Create object for scanner class
  2. use the "nextInt" built in method of scanner class
  3. close the scanner class using "close" inbuilt method
  4. Find the sum and print 
  5. While using scanner class we need to pass System.in parameter to scanner class constructor*/
package javaprogram;

import java.util.Scanner;
public class SumOfNumberUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfNumberUsingScanner sumOfNumber = new SumOfNumberUsingScanner();
		sumOfNumber.inputNumber();



}
	public void inputNumber()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Enter first number:");
		int secondNumber = scanner.nextInt();
		scanner.close();
		System.out.println("Sum of "+ firstNumber +" and " +secondNumber+ " is:" + (firstNumber + secondNumber) );
	}

}
