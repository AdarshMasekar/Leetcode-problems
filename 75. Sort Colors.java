class Solution {
    public void sortColors(int[] nums) {
        int start = 0, mid = 0, end = nums.length-1;

        while(mid <= end){
            if(nums[mid] == 0){
                // swap(nums[mid],nums[start]);
                int temp = nums[mid];
                nums[mid] = nums[start];
                nums[start] = temp;
                mid++;
                start++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                // swap(nums[mid],nums[end]);
                int temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
            }
        }
    }
}
