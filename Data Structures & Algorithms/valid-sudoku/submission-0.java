class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<String, HashSet<Character>> hashMap = new HashMap<>();
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[i].length; j++)
            {
                if(board[i][j] == '.') continue;
                String currentRow = "row-" + i;
                String currentCol = "col-" + j;
                String currentSq = String.valueOf(i/3) + String.valueOf(j/3);
                hashMap.putIfAbsent(currentRow, new HashSet<Character>());
                hashMap.putIfAbsent(currentCol, new HashSet<Character>());
                hashMap.putIfAbsent(currentSq, new HashSet<Character>());
                if(hashMap.get(currentRow).contains(board[i][j])
                || hashMap.get(currentCol).contains(board[i][j])
                || hashMap.get(currentSq).contains(board[i][j]))
                return false;
                hashMap.get(currentRow).add(board[i][j]);
                hashMap.get(currentCol).add(board[i][j]);
                hashMap.get(currentSq).add(board[i][j]);
            }
        }
        return true;
    }
}