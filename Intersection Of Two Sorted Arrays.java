import java.util.* ;

import java.io.*; 

public class Solution

{

    public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)

    {

        // Write Your Code Here.

        ArrayList<Integer > ans = new ArrayList<>();

 

        int j =0,i = 0;

 

        while(i < n  && j < m)

        {

 

              if(arr1.get(i) < arr2.get(j)){

                   i++;

              }

              else if (arr1.get(i) > arr2.get(j) ){

                  j++;

              }

             else

              {

                  ans.add(arr1.get(i));

                  i++; j++;

                  

              }

        }

 

        

        return ans;

    }

}

 

