class Solution {
    public int strStr(String haystack, String needle) {
        int h=haystack.length();
        int n= needle.length();
        for(int i=0;i<=h-n;i++){
            String substring = haystack.substring(i,i+n);
            if(substring.equals(needle)){
                return i;
            }
    }
    return -1;
    }
}