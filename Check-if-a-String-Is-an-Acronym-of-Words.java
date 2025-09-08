class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n = s.length();
        if( words.size() != n ) return false;

        for(int i = 0 ; i < words.size() ; i++ ){
            String news = words.get(i);
            if( news.charAt(0) != s.charAt(i) ){
                return false;
            }
        }
        return true;
    }
}