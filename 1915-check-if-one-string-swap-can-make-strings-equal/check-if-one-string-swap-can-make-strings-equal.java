class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int first = -1,second =-1;
        int diffcount = 0;

        for(int i=0 ; i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                diffcount++;
                if(first == -1){
                    first = i;
                }
                else{
                    second = i;
                }
                if(diffcount > 2){
                    return false;
                }
            }
        }
        if(diffcount == 2 && s1.charAt(first)==s2.charAt(second) && s1.charAt(second)==s2.charAt(first)){
            return true;

        }
        return diffcount == 0;
    }
}