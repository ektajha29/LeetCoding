class Solution {
    public static int myAtoi(String s) {
      
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Remove leading whitespaces
        int i = 0;
        int n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check if string is empty after removing spaces
        if (i == n) {
            return 0;
        }

        // Check for the sign
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        // Convert characters to integer
        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check for overflow and underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(myAtoi("42")); // Output: 42
        System.out.println(myAtoi("   -42")); // Output: -42
        System.out.println(myAtoi("4193 with words")); // Output: 4193
        System.out.println(myAtoi("words and 987")); // Output: 0
        System.out.println(myAtoi("-91283472332")); // Output: -2147483648 (Integer.MIN_VALUE)
    }
}

 