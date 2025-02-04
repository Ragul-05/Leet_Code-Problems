package Leet_Code_Problems;
import java.util.*;
class Solution {
    public double findMaxAverage(int[] nums, int k) {  
        int cur_sum = 0;
        int max = cur_sum;
        for(int i =0;i<k;i++){
            cur_sum += nums[i];
         }
        for(int i = k ; i<nums.length;i++){
                cur_sum+=nums[i];
                cur_sum-=nums[i-k];
                max  = Math.max(max,cur_sum);
        }
        return (double)max/k;
    }
}