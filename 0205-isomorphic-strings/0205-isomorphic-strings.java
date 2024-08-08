class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
        return false;
        }
        HashMap<Character,Character> mapST= new HashMap<>();
        HashMap<Character,Character> mapTS= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char S=s.charAt(i);
            char T=t.charAt(i);
            if(mapST.containsKey(S)){
                if(mapST.get(S)!=T){
                    return false;
                }
            }
                else{
                    mapST.put(S,T);
                }
            
           if(mapTS.containsKey(T)){
                if(mapTS.get(T)!=S){
                    return false;
                }
           }
                else{
                    mapTS.put(T,S);
                }
        }
            return true;
        }
    
}