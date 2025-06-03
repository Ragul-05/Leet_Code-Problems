class Solution {
    public int numberOfSteps(int n) {
        return n==0?0:n%2==0?1+numberOfSteps(n/2):1+numberOfSteps(n-1);
    }
}