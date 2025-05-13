package javaprogram;

public class ProgramToPrintFirstHalfOfStringUsingSubStringMethod {

	public static void main(String[] args) {
		String str = "Dakshesh";
		int length = str.length();
		System.out.println("The first half of the string is :"+ str.substring(0, length/2));
		//Note: if you want to print last half of the string then use str.substring(length/2)
		System.out.println("The last half of the string is :"+ str.substring(length/2));

	}

}
