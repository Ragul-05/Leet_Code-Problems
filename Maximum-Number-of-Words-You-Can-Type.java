class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        char[] broken = brokenLetters.toCharArray();
        int res = 0;
        for (String word : words) {
            int count = 0;
            for (char c : broken) {
                if (word.indexOf(c) == -1) { 
                    count++;
                } else {
                    break;
                }
            }
            if (count == broken.length) { 
                res++;
            }
        }
        return res;
    }
}
