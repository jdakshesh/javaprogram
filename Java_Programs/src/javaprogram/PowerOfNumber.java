/*as initalnumber value is 
		   constant and number value keeps updating 
		   we will get correct power, if we use number * number we will get incorrect value. 
		   For expample if we number value is 5, in first iteration number * number = 25, 
		   now number value is 25 in next iteration number * number will be 25*25 which will give 625 which is incorrect
		   , as initalNumber is constant we will get correct value.*/
package javaprogram;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		PowerOfNumber pw = new PowerOfNumber();
		pw.findingPowerOfNumber();
	}
   public void findingPowerOfNumber(){
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number");
	   int number = sc.nextInt();
	   int intialNumber = number; // to hold the inital value of number
	   System.out.println("Enter the power");
	   int power = sc.nextInt();
	   sc.close();
	   for(int i=1;i<power; i++)
	   {
		  number = intialNumber*number;
	   }
	   System.out.println(intialNumber +" to power " + power +" is:" +number);
	   
   }
}
