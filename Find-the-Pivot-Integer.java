class Solution {
    public int pivotInteger(int n) {
    for (int x = 1; x <= n; x++) {
        int left = x * (x + 1) / 2;
        int right = (n * (n + 1) / 2) - ((x - 1) * x / 2);
        if (left == right) return x;
    }
    return -1;
}

}