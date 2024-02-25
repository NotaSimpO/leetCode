class Solution {
    public boolean ifPos(char[][] board, int row, int col, char temp) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == temp) {
                return false;
            }
            if (board[i][col] == temp) {
                return false;
            }
            if (board[(row / 3) * 3 + i / 3][(col / 3) * 3 + i % 3] == temp) {
                return false;
            }
        }
        return true;
    }

    public boolean suSolver(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    for (char n = '1'; n <= '9'; n++) {
                        if (ifPos(board, i, j, n) == true) {
                            board[i][j] = n;

                            if (suSolver(board) == true) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        suSolver(board);
    }
}