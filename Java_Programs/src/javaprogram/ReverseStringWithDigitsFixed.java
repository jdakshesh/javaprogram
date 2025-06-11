package javaprogram;

/*Approach:
1.Convert the input string to a character array.

2.Use two pointers (left and right) to scan from both ends.

3.Skip digits – they must stay in place.

4.Swap characters only if both are not digits.

5.Continue until the two pointers meet.*/

public class ReverseStringWithDigitsFixed {

	
		public static String reverseLettersKeepDigits(String input) {
	        char[] chars = input.toCharArray();
	        int left = 0;
	        int right = chars.length - 1;

	        while (left < right) {
	            // Skip digits from the left
	            if (Character.isDigit(chars[left])) {
	                left++;
	            }
	            // Skip digits from the right
	            else if (Character.isDigit(chars[right])) {
	                right--;
	            }
	            // Both are letters, so swap
	            else {
	                char temp = chars[left];
	                chars[left] = chars[right];
	                chars[right] = temp;
	                left++;
	                right--;
	            }
	        }

	        return new String(chars);
	    }

	    public static void main(String[] args) {
	        String input = "a1b2c3d";
	        String result = reverseLettersKeepDigits(input);
	        System.out.println("Reversed: " + result);  // Output: d1c2b3a
	    }

	}


