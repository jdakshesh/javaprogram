package javaprogram;

public class RightRotateStringByGivenPosistion {
	
	public static void main(String[] args) {
		String str = "arun";
		char[] c = str.toCharArray();
		int size = c.length;
		int position =3;
		for(int j=1;j<=position;j++) {
		char last = c[size - 1];
		for (int i = size - 1; i > 0; i--) {
			c[i] = c[i - 1];
		}
		c[0] = last;
		}
		StringBuffer sb = new StringBuffer();
		for (char ch : c) {
			sb.append(ch);
		}
		System.out.println(sb);
	}

}
