class Solution {
    public int subtractProductAndSum(int n) {
        int addition = 0;
        int multiplication = 1;
        while(n > 0){
            int digit = n % 10;
            addition += digit;
            multiplication *= digit;
            n /= 10;
        }
        return multiplication - addition;
    }
}