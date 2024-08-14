class Solution {
    public int minAddToMakeValid(String s) {
        int balance = 0;
        int moves=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                balance++;
            }
            else if(c==')'){
                balance--;
            }
        
        if(balance<0){
            moves++;
        balance=0;
        }
        }
        return moves+balance;
    }
}