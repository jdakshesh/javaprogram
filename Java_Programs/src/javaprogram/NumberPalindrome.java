package javaprogram;

public class NumberPalindrome {
	
	public static void main(String[] args) {
		int orginalnumber =1221;
		int temp =orginalnumber;
		int revnumber = 0;
		int remainder;
		while(temp>0)
		{
			remainder =temp%10;
			revnumber = revnumber*10+remainder;
			temp =temp/10;
		}
		if(revnumber==orginalnumber)
		{
			System.out.println(orginalnumber+ " palindrome");
		}
		else
			System.out.println(orginalnumber+ " is not palindrome");
			
	}


}
