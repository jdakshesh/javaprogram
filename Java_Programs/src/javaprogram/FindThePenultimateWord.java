package javaprogram;
// Penultimate Word is nothing but second last word of string
public class FindThePenultimateWord {

	public static void main(String[] args) {
		String str = "My name is dakshesh jain";
		String[] words = str.split(" ");
		//now make sure that string length should be greater than one in order to find Penultimate word
		if(words.length>1)
		{
			System.out.println("The Penultimate word in string is: "+ words[words.length-2]);
			
		}
		else
		{
			System.out.println("Given statement has less than 2 words");
		}

	}

}
