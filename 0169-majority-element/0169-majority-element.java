import java.util.*;
class Solution {
    public static int majorityElement(int[] nums) {
   int n = nums.length;
   int cnt =0;
   int ele =0;
   for(int i =0;i<n;i++){
    if(cnt == 0){
    cnt = 1;
    ele = nums[i];
    }
   else if(ele == nums[i])
    cnt++;
   else
    cnt--;
}
int cnt1=0;
for(int i=0;i<n;i++){
if(nums[i] == ele)
    cnt1++;
}
if(cnt1 > (n/2))
return ele;
return -1;
    }
}
 