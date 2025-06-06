class Solution {
    public int count(String s) {
        int c = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                c++;
            }
        }
        return c;
    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            max = Math.max(max, count(sentences[i]));
        }
        return max;
    }
}