#include <bits/stdc++.h> 
int flipBits(int* arr, int n)  
{
  int count0=0, maxcount=0, count1=0;
   for(int i=0; i<n; i++)
   {
       if(arr[i]==0)
       {
           count0++;
       }          
       else
       {
           count0--;
           count1++;
       }
       if(count0>maxcount)
       {
          maxcount=count0; 
       }          
       if(count0<0)
       {
           count0=0;
       }          
   }
   return maxcount+count1;
}
