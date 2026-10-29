class Solution {

    public boolean exist(char[][] board, String word) {

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){

                if(board[i][j] == word.charAt(0)){
                    if(dfs(board, word, i, j, 0)){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int index){

        // ✅ base case
        if(index == word.length()){
            return true;
        }

        // ❌ boundary + mismatch
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length 
           || board[i][j] != word.charAt(index)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';   // mark visited

        // 🔥 explore all 4 directions
        boolean found = dfs(board, word, i+1, j, index+1) ||
                        dfs(board, word, i-1, j, index+1) ||
                        dfs(board, word, i, j+1, index+1) ||
                        dfs(board, word, i, j-1, index+1);

        board[i][j] = temp;  // 🔥 backtrack

        return found;
    }
}