/*Logic:
 1. Declare one string
 2. Change the string to lower case.
 3. Split the string from by spaces and store it in array
 4. Find length of array
 5. Write outer for loop and declare count = 1 within it
 6. In the inner for loop compare the current string with previous string
 7. If count is > 1 than print the duplicate word*/

package javaprogram;

public class FindDuplicateWordInStringTest {

	public static void main(String[] args) {
		String str = "Google is the most popular search engine in the world. Bing engine comes at number two also popular";
		str = str.toLowerCase();
		String Words[]= str.split(" ");
		int length = Words.length;
		for(int i=0;i<length;i++)
		{
			int count = 1;
			for(int j = i+1; j<length;j++)// j = i+1 as we want to compare current string with previous i.e word[0] is compared with word[1]
			{
				if(Words[i].equals(Words[j]))
				{
					count++; //if duplicate word increase the count
					Words[j]="0";/* Setting words[j]="0" to avoid 
                    visited words */

				}
			}
			if(Words[i]!="0"&&count>1)
			{
				System.out.print(" "+Words[i]+" ");
			}
			
		}
		
	}

}
