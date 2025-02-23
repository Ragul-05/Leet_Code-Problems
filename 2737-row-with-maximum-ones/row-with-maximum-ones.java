class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max_count = 0, row_index = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = countOnes(mat[i]);
            if (count > max_count) {
                max_count = count;
                row_index = i;
            }
        }
        return new int[]{row_index, max_count};
    }
    private int countOnes(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) count++;  
        }
        return count;
    }
}
