package javaprogram;

public class CaptilizeFirstCharacterOfString {

	public static void main(String[] args) {
		//define string
		String str = "My name is dakshesh jain";
		
		//split the string at space and store it into string array
		String words[] = str.split(" ");
		
		//create empty string to hold the updated string
		String finalString = "";
		
		//define for each loop and store character of array element into character array
		for(String word:words) {
			//store first element of char array in a variable 
			char ch[] = word.toCharArray();
			//convert this variable to string and change it to upper case
			char ca = ch[0];
			String finalChar = String.valueOf(ca).toUpperCase();
			String captilizedChar = finalChar;
			for(int i=1;i<ch.length;i++)
			{
				captilizedChar = captilizedChar + ch[i];
			}
			finalString = finalString + captilizedChar + " ";
		}
			//store the updated string to another string
		
		System.out.println(finalString);
		}
		
				
}
	


