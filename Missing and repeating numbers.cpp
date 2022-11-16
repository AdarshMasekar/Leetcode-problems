#include <bits/stdc++.h> 
#include <bits/stdc++.h> 

pair<int,int> missingAndRepeating(vector<int> &arr, int n)
{
	int t = 0;
    int sum = 0;
    for(int  i = 0;i<n;i++){
        sum += abs(arr[i]);
        int ind = abs(arr[i])-1;
        arr[ind] *= -1;
        
        if(arr[ind]>0){
            t = abs(arr[i]);
            
        }
    }
    int x = (n*(n+1))/2;
    int ans = (x-sum);
     return {ans+t,t};
}
