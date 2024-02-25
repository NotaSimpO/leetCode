class Solution {
    int count = 0;
    public void printBoard(List<List<String>> result, char[][] board) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String str = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    str += "Q";
                } else {
                    str += ".";
                }
            }
            temp.add(str);
        }
        result.add(temp);
    }

    public boolean isSafe(char[][] board, int row, int col) {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 'Q')
                return false;
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;
        for (i = row, j = col; j >= 0 && i < board[0].length; i++, j--)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    private void solveNqueens(List<List<String>> result, char[][] board, int col) {
        if (col == board[0].length) {
            printBoard(result, board);
            count++;
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 'Q';
                solveNqueens(result, board, col + 1);
                board[i][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        solveNqueens(result, board,0);
        System.out.println(count);
        return result;
    }
}