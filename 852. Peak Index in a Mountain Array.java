class Solution {
public static int peakIndexInMountainArray(int[] arr) {
		int start =0,end=arr.length-1;
		while(start<end) {
			int mid = start+(end-start)/2;
			if(mid == 0) {
				return 0;
			}
			if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]) {
				start = mid + 1;
			}
			else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]) {
				end = mid;
			}
			else {
				return mid;
			}
		}
	        return arr.length-1;
	}}
