package KnightTour;

import java.util.Arrays;

public class Board {
    private final int BOARD_SIZE = 8;
    private final char REACHABLE_SYMBOL = '-';
    private final char NON_REACHABLE_SYMBOL = 'x';
    private char[][] board;

    public Board(){
        this.board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = REACHABLE_SYMBOL;
            }
        }
    }

    public void insertMove(int row, int col) {
        this.board[row][col] = NON_REACHABLE_SYMBOL;
    }

    public char getSymbol(int row, int col) {
        return board[row][col];
    }

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
