//A LinkedHashSet in Java is a class that extends HashSet and implements the Set interface. It stores unique elements while maintaining the order in which they were inserted. This is achieved by using a combination of a hash table for efficient element lookup and a doubly-linked list to track the insertion order.	
//StringBuffer in Java represents a mutable sequence of characters. Unlike the String class, which is immutable, StringBuffer allows modifications to its content without creating new objects. It is found in the java.lang package and is designed for scenarios where frequent string manipulation is required. 

package javaprogram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {
		
		String str ="coconut";
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		StringBuffer sb = new StringBuffer();
		for(Character c: set)
		{
			sb.append(c);
		}
		
		System.out.println(sb);
	}
}
