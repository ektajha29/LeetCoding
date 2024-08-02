class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
          List<List<Integer>> ans=new ArrayList<>();
          Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){ //Initially i is constant
         if(i!=0 && nums[i]==nums[i-1])  //checks if i is not equal to 0 because then it cannot be compared to the previous element (i-1) and checks if i is not equal to the previous element. 
         continue;//this skips the rest of the body
         int j=i+1;//updates j
         int k=nums.length-1;//updates k
         while(j<k){
            int sum = nums[i]+nums[j]+nums[k];
            if(sum<0){
                j++;
            }
                else if(sum>0){
                k--;
                }
                else { //if sum==0
                  List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
         return ans;
        }
    }
