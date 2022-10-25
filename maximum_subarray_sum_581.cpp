#include <bits/stdc++.h> 
long long maxSubarraySum(int arr[], int n)
{
    /
    long long  sum=0;
    long long  maxsum=INT_MIN;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
        if(sum<0){
            sum=0;
        }

        maxsum=max(sum,maxsum);

        
         
    }
   return maxsum;
}
