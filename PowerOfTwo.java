class Solution {
    public boolean isPowerOfTwo(int n) {
      //  if(n<=0) return false; -- Method 1 bitwise operator
       // return (n & (n-1))==0;

        if (n <= 0) return false;
        double logValue = Math.log10(n) / Math.log10(2);
        return logValue == (int) logValue;
    }
}
