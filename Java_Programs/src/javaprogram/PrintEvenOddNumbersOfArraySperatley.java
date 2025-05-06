package javaprogram;

public class PrintEvenOddNumbersOfArraySperatley {

	public static void main(String[] args) {
		int a[]= {6,1,2,7,9,10};
		System.out.println("Below are the even number in array:");
		for(int ar:a)
		{
			if(ar%2==0)
			{
				System.out.print(ar+ " ");
			}
			
		}
		System.out.println();
		System.out.println("Below are the odd number in array:");
		for(int ar:a)
		{
			if(ar%2!=0)
			{
				System.out.print(ar+ " ");
			}
			
		}
	}

}
