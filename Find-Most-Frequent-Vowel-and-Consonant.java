class Solution {
    public int maxFreqSum(String s) {
        int v[] = new int[5];
        int c[] = new int[26];
        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                v[0]++;
            } else if (ch == 'e') {
                v[1]++;
            } else if (ch == 'i') {
                v[2]++;
            } else if (ch == 'o') {
                v[3]++;
            } else if (ch == 'u') {
                v[4]++;
            } else {
                c[ch - 'a']++;
            }
        }
        int maxv = 0;
        int maxc = 0;
        for (int i : v) {
            maxv = Math.max(maxv, i);
        }
        for (int i : c) {
            maxc = Math.max(maxc, i);
        }
        return maxv + maxc;
    }
}