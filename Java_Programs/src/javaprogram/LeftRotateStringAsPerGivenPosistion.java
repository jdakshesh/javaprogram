package javaprogram;

public class LeftRotateStringAsPerGivenPosistion {

	public static void main(String[] args) {
		String str = "arun";
		char[] ca = str.toCharArray();
		int size = ca.length;
		int position = 3;
		for(int i=1;i<=position;i++)
		{
			char first = ca[0];
			for(int j=0;j<size-1;j++)
			{
				ca[j]=ca[j+1];
			}
			ca[size-1]=first;
			
		}
		
		StringBuffer sb = new StringBuffer();
		for(char ch: ca)
		{
			sb.append(ch);
		}
		
		System.out.println(sb);

	}

}
