class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap currMax and currMin when a negative number is encountered
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            // Calculate the maximum and minimum product up to the current number
            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);

            // Update the global maximum product
            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }
}
