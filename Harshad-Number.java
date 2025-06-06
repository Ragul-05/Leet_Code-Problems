class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int res = x;
        while(res > 0){
            sum += res % 10;
            res /= 10;
        }
        if(x % sum ==0){
            return sum;
        }
        return -1;
    }
}