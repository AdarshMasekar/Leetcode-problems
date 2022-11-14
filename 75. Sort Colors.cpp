class Solution {
public:
    void sortColors(vector<int>& nums) {

        // best appraoch 

        int low=0,mid=0,high=nums.size()-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums[low++],nums[mid++]);
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums[mid],nums[high]);
                high--;
            }
        }



        // //  better appproach 
        // int one=0,two=0,zero=0;
        // int n=nums.size()-1;
        // for(int i=0;i<nums.size();i++){
        //     if(nums[i]==0){
        //         zero+=1;
        //     }
        //     else if(nums[i]==1){
        //         one+=1;
        //     }
        //     else{
        //         two+=1;
        //     }
                
        // }
        // int i=0;
        // while(zero>0){
        //     nums[i++]=0;
        //     zero--;
        // }
        // while(one>0){
        //     nums[i++]=1;
        //     one--;
        // }
        // while(two>0){
        //     nums[i++]=2;
        //     two--;
        // }
                // // sort(nums.begin(),nums.end());
        // cout<<nums.size();
    }
};
