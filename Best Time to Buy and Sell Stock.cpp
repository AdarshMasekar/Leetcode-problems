#include <bits/stdc++.h> 
int maximumProfit(vector<int> &prices){
    // Write your code here.
    int minprice=INT_MAX;
    int maxprofit=0;
    int size=prices.size();
    
    for(int i=0;i<size;i++){
      minprice=min(minprice,prices[i]);
      maxprofit=max(maxprofit,prices[i]-minprice);
    }
    
    return maxprofit;
}
