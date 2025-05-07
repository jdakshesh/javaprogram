package javaprogram;

public class ReverseEachWordOfStringText {

	public static void main(String[] args) {
		String str = "Mr Dakshesh Jain";
		String Words[]= str.split(" ");
		String reversedString = "";
		for(String word: Words)
		{
			String reverseWord = "";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseWord = reverseWord + word.charAt(i);
			}
			
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(reversedString);
	}

}
