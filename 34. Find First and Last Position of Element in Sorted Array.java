class Solution {
   public int binarySearch(int[] arr, int target, boolean FirstIndex) {
		int ans = -1;
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == target) {
				ans = mid;
				if (FirstIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	public int[] searchRange(int[] nums, int target) {
		int[] ans = { -1, -1 };
		ans[0] = binarySearch(nums,target,true);
		ans[1] = binarySearch(nums,target,false);
        // System.gc();
		return ans;
	}
}
