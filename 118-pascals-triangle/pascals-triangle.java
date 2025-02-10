class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1;row <= numRows;row++){
            ans.add(generateRow(row));
        }
        return ans;
    }
    private List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> ansrow = new ArrayList<>();
        ansrow.add(1);
        for(int c =1;c<row;c++){
            ans = ans * (row-c);
            ans = ans / c;
            ansrow.add((int)ans);
        }
        return ansrow;
    }
}