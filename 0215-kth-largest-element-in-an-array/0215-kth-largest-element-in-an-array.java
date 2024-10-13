public class Solution {
    public int partition(int[] nums, int low, int high) {
        int pivot = nums[low];  
        int i = low + 1; // Start i from low + 1
        int j = high;
        
        while (i <= j) {
            while (i <= high && nums[i] <= pivot) { // Ensure i does not go out of bounds
                i++;
            } 
            while (j >= low && nums[j] > pivot) { // Ensure j does not go out of bounds
                j--;
            }
            if (i < j) { // Swap if i is less than j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        
        // Place the pivot in its correct position
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;
        
        return j; // Return the pivot index
    }

    public int findKthLargest(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) { // Use a loop to repeatedly partition
            int pIndex = partition(nums, low, high);
            if (pIndex == nums.length - k) { // Check if we found the k-th largest
                return nums[pIndex];
            }
            if (pIndex > nums.length - k) {
                high = pIndex - 1; // Search in the left part
            } else {
                low = pIndex + 1; // Search in the right part
            }
        } 
        return Integer.MIN_VALUE; // This case should ideally not happen
    }
}
