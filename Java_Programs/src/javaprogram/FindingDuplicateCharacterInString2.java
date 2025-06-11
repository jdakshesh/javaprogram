package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindingDuplicateCharacterInString2 {

	public static void main(String[] args) {
		//create scanner class object and provide System.in to the constructor
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		//use next() method of scanner class to provide string input
		String words = sc.nextLine();
		//create character array and store the characters of string in array
		char ch[]=words.toCharArray();
		// define empty map and create hashmap of <Character,Integer>, we are using hashmap as it does not allow duplicate key only duplicate value
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		//now create a for each loop and iterate through character array
		for(Character c: ch)
			//now check if hashmap key contains character of the string, if yes increase the value to 1 else enter the key and keep value is 1 
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
				
			}
			else
			{
				map.put(c, 1);
			}
		
		//once done define for each loop of the keyset and within for loop check if value is greater than 1, if yes print key and value
			
		}
		for(Character cr:map.keySet())
		{
			if(map.get(cr)>1)
			{
				System.out.println("The duplicate character is "+ cr+" and count is "+ map.get(cr));
			}
		}
			sc.close();
	}

}
