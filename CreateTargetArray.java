class Solution {
    public static int[] createTargetArray(int[] nums, int[] index) {

 int[] result = new int[index.length];

 Arrays.fill(result, -1);

 for (int i = 0; i < index.length; i++) {

     int currentIndex = index[i];

     if (result[currentIndex] != -1) {
         System.arraycopy(result, currentIndex, result, currentIndex + 1, result.length - currentIndex - 1);
     }

     result[currentIndex] = nums[i];
 }

 return result;
}
}