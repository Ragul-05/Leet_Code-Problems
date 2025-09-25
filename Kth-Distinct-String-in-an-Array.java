import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> hm = new LinkedHashMap<>();
        for (String s : arr) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
                if (count == k) return entry.getKey();
            }
        }

        return "";
    }
}
