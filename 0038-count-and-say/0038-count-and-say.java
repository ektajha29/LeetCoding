class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String res="1";
        for(int i=2;i<=n;i++){
            StringBuilder sb = new StringBuilder();
            int c=1;
            int length=res.length();
            for(int j=1;j<length;j++){
                if(res.charAt(j)==res.charAt(j-1)){
                  c++;
                }
                else{
                 sb.append(c).append(res.charAt(j-1)); 
                 c=1;  
                }
            }
            sb.append(c).append(res.charAt(length-1));
            res=sb.toString();
        }
        return res;
    }
}