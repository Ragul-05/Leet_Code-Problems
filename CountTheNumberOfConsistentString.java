class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(char c: allowed.toCharArray()){
            set.add(c);
        }
        for(String word : words){
            Boolean isConsistent = true;
            for(char ch : word.toCharArray()){
                if(!set.contains(ch)){
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent){
                count++;
            }
        }
        return count;
    }
}