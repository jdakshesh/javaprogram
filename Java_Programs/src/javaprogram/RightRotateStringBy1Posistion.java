package javaprogram;

public class RightRotateStringBy1Posistion {

	public static void main(String[] args) {
		String str = "arun";
		char[] c = str.toCharArray();
		int size = c.length;
		char last = c[size - 1];
		for (int i = size - 1; i > 0; i--) {
			c[i] = c[i - 1];
		}
		c[0] = last;

		StringBuffer sb = new StringBuffer();
		for (char ch : c) {
			sb.append(ch);
		}
		System.out.println(sb);
	}
}