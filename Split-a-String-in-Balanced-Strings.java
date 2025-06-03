class Solution {
    public int balancedStringSplit(String s) {
        int k = 0;
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'L'){
                k++;
            }
            else{
                k--;
            }
            if(k == 0) count++;
        }   
        return count;
    }
}