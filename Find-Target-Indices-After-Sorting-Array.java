class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int lessCount = 0, equalCount = 0;
        for (int num : nums) {
            if (num < target) lessCount++;
            else if (num == target) equalCount++;
        }
        for (int i = 0; i < equalCount; i++) {
            result.add(lessCount + i);
        }
        return result;
    }
}