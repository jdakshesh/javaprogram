package javaprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseTheArrayUsingCollections {

	public static void main(String[] args) {
		//Important: user Integer wrapper class instead of primitive data type int, as we need to convert array into list which is not possible with primitive data type
		Integer[] a = {1,2,3,4,5,6,7,8}; 
		List<Integer> list = Arrays.asList(a);//convert the array to array list.
		//now reverse the arraylist using built-in method of Collections and print it.
		Collections.reverse(list);
		System.out.println(list);

	}

}
