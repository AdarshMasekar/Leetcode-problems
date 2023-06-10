class Solution {
    public void moveZeroes(int[] nums) {
       
       int temp = 0, start = 0,end = nums.length - 1;
       while( start <= end){
           if(nums[temp] == 0 && nums[start] == 0){
               start++;
           }
           else if(nums[temp] == 0 && nums[start] != 0){
               int t = nums[temp];
               nums[temp] = nums[start];
               nums[start] = t;
               start++;
               temp++;
           }
           else{
               temp++;
               start++;
           }
       }
    }
}
