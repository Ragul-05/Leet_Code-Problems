class Solution {
    public int findPeakElement(int[] nums) {

        //Greedy approach
        int n = nums.length;
        int i = 0;
        while (i < n - 1) {
            if (nums[i] > nums[i + 1])
                return i;
            i++;
        }
        return n - 1;
    }
}