class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st = new Stack<>();
           for(int asteroid : asteroids){
            boolean exploded = false;
            while(!st.isEmpty() && asteroid < 0 && st.peek() > 0){
                if(Math.abs(st.peek()) < Math.abs(asteroid)){
                    st.pop();
                }else if(Math.abs(st.peek()) == Math.abs(asteroid)){
                    st.pop();
                    exploded = true;
                    break;
                }else{
                  exploded = true;
                    break;   
                }
            }
              if (!exploded) {
                st.push(asteroid);
              }
           }
            int res [] = new int [st.size()];
           for(int i = res.length - 1;i >= 0; i--){
           res[i] = st.pop();
           }
           return res;
    }
}