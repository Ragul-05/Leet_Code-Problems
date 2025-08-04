class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> seen = new HashSet<>();
        int count = 0;

        for (int num : nums) {
            if (seen.contains(num - diff) && seen.contains(num - 2 * diff)) {
                count++;
            }
            seen.add(num);
        }

        return count;
    }
}
