class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] arr : grid){
            for(int num : arr){
                if(num < 0){
                    count++;
                }
            }
        }
        return count;
    }
}