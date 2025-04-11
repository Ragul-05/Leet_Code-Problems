class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] customer : accounts) {
            int sum = 0;
            for (int bank : customer) {
                sum += bank;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
