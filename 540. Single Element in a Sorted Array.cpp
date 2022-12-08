// 540. Single Element in a Sorted Array


class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {
       int left = 0 , right = nums.size() - 1;

       while(left < right){
           int mid = left + (right - left) / 2 ;
           if(mid % 2 == 0 && nums[mid] == nums[mid+1] || mid % 2 && nums[mid] == nums[mid - 1]){
               left = mid + 1;
           }
           else{
               right = mid;
           }
       }
       return nums[left];
    }
};
