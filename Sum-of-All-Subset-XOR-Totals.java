class Solution {
    public int subsetXORSum(int[] nums) {
        int orSum = 0;
        for (int num : nums) {
            orSum |= num;
        }
        return orSum * (1 << (nums.length - 1));
    }
}
