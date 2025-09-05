class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length < 2) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max) max = num;
            if(num < min) min = num;
        }
        for(int val : nums){
            if(val != max && val != min) return val;
        }
        return -1;
    }
}