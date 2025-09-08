class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int j  = 0;
        for(int i = 0 ; i < n ; i++){
            int s = nums[i];
            int sum = 0;
            while(s > 0){
                int digit = s % 10;
                sum += digit;
                s /= 10;
            }
            nums[j++] = sum;
        }

        int min = nums[0];
        for(int i = 1 ; i < n ; i++){
            if( nums[i] < min ){
                min = nums[i];
            }
        }

        return min;
    }
}