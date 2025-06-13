package datastructure;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int searchNumber = sc.nextInt();
		sc.close();
		int[] ar = { 1, 3, 5, 6, 9, 12, 14, 19, 21, 22, 23 };
		int low = 0;
		int high = ar.length - 1;
		int mid = 0;

		while (low <= high) {
			mid = (high + low) / 2;
			if (searchNumber == ar[mid]) {
				System.out.println("The given number is present at index:" + mid);
				break;
			} else if (searchNumber > ar[mid]) {
				low = mid + 1;

			} else if (searchNumber < ar[mid]) {
				high = mid - 1;
			}
		}

		if (low > high) {
			System.out.println("Given number does not exist in the array");
		}
	}

}
