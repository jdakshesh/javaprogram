package javaprogram;

public class SumOfFirst100Num {

	public static void main(String[] args) {
		SumOfFirst100Num s = new SumOfFirst100Num();
		s.sumOfFirst100Number();

	}
	public void sumOfFirst100Number() 
	
	{
		int sum = 0;
		for(int i=1;i<=100;i++)
		{
			sum = sum+i;
		}
		System.out.println("Sum of first 100 number is: "+ sum);
	}

}
