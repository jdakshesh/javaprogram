package javaprogram;

public class StringPalindrome {
	public static void main(String[] args) {
		StringPalindrome rs = new StringPalindrome();
		rs.stringPalindromeCheck();

	}

	public void stringPalindromeCheck() {
		String str ="MOON";
		String revStr = "";
		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			revStr = revStr+ch[i];
		}
		
		if(revStr.equals(str))
			System.out.println(str+" is palindrome");
		else
			System.out.println(str+" is not palindrome");
	}

}
