class Solution {
    public int findMin(int[] nums) {
        int low = 0,high=nums.length-1;
        int mini = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high) / 2;
            if(nums[low] <= nums[high]){
                mini = Math.min(mini,nums[low]);
                break;
            }
            else if(nums[low] <= nums[mid]){
                mini = Math.min(mini,nums[low]);
                low = mid+1;
            }
            else{
                high = mid-1;
                mini = Math.min(mini,nums[mid]);
            }
        }
        return mini;
    }
}