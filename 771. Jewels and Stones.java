class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        int i = stones.length() - 1;
        while(i >= 0) {
            count += jewels.indexOf(stones.charAt(i)) > -1 ? 1 : 0;
            i--;
        }
        return count;
    }
}
