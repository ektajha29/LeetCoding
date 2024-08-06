import java.io.*;
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s += " ";  // Add space at the end to ensure the last word is processed
        
        Stack<String> st = new Stack<String>();
        String str = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!str.equals("")) {
                    st.push(str);
                    str = "";
                }
            } else {
                str += s.charAt(i);
            }
        }
        
        String ans = "";
        while (!st.isEmpty()) {
            ans += st.pop();
            if (!st.isEmpty()) {
                ans += " ";
            }
        }
        
        System.out.println("After reversing words: ");
        return ans;
    }
}

