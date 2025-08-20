class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int n = temperatures.length;
       int[] res = new int[n];
       int[] stack = new int[n];
       int x = -1;
       for(int i = 0; i< n; i++){
         int cur = temperatures[i];
         while(x != -1 && cur > temperatures[stack[x]]){
            int r = i - stack[x];
            res[stack[x]] = r;
            x--;
         }
         stack[++x] = i;
       }
       return res;
    }
}