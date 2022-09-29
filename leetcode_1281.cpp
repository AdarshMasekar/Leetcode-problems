class Solution {
public:
    int subtractProductAndSum(int n) {
        
        
        int ans;
        int sum=0,prod=1;
        while(n!=0){
            int digit=n%10;
            n=n/10;
            sum+=digit;
            prod*=digit;
            ans=prod-sum;
        }
        return ans;
    }
};
