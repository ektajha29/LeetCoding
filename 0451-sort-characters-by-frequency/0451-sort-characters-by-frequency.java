class Solution {
    public String frequencySort(String s) {
        HashMap <Character,Integer> freqMap= new HashMap<>();
            for(char c:s.toCharArray()){
                freqMap.put(c,freqMap.getOrDefault(c,0)+1);
                  
            }
            List<Character> characters = new ArrayList<>(freqMap.keySet());
              characters.sort((a,b)->freqMap.get(b) - freqMap.get(a));
              StringBuilder result = new StringBuilder();
          for(char c : characters){
              int frequency = freqMap.get(c);
    for (int i = 0; i < frequency; i++) {
        result.append(c);
}
    }
    return result.toString();

}
}