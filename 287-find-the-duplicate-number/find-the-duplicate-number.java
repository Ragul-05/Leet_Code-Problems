class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n+1];
        for(int i=0;i<n;i++){
            if(arr1[nums[i]]==0){
                arr1[nums[i]] += 1;
            }
            else{
                return nums[i];
            }
        }
        return 0;
    }
}