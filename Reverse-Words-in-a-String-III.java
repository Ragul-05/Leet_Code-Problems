class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            char[] ch = word.toCharArray();
            int i = 0, j = ch.length - 1;
            while (i < j) {
                char temp = ch[i];
                ch[i++] = ch[j];
                ch[j--] = temp;
            }
            sb.append(new String(ch)).append(" ");
        }

        return sb.toString().trim();
    }
}
