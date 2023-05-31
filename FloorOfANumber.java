package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class FloorOfANumber {
	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 15, 16, 18 };
		System.out.println("array elements are : " + Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the target element: ");
		int target = sc.nextInt();
		System.out.println(floorOfNumber(arr, target));
	}

	public static int floorOfNumber(int[] nums, int target) {
		int start = 0, end = nums.length - 1, ans = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else {
				ans = mid;
				start = mid + 1;
			}
		}

		return ans;
	}
}
