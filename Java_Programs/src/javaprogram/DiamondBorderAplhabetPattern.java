package javaprogram;

public class DiamondBorderAplhabetPattern {

	public static void main(String[] args) {
		int letter = 65;
		for(int i=0;i<5;i++) {
			
			for(int k=0;k<5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				//print output only when if j==0 to print first row and j==i  to print last row
				if(j==0||j==i) {
				System.out.print((char)(letter+i)+" ");
				}
				else
					System.out.print(" "+ " ");//add tow spaces for proper spaces
			}
			System.out.println();
		}
		
		for(int i=3;i>=0;i--) {
			
			for(int k=3-i;k>=0;k--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				if(j==0||j==i) {
				System.out.print(" "+(char)(letter+i));
				}
				else
					System.out.print(" "+ " ");//add tow spaces for proper spaces
			}
			System.out.println();
		}
		

	}

}
