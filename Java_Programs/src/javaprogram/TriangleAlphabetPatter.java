package javaprogram;

public class TriangleAlphabetPatter {

	public static void main(String[] args) {
		int letter = 65; // ASCII value for 'A'
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print((char)(letter+k)+" ");
			}
			System.out.println();
		}
	

	}

}
