class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> freqMap= new HashMap<>();
        for(int num: nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);

        }
        int pairs=0;
        int leftovers=0;
        for(int count: freqMap.values()){
            pairs+=count/2;
            leftovers+=count%2;
        }
        return new int[] {pairs,leftovers};
    }
}