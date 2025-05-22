package javaprogram;

public class LeftRotateStringBy1Position {

	public static void main(String[] args) {
		String str = "Dakshesh";
		char[] ca = str.toCharArray();
		char first = ca[0];
		int size = ca.length;
		for(int i=0;i<size-1;i++)
		{
			ca[i]=ca[i+1];
		}
		ca[size-1]=first;
		StringBuffer sb = new StringBuffer();
		for(char ch:ca)
		{
			sb.append(ch);
		}
		
		System.out.println(sb);
	}

}
