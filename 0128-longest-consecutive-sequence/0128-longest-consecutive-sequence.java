class Solution {
    public static int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)
        return 0;
        int longest=1;
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<n;i++){
           set.add(nums[i]);
        }
        for(int it:set)
        {
            if(!set.contains(it-1)){
                int cnt=1;
                int x=it;
                while(set.contains(x+1)){
                    x++;
                    cnt++;
                }
                longest=Math.max(longest,cnt);
            }
        }
            return longest;
        
    }
}