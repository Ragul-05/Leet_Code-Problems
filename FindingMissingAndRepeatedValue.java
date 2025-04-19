class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] freq = new int[size+1];
        for(int[] row : grid){
            for(int val : row){
                freq[val]++;
            }
        }
        int[] result = new int[2];
        for(int i=1;i<=size;i++){
            if(freq[i] == 2) result[0] = i;
            else if(freq[i] == 0) result[1] = i;
        }
           return result;
    }
}