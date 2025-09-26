class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int singleDigit = 0, doubleDigit = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] >= 0 && nums[i] <= 9){
                singleDigit += nums[i];
            }
            else{
                doubleDigit += nums[i];
            }
        }
        if(singleDigit > doubleDigit || doubleDigit > singleDigit) return true;
        return false;
    }
}