class Solution {
    public int findLucky(int[] arr) {
         Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey(), val = entry.getValue();
            if (key == val) {
                result = Math.max(result, key);
            }
        }

        return result;
    }
}