import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> st = new HashMap<>();
        HashMap<Character, Character> en = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

           
            if (st.containsKey(c1) && st.get(c1) != c2) {
                return false;
            }
            
            if (en.containsKey(c2) && en.get(c2) != c1) {
                return false;
            }

            st.put(c1, c2);
            en.put(c2, c1);
        }
        return true;
    }
}
