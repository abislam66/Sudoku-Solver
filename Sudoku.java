public class Sudoku {
    public static void main(String[] args) {
        int[][] board = new int[9][9];

        //  fill the board using backtracking
          if (fillBoard(board)) {

            System.out.println("Solved");
            for (int i = 0; i < 9; i++) {
                if (i % 3 == 0 && i != 0) {
                    System.out.println();
                }

                for (int j = 0; j < 9; j++) {

                    if (j % 3 == 0 && j != 0) {
                        System.out.print("  ");
                    }

                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error");
        }
    }

//filling board
    public static boolean fillBoard(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                           //recursion starts
                            if (fillBoard(board)) {
                                return true;
                            }
                            board[row][col] = 0;
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

//checking if number is valid to be put in that spot
    public static boolean isValid(int[][] board, int row, int col, int num) {

        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num) return false;
        }


        for (int x = 0; x < 9; x++) {
            if (board[x][col] == num) return false;
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }
        return true;
    }

}
