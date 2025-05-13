package javaprogram;

public class MultiplyCorrespondingElementsOfTwoGivenArray {

	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4,5};
		int [] b = {5, 4, 3, 2, 1};
		int size = a.length;
		
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]*b[i]+ " ");
		}

	}

}
