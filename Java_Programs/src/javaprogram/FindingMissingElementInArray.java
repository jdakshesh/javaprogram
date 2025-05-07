/* Solution approach
 We use the Sum Formula for the first n natural numbers:

Sum = n * (n + 1) / 2

For our case, since the numbers are from 1 to n+1, we compute:

Expected Sum = (n+1) * (n+2) / 2

Then subtract the actual sum of the array to find the missing number.*/
package javaprogram;

public class FindingMissingElementInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5 };
	    int missing = findMissingElement(arr);
	    System.out.println("The missing element in array is "+ missing);

	}
	public static int findMissingElement(int a[])
	{
		int n = a.length;
		
		// Step 1: Calculate expected sum of numbers from 1 to n+1
		int expectedSum = (n+1)*(n+2)/2;
		
		// Step 2: Calculate actual sum of elements in the array
		int actualSum = 0;
		for(int num: a)
		{
			actualSum +=num;
		}
		
		// Step 3: The difference is the missing number
		return expectedSum - actualSum;
		
	}

}
