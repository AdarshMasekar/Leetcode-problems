
public class Solution {

    public static int[] getProductArrayExceptSelf(int[] arr) {
    	//Your code goes here
         int n = arr.length;
        int[] res = new int[n];

        // Calculate left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            res[i] = leftProduct;
            leftProduct *= arr[i];
        }

        // Calculate right products and update the result array
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        return res;
    }

}
