class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int[] numss = new int[n];
        for (int i = 0; i < n; i++) {
            numss[i] = nums.get(i);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numss[i] + numss[j] < target) {
                    ans++;
                }
            }
        }

        return ans;
    }
}