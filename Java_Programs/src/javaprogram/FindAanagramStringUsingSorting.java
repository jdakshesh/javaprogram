/*The given String is an Anagram of another String, if both Strings have same length and characters, despite of having
different order.
'cat' and 'actt' are not anagrams
'caat' and 'actt' are not anagrams
'BAT' and 'TAB' are anagrams
'Bat' and 'Tab' are anagrams
Few thing to understand Anagrams in a better way:
Number of characters in both words, after removing spaces should be same
The count of different characters present in first word, should match with the count of them in the second word
No need to be case sensitive*/

package javaprogram;

import java.util.Arrays;

import java.util.Scanner;

public class FindAanagramStringUsingSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String str1 = sc.nextLine().toLowerCase().replaceAll("\\s", "");
		System.out.println("Enter second String: ");
		String str2 = sc.nextLine().toLowerCase().replaceAll("\\s", "");
		
		if(isAnagram(str1,str2))
		{
			System.out.println("Given string "+str1+" and "+str2+" are Anagram");
			
		}
		else
		{

			System.out.println("Given string "+str1+" and "+str2+" are not Anagram");
		}
			sc.close();
		}
		public static boolean isAnagram(String str1, String str2) {
			char[] ch1 =str1.toCharArray();
			char[] ch2 =str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			return Arrays.equals(ch1, ch2);
		}
		
	}

    
