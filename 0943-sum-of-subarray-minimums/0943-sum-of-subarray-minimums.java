class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int MOD = 1_000_000_007;
        int[] ple = new int[n];
        int[] nle = new int[n]; 
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            ple[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            nle[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        long sum_of_minimums = 0;
        for (int i = 0; i < n; i++) {
            long count = (long) (i - ple[i]) * (nle[i] - i);
            sum_of_minimums = (sum_of_minimums + arr[i] * count) % MOD;
        }

        return (int) sum_of_minimums;
    }
}