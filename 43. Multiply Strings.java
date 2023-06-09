class Solution {
    public String multiply(String num1, String num2) {
        int start = 0, n = num1.length(), m = num2.length();
        var arr = new int[n+m];
        
        for (var i = n; i > 0; --i) {
            int multiplyBy = num1.charAt(i-1) - '0';
            int offset = start;
            for (var j = m; j > 0; --j) {
                int mult = (num2.charAt(j-1) - '0') * multiplyBy;
                int currStart = offset, inMind = 0;
                while (mult > 0 || inMind > 0) { 
                    int sum = (mult % 10) + arr[n + m - 1 - currStart] + inMind;
                    arr[n + m - 1 - currStart] = sum % 10 ;
                    currStart++;
                    inMind = sum / 10;
                    mult /= 10;
                }
                offset++;
            }
            ++start;
        }

        StringBuilder builder = new StringBuilder();
        int s = 0;
        while (s < m + n -1 && arr[s] == 0) {
            ++s;
        }
        while (s < m + n) {
            builder.append(arr[s++]);
        }

        return builder.toString();
    }
}
