package javaprogram;

public class FactorNumberAndCountOfFactor {

	public static void main(String[] args) {
		int number = 16;
		int count = 0;
		System.out.println("The factor of number are: ");
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.print(i +" " );
				count++;
			}
		}
		System.out.println();
		System.out.println("The count of factor of number is: "+ count);
	}

}
