class Solution {
    public static void moveZeroes(int[] nums) {
        int insertPos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertPos]=nums[i];
                insertPos++;
            }
        }
        for(int i=insertPos;i<nums.length;i++){
            nums[i]=0;
        }
    }
    public static void main(String []args){
        int nums[]={0,1,0,3,12};
        moveZeroes(nums);
        System.out.println("The array after moving zeroes is: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}