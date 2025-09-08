class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = 1,b = n-1;
        while(!isNoZero(a) || !isNoZero(b)){
            a++;
            b--; 
        }
        return new int[]{a,b};
    }
    private boolean isNoZero(int x){
        while(x > 0){
            int digit = x % 10;
            if(digit == 0) return false;
            x /= 10;
        }
        return true;
    }
}