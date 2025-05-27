class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < nums.length; j++) {
                if (min > nums[j]) {
                    min = nums[j]; // Update the minimum value found
                }
            }

            for (int j = 0; j < nums.length; j++) {
                if (min == nums[j]) {
                    nums[j] *= multiplier;  // Multiply the smallest element by 'multiplier'
                    break;
                }
            }
        }

        return nums;
    }
}