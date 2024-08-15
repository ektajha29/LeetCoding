class Solution {
    public int minimumLength(String s) {
       int left = 0;
        int right = s.length() - 1;
         
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
if(leftChar==rightChar){
            // Find the length of the prefix that matches
            while (left < right && s.charAt(left) == leftChar) {
                left++;
            }

            // Find the length of the suffix that matches
            while (right >= left && s.charAt(right) == rightChar) {
                right--;
            }
        
         }
            else{
                break;
            } 
        
        }
        // The minimum length of the string after all operations
        return right - left + 1;
    }
}