// problem link: https://www.codingninjas.com/studio/problems/rotate-array_1230543?leftPanelTab=1
import java.util.ArrayList;

public class Solution {
	public static void rotate(ArrayList<Integer> arr,int start,int end){
		while(start<end){
			int temp = arr.get(start);
			arr.set(start,arr.get(end));
			arr.set(end,temp);
			start++;
			end--;
		}
	}
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
		if(arr.size() <=1 || k<=0){
			return arr;
		}

		k = k % arr.size();

		rotate(arr, 0,k-1);
		rotate(arr, k,arr.size()-1);
		rotate(arr, 0,arr.size()-1);
		return arr;
    }
}
