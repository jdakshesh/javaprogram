package javaprogram;

public class ReverseTheString {

	public static void main(String[] args) {
		ReverseTheString rs = new ReverseTheString();
		rs.reverseString();

	}

	public void reverseString() {
		String str = "Alexander";
		String revStr = "";
		char[] ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			revStr = revStr + ch[i];
		}
		System.out.println(revStr);
	}
}
