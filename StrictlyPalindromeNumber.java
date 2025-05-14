public class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            if (!isPalindrome(convertToBase(n, base))) {
                return false;
            }
        }
        return true;
    }

    private String convertToBase(int n, int base) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % base);
            n /= base;
        }
        return sb.reverse().toString();
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
 StrictlyPalindromeNumber {
    
}
