class Solution {
    public static int singleNumber(int[] nums) {
        int xorr=0;
        for(int i=0;i<nums.length;i++){
            xorr=xorr^nums[i];
        }
        return xorr;
    }
    public static void main(String[]args){
        int arr[]={4,1,2,1,2};
        int ans=singleNumber(arr);
        System.out.println("The no that appears only once"+ans);
    }
}