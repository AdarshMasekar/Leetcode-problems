import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int start = m + 1, end = arr.size()-1;

        while(start < end){
            Collections.swap(arr,start,end);
            start++;
            end--;
        }
    }
}
