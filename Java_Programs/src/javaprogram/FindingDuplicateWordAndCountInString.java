package javaprogram;

import java.util.HashMap;
import java.util.Map;

public class FindingDuplicateWordAndCountInString {

	public static void main(String[] args) {
		String str = "This is a test, This test is only a test";
		String[] words = str.toLowerCase().trim().split(" ");;
		HashMap<String,Integer> duplicateWord = new HashMap<String,Integer>();
		int count = 1;
		for(String word: words)
		{
			if(duplicateWord.containsKey(word))
			{
				duplicateWord.put(word,duplicateWord.get(word)+1 );
			}
			
			else
				duplicateWord.put(word, 1);
		}
		System.out.println("The duplicate strings are: ");
		
		for(Map.Entry<String,Integer>a:duplicateWord.entrySet())
		{
			int val =(Integer)a.getValue();
			if(val>1)
			{
				System.out.println("Duplicate word and cout is: "+a);
			}
		}
		

	}
	

}
