class Solution {
    public int[] sortedSquares(int[] nums) {
        /* ArrayList<Integer> ls = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int square = nums[i] * nums[i]; 
            ls.add(square);
        }
        Collections.sort(ls);
        int[] result = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            result[i] = ls.get(i);
        } 
        return result;*/

         int n = nums.length;
        int[] result = new int[n];
        int lft = 0, ryt = n - 1;
        int index = n - 1;
        while (lft <= ryt) {
            int ls = nums[lft] * nums[lft];
            int rs = nums[ryt] * nums[ryt];   
            if (ls > rs) {
                result[index--] = ls;
                lft++;
            } else {
                result[index--] = rs;
                ryt--;
            }
        }
        return result;
    }
}