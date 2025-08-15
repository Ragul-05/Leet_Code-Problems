class Solution {
    public boolean isPowerOfFour(int n) {
       if(n <= 0) return false;
       while(n % 4 == 0){
        if((n /= 4) == 0){
            return true;
        }
       }   
       return n == 1;
    }
}