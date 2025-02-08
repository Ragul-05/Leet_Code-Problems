class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> s = new HashSet<>();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                char c = board[i][j];
                if(c != '.') {
                    if(!s.add(c + " in row " + i) || 
                       !s.add(c + " in col " + j) || 
                       !s.add(c + " in box " + (i / 3) + "." + (j / 3))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
