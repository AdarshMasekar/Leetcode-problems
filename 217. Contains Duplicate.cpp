class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
      
      //bruteforce approach 
       // int n=;
        // for(int i=0;i<nums.size();i++){
        //     n=n^nums[i];
        // }
        // if(n==0){
        //     return false;
        // }
        // return true ;
     
      // better approach
      return nums.size() > set<int>(nums.begin(),nums.end()).size();
    }
};
