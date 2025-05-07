package javaprogram;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		String str = "This is a program to find duplicate words in a string,again! a program" ;
		int in = countWordUsingSplit(str);
		System.out.println(in);
	}
	public static int countWordUsingSplit(String input)
	{
		// if loop make sure that null and empty string are handled and return 0
		if(input == null|| input.isEmpty())
		{
			return 0;
		}
		else
		{
			String[] words = input.split("\\s+"); // split the string at whitespace and storing it in String array
		return words.length; //find the length of array which is the number of words in array
		}

	}

}
