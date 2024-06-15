class Solution {
    public static boolean isPalindrome(int x) {
        int revNum = 0;
        int dup = x;
        while (x > 0) {
            int ld = x % 10;
            revNum = (revNum * 10) + ld;
            x = x / 10;
        }
        if (dup == revNum) {
            
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 4554;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}