class Solution {
    public int repeatedStringMatch(String a, String b) {
       int repeatCount=1;
       String repeatedA=a;
       while(repeatedA.length()<b.length()){
        repeatedA+=a;
        repeatCount++;
       }
       if(repeatedA.contains(b)){
        return repeatCount++;
       }
       repeatedA+=a;
       if(repeatedA.contains(b)){
        return repeatCount+1;
       }
    
    return -1;
}
}