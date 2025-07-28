class Solution {
   public int pivotInteger(int n) {
    int left = 1, right = n;
    int sumLeft = 1, sumRight = n;

    while (left < right) {
        if (sumLeft < sumRight) {
            left++;
            sumLeft += left;
        } else {
            right--;
            sumRight += right;
        }
    }
    return (sumLeft == sumRight) ? left : -1;
}
}