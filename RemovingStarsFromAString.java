class Solution {
    public String removeStars(String s) {
        Stack<Character> sc = new Stack <>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                  sc.push(ch);
            }else{
                sc.pop();
            }  
        } 
        while(!sc.isEmpty()){
            sb.append(sc.pop());
        }
        String str=sb.reverse().toString();
        return str;
    }
}