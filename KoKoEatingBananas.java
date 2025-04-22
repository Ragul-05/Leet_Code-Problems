class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = getMax(piles);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total_hour = getTotalHours(piles, mid);

            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private int getMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    private long getTotalHours(int[] piles, int speed) {
        long total = 0;
        for (int pile : piles) {
            total += (pile + (long)speed - 1) / speed;
        }
        return total;
    }
}
