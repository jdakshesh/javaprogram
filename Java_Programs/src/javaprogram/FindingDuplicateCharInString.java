package javaprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindingDuplicateCharInString {

	public static void main(String[] args) {
		FindingDuplicateCharInString findDuplicateString = new FindingDuplicateCharInString();
		findDuplicateString.duplicateChar();

	}

	public void duplicateChar() {

		System.out.println("Enter the word:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		char[] ch = str.toCharArray();
		Map<Character, Integer> hash = new HashMap<Character, Integer>();
		for (Character c : ch) {
			if (hash.containsKey(c)) {
				hash.put(c, hash.get(c) + 1);
			} else {
				hash.put(c, 1);
			}
		
	    }
		for(Character c :hash.keySet())
		{
			if(hash.get(c)>1)
			{
				System.out.println(c+ ": "+hash.get(c));
			}
		}
	}

}
