class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        for (char ch : String.valueOf(x).toCharArray()) {
            sum += ch - '0';
        }
        return (x % sum == 0) ? sum : -1;
    }
}
