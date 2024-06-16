class Solution {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int countBreaks = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                countBreaks++;
            }
        }
                if (nums[n - 1] > nums[0]) {
            countBreaks++;
        }
        return (countBreaks <= 1)?true:false;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 8};
        System.out.println(check(arr1));
    }
}
