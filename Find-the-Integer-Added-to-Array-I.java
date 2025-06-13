class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1 = 0, sum2 = 0;
        for(int x : nums1)
            sum1+=x;
        for(int x : nums2)
            sum2+=x;
        return (sum2-sum1)/nums1.length;    
    }
}