package javaprogram;

public class FindingMinAndMaxElementInArray {

	public static void main(String[] args) {
		int a[]= {2,67,89,5,12,15};
        //declare max and  min variable and assign them value present at 0 index of array
		int max= a[0];
		int min =a[0];
		
		for(int i=0;i<a.length;i++)
		{
			// if any value is greater than max assign it to max
			if(max<a[i])
				max=a[i];
			// if any less is greater than min assign it to min
			if(min>a[i])
				min=a[i];
		}
		System.out.println("The max value in array is: "+ max);
		System.out.println("The min value in array is: "+ min);
	}

}
