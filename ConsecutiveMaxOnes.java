package Leet_Code_Problems;
public class ConsecutiveMaxOnes {
        public int findMaxConsecutiveOnes(int[] nums) {
            int cnt = 0;
            int maxi = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    cnt++;
                } else {
                    cnt = 0;
                }
    
                maxi = Math.max(maxi, cnt);
            }
            return maxi;
        }
    }
//time complexity -- > O(N)

