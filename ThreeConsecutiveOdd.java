class Solution {
    public boolean threeConsecutiveOdds(int[] a) {
        int c = 0;
        for (int x : a) {
            c = (x % 2 == 1) ? c + 1 : 0;
            if (c == 3) return true;
        }
        return false;
    }
}