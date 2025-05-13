package javaprogram;

public class FindingGreatestCommonDivisorOfTwoNumber {

	public static void main(String[] args) {
		int FN =25;
		int SN =125;
		int gcd = 0; //variable to store greatest common divisor
		//write outer to divide the FN and SN from
		for(int i=1;i<=FN && i<=SN;i++)
		{
			//now check if both number is divisible by the number if yes update the value of gcd variable with number
			{
				if(FN%i==0 && SN%i==0)
				{
					gcd = i;
				}
				
			}
			
		}
		System.out.println("The greatest common divisor of given numbers is: "+ gcd);
	}

}
