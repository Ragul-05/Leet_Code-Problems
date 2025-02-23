class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max_count = 0;
        int row_index = 0;

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) count++;
            }

            if (count > max_count) {
                max_count = count;
                row_index = i;
            }
        }

        return new int[]{row_index, max_count};
    }
}
