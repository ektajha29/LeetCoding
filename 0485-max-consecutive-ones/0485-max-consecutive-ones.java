import java.util.*;
class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
     int c=0;
     int max=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            c++;
        }else{
            c=0;
        }
        max=Math.max(max,c);
     }   
     return max;
    }
    public static void main(String[]args){
        int arr[]={1,1,0,1,1,1};
        int ans=findMaxConsecutiveOnes(arr);
        System.out.println("The maximum no of consecutive one's are: "+ans);
    }
}