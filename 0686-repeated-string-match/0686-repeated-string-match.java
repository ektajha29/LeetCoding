class Solution {
    public int repeatedStringMatch(String a, String b) {
 int repeatCount = 1;
        StringBuilder repeatedA = new StringBuilder(a);

        while (repeatedA.length() < b.length()) {
            repeatedA.append(a);
            repeatCount++;
        }

        if (repeatedA.toString().contains(b)) {
            return repeatCount;
        }

        repeatedA.append(a);
        if (repeatedA.toString().contains(b)) {
            return repeatCount + 1;
        }

        return -1;
    }
}