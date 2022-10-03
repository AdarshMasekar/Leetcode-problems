vector<int> print_like_a_wave(vector<vector<int>> arr,int n,int m){

    vector<int> ans;
    for(int col=0;col<n;col++){

        if(col&1){//odd case bottom to top
            for (int row=m-1;row>=0;row--){
                cout<<arr[row][col]<<" ";
                ans.push_back(arr[row][col]);
            }
        }
        else{//even index case top to bottm
            for (int row=0;row<=m;row++){
                cout<<arr[row][col]<<" ";
                ans.push_back(arr[row][col]);
            }
        }
    }
    return ans;
}
