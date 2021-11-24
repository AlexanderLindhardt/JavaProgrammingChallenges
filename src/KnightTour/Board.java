package KnightTour;

import java.util.Arrays;

public class Board {
    /**The board size of the chess board.*/
    private final int BOARD_SIZE = 8;
    /** The symbol that represents a position that is available. */
    public final static char REACHABLE_SYMBOL = '-';
    /** The symbol that represents a position that is not available. */
    public final static char NON_REACHABLE_SYMBOL = 'x';
    private final char[][] board;

    /**
     * Creates a chess board and makes every square reachable.
     */
    public Board(){
        this.board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = REACHABLE_SYMBOL;
            }
        }
    }

    /**
     * Inserts the knight to a given position and thus
     * make it an "unreachable" square.
     * @param row The row of where the knight moves.
     * @param col The column of where the knight moves.
     */
    public void insertMove(int row, int col) {
        this.board[row][col] = NON_REACHABLE_SYMBOL;
    }

    /**
     * Returns the symbol of a given position, its either reachable/unreachable.
     * @param row The row.
     * @param col The column.
     * @return <code> x </code> if this square has already been reached,
     * <code> - </code> if it has not yet been reached.
     */
    public char getSymbol(int row, int col) {
        return board[row][col];
    }

    /**
     * Makes a string that represents the board in its current state.
     * @return String of the board.
     */
    @Override
    public String toString() {
        StringBuilder boardPrint = new StringBuilder();
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                boardPrint.append(board[i][j]).append("  ");
            }
            boardPrint.append(" \n");
        }
        return boardPrint.toString();
    }
}
