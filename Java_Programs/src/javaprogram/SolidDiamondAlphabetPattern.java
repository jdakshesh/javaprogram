package javaprogram;

public class SolidDiamondAlphabetPattern {

	public static void main(String[] args) {
		int letter = 65;
		for(int i=0;i<5;i++) {
			
			for(int k=0;k<5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				
				System.out.print((char)(letter+i)+" ");
			}
			System.out.println();
		}
		
		for(int i=3;i>=0;i--) {
			
			for(int k=3-i;k>=0;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				
				System.out.print(" "+(char)(letter+i));
			}
			System.out.println();
		}

	}

}
