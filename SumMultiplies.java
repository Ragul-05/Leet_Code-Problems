class Solution {
    public int sumOfMultiples(int n) {
		//  iterate through the range 1 to n and 
        int ans = 0;
        for (int i = 3; i <= n; i++) {
			// count numbers divisible by either 3, 5, or 7
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                ans += i;
            }
        }
        return ans;
    }
}