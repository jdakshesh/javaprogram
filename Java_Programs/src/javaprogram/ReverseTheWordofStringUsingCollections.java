package javaprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseTheWordofStringUsingCollections {

	public static void main(String[] args) {
		String str = "This is the statement one";
		//split the string at spaces and add it to array
		String[] words = str.split(" ");
		//convert the array to list
		List<String> list = Arrays.asList(words);
		//using collections reverse the list
		Collections.reverse(list);
		
		for(String word: list)
		{
			System.out.print(word+" ");
		}
	}

}
