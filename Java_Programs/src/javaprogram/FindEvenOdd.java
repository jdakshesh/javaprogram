/*1. If modulus of number at the index i is zero than even else odd*/
public class FindEvenOdd {

	public static void main(String[] args) {
		
		FindEvenOdd FED= new FindEvenOdd();
		FED.FindEvenOddNumber ();

	}

	public void FindEvenOddNumber() {
	int a[] = {1,2,3,4,5,6,7,8,9,10,11};
	
	for(int i=1;i<=a.length-1;i++)
	{
		if (a[i]%2==0)
		{
			System.out.println(a[i] + " "+ "is even number");
		}
		
		else
			System.out.println(a[i] + " "+ "is even odd");
	}
	
	}

}
