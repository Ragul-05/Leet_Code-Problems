class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101]; // adjust size to max possible value
        int maxFreq = 0;
        for (int num : nums) {
            freq[num]++;
            maxFreq = Math.max(maxFreq, freq[num]);
        }
        int count = 0;
        for (int f : freq) {
            if (f == maxFreq) count += f;
        }
        return count;
    }
}
