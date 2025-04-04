class Solution {
    public int maxProductDifference(int[] nums) {
        int first_big = 0, second_big = 0;
        int first_small = Integer.MAX_VALUE, second_small = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n < first_small) {
                second_small = first_small;
                first_small = n;
            } else if (n < second_small) {
                second_small = n;
            }

            if (n > first_big) {
                second_big = first_big;
                first_big = n;
            } else if (n > second_big) {
                second_big = n;
            }
        }

        return first_big * second_big - first_small * second_small;        
    }
}