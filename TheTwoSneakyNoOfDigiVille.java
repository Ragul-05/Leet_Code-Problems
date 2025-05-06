package Leet_Code_Problems;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        int ans []= new int[2];
        int l=0;
        for(int k : hm.keySet()){
            if(hm.get(k)==2){
                ans[l]=k;
                l++;
            }
            if(l==2) break;
        }
        return ans;
    }
}