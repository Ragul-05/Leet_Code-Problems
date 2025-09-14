import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>();
        Map<String, String> caseInsensitiveMap = new HashMap<>();
        Map<String, String> vowelMap = new HashMap<>();
        for (String word : wordlist) {
            exactWords.add(word);
            String lower = word.toLowerCase();
            caseInsensitiveMap.putIfAbsent(lower, word);
            String masked = maskVowels(lower);
            vowelMap.putIfAbsent(masked, word);
        }
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];
            if (exactWords.contains(q)) {
                result[i] = q;
            } else {
                String lowerQ = q.toLowerCase();
                if (caseInsensitiveMap.containsKey(lowerQ)) {
                    result[i] = caseInsensitiveMap.get(lowerQ);
                } else {
                    String maskedQ = maskVowels(lowerQ);
                    result[i] = vowelMap.getOrDefault(maskedQ, "");
                }
            }
        }
        return result;
    }
    private String maskVowels(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) sb.append('*');
            else sb.append(c);
        }
        return sb.toString();
    }
}
