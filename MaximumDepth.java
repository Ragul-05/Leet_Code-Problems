class Solution {
    public int maxDepth(String s) {
        int maxdepth = 0;
        int current_depth = 0;

        for(int ch : s.toCharArray()){
            if(ch == '('){
                current_depth++;
                maxdepth = Math.max(current_depth,maxdepth);
            }
            else if(ch == ')'){
                current_depth--;
            }
        }
        return maxdepth;
    }
}