// apply binary search for optimising code

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int low=0,high=(matrix.size()*matrix[0].size())-1;
        int m=matrix[0].size();
         if(!matrix.size()) return false;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid/m][mid%m]==target)
                return true;
            else if(matrix[mid/m][mid%m]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }
};
