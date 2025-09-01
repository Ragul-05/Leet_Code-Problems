class Solution {
    public boolean backspaceCompare(String s, String t) {
        return Build(s).equals(Build(t));
    }

    private String Build(String s){
        int n = s.length();
        char[] st = new char[n];
        int x = -1;
        for(int i = 0; i < n ; i++){
            if(s.charAt(i) != '#'){
                st[++x] = s.charAt(i);
            }
            else if(x >= 0){
                x--;
            }
        }
        String res = "";
        for(int i = 0; i <= x;i++){
            res += st[i];
        }
        return res;
    }

}