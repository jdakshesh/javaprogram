package javaprogram;

public class ProgramToPrintLast3LettersOfString {

	public static void main(String[] args) {
		//Declare string
		String str = "My name is dakshesh jain";
		//convert string to char array
		char ch[] = str.toCharArray();
		//find the length of string which will be used to find last 3 letters
		int size = str.length();
		//create empty string to store last 3 letters
		String lastThreeLetters ="";
		//write a loop where int i will start from size-1 and will go till size-4
		for(int i=size-1;i >size-4;i--)
		{
			//now concatenate empty string  to the char present current index
			//Note: statement should be ch[i]+empty string else we will get reverse string
			lastThreeLetters = ch[i] + lastThreeLetters;
		}
		//print the update string
		System.out.println("The last 3 letters of a string are: "+ lastThreeLetters );

	}

}
