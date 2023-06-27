class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int len = s.length();
        char[] one = new char[len];
        one = s.toCharArray();
        char[] two = new char[len];
        two = t.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);
        for(int i=0;i<one.length;i++){
            // System.out.println(one[i]+" "+two[i]);
            if(one[i] != two[i]){
                return false;
            }
        }
        return true;
    }
}
