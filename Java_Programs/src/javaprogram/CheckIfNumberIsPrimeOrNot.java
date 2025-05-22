package javaprogram;

public class CheckIfNumberIsPrimeOrNot {

	public static void main(String[] args) {
		// Prime number is number which is divisible by itself and 1 only and is >1.
		int number =3;
		boolean isPrime = true;
		if(number>1) {
		for(int i=2;i<number;i++) {
			{
				if(number%i==0) {
					isPrime = false;
				}
			}
			
		}
		}
		else {
			isPrime =false;
		}
		
		if(isPrime)
		{
			System.out.println(number+" is prime number");
		}
		else
			System.out.println(number+" is not a prime number");
	}

}
