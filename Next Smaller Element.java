import java.util.*;
import java.io.*;


// question link in coding ninjas :  https://www.codingninjas.com/studio/problems/next-smaller-element_1112581?leftPanelTab=0


public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();
         for (int i = 0; i < arr.size() - 1; i++) {
            int currentSmall = arr.get(i);
            boolean isChanged = false;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < currentSmall) {
                    currentSmall = arr.get(j);
                    isChanged = true;
                    break;
                }
            }
            if (isChanged) {
                ans.add(i, currentSmall);
            } else {
                ans.add(i, -1);
            }
        }
        ans.add(-1);
        return ans;
    }
}
