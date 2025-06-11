package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindingDuplicateCharacterInStringFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word:");
		String words =sc.nextLine();
		words = words.toLowerCase().trim().replaceAll(" ", "");
		char[] charOfArray = words.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch: charOfArray)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		
			
		}
		for(Character c: map.keySet())
		{
			if(map.get(c)>1)
			{
				System.out.println("The duplicate character is "+ c + " and count is "+map.get(c) );
			}
		}
		sc.close();
	}

}
