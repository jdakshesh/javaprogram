//check both arrays have same size they are not equal
//next we check if each and every elements of both array are equal
package javaprogram;

public class CompareTwoArrayWithoutInbuiltMethod {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 1, 2, 3, 5 };
		boolean flag = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					flag = false;
					break;
				}
			}
		} else {
			flag = false;

		}

		if (flag) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

}
