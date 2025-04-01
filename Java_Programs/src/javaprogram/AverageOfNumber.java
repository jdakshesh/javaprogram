package javaprogram;

public class AverageOfNumber {

	public static void main(String[] args) {
		
		int a[]= {0,6,9,2,7};
	     
		int total = 0 ;
		for(int i=0;i<a.length;i++)
		{
			total = total +a[i];
		}
		
		System.out.println("Avg of number is: "+ total/(float)a.length);

	}

}
