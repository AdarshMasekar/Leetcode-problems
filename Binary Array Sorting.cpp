
vector<int> sortBinaryArray(vector<int> arr, int n)  {
 	// Write your code here
    int i=0;
    int j= n-1;
    while(i<j){
        if(arr[i]==0){
            i++;
            continue;
        }else if(arr[i]==1 && arr[j]==0){
            swap(arr[i],arr[j]);
            i++;
            j--;
            continue;
        }else if(arr[i]==1 && arr[j]==1){
            j--;
            continue;
        }
    }
    return arr;
}
