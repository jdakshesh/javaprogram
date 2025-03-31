package javaprogram;

import java.util.Scanner;

public class FindingIfCharIsVowel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter character");
		// next() keyword scans complete string so we find char at 0 index
		char ch = scanner.next().charAt(0);
		boolean isVowel = false; //defaulting to false
		switch (ch) {
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': 
		case 'A': 
		case 'E': 
		case 'I': 
		case 'O': 
		case 'U': isVowel = true;
		
			
		}
		if (isVowel)
		{
			System.out.println(ch+ " is vowel");
		
		}
		else 
		{
			System.out.println(ch+ " is constant");
		}
	}
	

}
