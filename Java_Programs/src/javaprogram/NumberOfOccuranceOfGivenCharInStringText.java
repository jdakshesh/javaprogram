package javaprogram;

public class NumberOfOccuranceOfGivenCharInStringText {

	public static void main(String[] args) {
		String str = "Dakshesh Jain";
		char ch[] = str.toCharArray();
		int count = 0;
		for(int i=0;i<ch.length;i++)
		{
			if('D'==ch[i])
			{
				count++;
			}
		}
		System.out.println("occurance of character 'D' is: "+ count);
	}

}
