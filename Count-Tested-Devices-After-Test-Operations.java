class Solution{
public int countTestedDevices(int[] batteryPercentages) {
    int ans = 0;
    for(int b: batteryPercentages) ans += (b > ans)?1:0;
    return ans;
}
}