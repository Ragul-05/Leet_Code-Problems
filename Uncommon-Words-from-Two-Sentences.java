class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map1 = getWordCount(s1);
        Map<String, Integer> map2 = getWordCount(s2);
        List<String> result = new ArrayList<>();
        for (String word : map1.keySet()) {
            if (map1.get(word) == 1 && !map2.containsKey(word)) {
                result.add(word);
            }
        }
        for (String word : map2.keySet()) {
            if (map2.get(word) == 1 && !map1.containsKey(word)) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
    private static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : sentence.split(" ")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}