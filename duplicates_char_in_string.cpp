void print_duplicates(string s, int n) {
    int arr[256];   // 256 as its not said there would be only alphabets
    memset(arr, 0, sizeof(arr));
    for (char c : s) {
        arr[c - 'a']++;
    }
    for (int i = 0;i < 256;i++) {
        if (arr[i] > 1) {   // greater than 1 as we have to find the duplicates
            cout << ('a' + i), << " Count=" << arr[i] << endl;
        }
    }
}
