class Solution {
     private static final Map<Character,String> hm = Map.of( '2',"abc",
                                               '3',"def",
                                               '4',"ghi",
                                               '5',"jkl",
                                               '6',"mno",
                                               '7',"pqrs",
                                               '8',"tuv",
                                               '9',"wxyz" );
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return result;
        }
        backtracking(result,digits,0,new StringBuilder());
        return result;
    }
    private void backtracking(List<String> result,String digits,int index , StringBuilder path){
        if(index == digits.length()){
            result.add(path.toString());
            return;
        }
        String letters = hm.get(digits.charAt(index));
        for(char ch : letters.toCharArray()){
            path.append(ch);
            backtracking(result,digits,index+1,path);
            path.deleteCharAt(path.length()-1);

        }
    }
}