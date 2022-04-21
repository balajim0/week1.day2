package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	// Sort the array

	// loop through the array (start i from arr[0] till the length of the array)

	// check if the iterator variable is not equal to the array values respectively

	// print the number arr[i+1]-

	// once printed break the iteration

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		int length = arr.length;
		for (int i = arr[0]; i < length; i++) {
			if (i != arr[i - 1]) {
				System.out.println(i);
				break;
			}
		}

	}
}
