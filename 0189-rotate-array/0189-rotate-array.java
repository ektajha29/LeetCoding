class Solution {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k <= 0) return; 
        k = k % n; 
        if (k == 0) return; 
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        System.arraycopy(temp, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int k = 2;
        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr, k); 
        System.out.println("The array after right rotation by " + k + " elements is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
