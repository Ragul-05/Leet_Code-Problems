class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        Map<Integer,String> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int place = n - i; 
            int val = sorted[i];
            if (place == 1) rankMap.put(val, "Gold Medal");
            else if (place == 2) rankMap.put(val, "Silver Medal");
            else if (place == 3) rankMap.put(val, "Bronze Medal");
            else rankMap.put(val, String.valueOf(place));
        }
        for (int i = 0; i < n; i++) {
            ans[i] = rankMap.get(score[i]);
        }
        
        return ans;
    }
}
