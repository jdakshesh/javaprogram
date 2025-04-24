package javaprogram;

public class StringPalindrome {
	public static void main(String[] args) {
		StringPalindrome rs = new StringPalindrome();
		rs.stringPalindromeCheck();

	}

	public void stringPalindromeCheck() {
		String str = "MOM";
		String revStr = "";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			revStr = revStr + ch[i];
		}
		if(str.equals(revStr))
		System.out.println(str+ " is palindorme");
		
		else
			System.out.println(str+ " is not palindorme");
	}

}
