class Solution {
    public int numRookCaptures(char[][] board) {
        int ri = 0, rj = 0;

        // Find the rook
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    ri = i;
                    rj = j;
                }
            }
        }

        int count = 0;

        // Down
        for (int i = ri + 1; i < 8; i++) {
            if (board[i][rj] == 'B') break;
            if (board[i][rj] == 'p') {
                count++;
                break;
            }
        }

        // Up
        for (int i = ri - 1; i >= 0; i--) {
            if (board[i][rj] == 'B') break;
            if (board[i][rj] == 'p') {
                count++;
                break;
            }
        }

        // Left
        for (int j = rj - 1; j >= 0; j--) {
            if (board[ri][j] == 'B') break;
            if (board[ri][j] == 'p') {
                count++;
                break;
            }
        }

        // Right
        for (int j = rj + 1; j < 8; j++) {
            if (board[ri][j] == 'B') break;
            if (board[ri][j] == 'p') {
                count++;
                break;
            }
        }

        return count;
    }
}