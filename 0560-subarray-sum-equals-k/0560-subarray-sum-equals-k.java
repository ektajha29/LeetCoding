class Solution {
    public static int subarraySum(int[] nums, int k) {
       int n=nums.length;
   HashMap<Integer,Integer> mpp= new HashMap<>();
   int preSum=0;
   int cnt=0;
   mpp.put(0,1);
   for(int i=0;i<n;i++){
     preSum+=nums[i];
     int rem=preSum-k;
      cnt += mpp.getOrDefault(rem, 0);
      mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
   }
    }
