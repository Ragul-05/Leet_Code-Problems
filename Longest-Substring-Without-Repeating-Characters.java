class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] hash = new int[256];
        Arrays.fill(hash, -1);
        int maxLen = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (hash[ch] != -1 && hash[ch] >= left) {
                left = hash[ch] + 1;
            }
            hash[ch] = right; 
            maxLen = Math.max(maxLen, right - left + 1); 
        }

        return maxLen;
    }
}