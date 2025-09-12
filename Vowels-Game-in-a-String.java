class Solution {
    public boolean doesAliceWin(String s) {
        if (s == null) return false;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) return true;
        }
        return false;
    }
}
