class Solution {
public:
    vector<vector<int>> minimumAbsDifference(vector<int>& arr) {
        vector<vector<int>> res;
        sort(arr.begin(),arr.end());
        int min_gap=INT_MAX;
        for(int i=1;i<arr.size();i++)
            min_gap=min(min_gap,arr[i]-arr[i-1]);
        for(int i=1;i<arr.size();i++)
            if(arr[i]-arr[i-1]==min_gap)
                res.push_back({arr[i-1],arr[i]});
        return res;
    
    }
};
