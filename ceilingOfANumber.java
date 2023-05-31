package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingofANumber {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 15, 16, 18 };
		System.out.println("array elements are : " + Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the target element: ");
		int target = sc.nextInt();
		System.out.println(CeilingofANumber(arr, target));
	}

	public static int CeilingofANumber(int[] arr, int target) {

		int start = 0, end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				if (mid != arr.length - 1) {
					return arr[mid + 1];
				} else {
					return -2;
				}
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
