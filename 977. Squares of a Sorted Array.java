class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int start = 0, end = length - 1, i = length - 1;
        int[] ans = new int[length];

        while(start <= end){
            int leftSquare = nums[start] * nums[start];
            int rightSquare = nums[end] * nums[end];

            if(leftSquare > rightSquare){
                ans[i] = leftSquare;
                start++;
            }
            else{
                ans[i] = rightSquare;
                end--;
            }
            i--;
        }
        return ans;
    }
}
