import java.util.ArrayList;
public class Solution {

    public static int findPeak(ArrayList<Integer> arr){
        int start = 0, end = arr.size()-1;
        while(start < end){
            int mid = start + (end - start)/2;

            if(arr.get(mid) > arr.get(start)){
                start = mid; 
            }
            else{
                end = mid ;
            }
        }
        return start;
    }

    public static int binraySearch(ArrayList<Integer> arr,int start,int end, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr.get(mid) == target){
                return mid;
            }
            else if(arr.get(mid) > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int search(ArrayList<Integer> arr, int n, int k) {
        
        int pivot = findPeak(arr);
        // System.out.println(pivot);
        int firstHalf = binraySearch(arr,0,pivot,k);
        if(firstHalf != -1){
            return firstHalf;
        }
        else{
            return binraySearch(arr,pivot+1,n-1,k);
        }
    }
}
