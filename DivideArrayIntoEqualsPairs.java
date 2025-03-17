package Leet_Code_Problems;
class Solution {
    public boolean divideArray(int[] nums) {
        int[] count = new int[1001]; 
        for (int num : nums) {
            count[num]++;
        }
        for (int i = 0; i < 1001; i++) { 
            if (count[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
