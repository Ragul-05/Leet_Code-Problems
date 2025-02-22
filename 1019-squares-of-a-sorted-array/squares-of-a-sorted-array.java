class Solution {
    public int[] sortedSquares(int[] nums) {
         ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int square = nums[i] * nums[i]; 
            ls.add(square);
        }
        Collections.sort(ls);
        int[] result = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            result[i] = ls.get(i);
        } 
        return result;
    }
}