package KnightTour;

/**
 * A class that represents a knight that has a position (row/col)
 * and can make moves on a chess board.
 */
public class Knight {
    /** The knight's current row (from 0-7). */
    private int currentRow;
    /** The knight's current column (from 0-7). */
    private int currentCol;
    /** A representation of the chess board. */
    private final Board chessBoard;

    /**
     * Creates a knight with a chess board and puts it at its initial position.
     * @param initialRow The knight's initial row.
     * @param initialCol The knight's initial column.
     */
    public Knight(int initialRow, int initialCol) {
        this.currentRow = initialRow;
        this.currentCol = initialCol;
        this.chessBoard = new Board();
        this.chessBoard.insertMove(this.currentRow, this.currentCol);
    }

    /**
     * Moves the knight according to a given "move type" IF it's legal, also
     * inserts the move on the chess board. See the move types in the PNG.
     * @param move One of the eight possible moves a knight can make on a chess board.
     * @return <code>false</code> if the move is not legal, <code>true</code> otherwise.
     */
    public boolean moveKnight(Move move) {
        if (isLegalMove(move)) {
            this.currentRow += move.getMoveRow();
            this.currentCol += move.getMoveCol();
            chessBoard.insertMove(this.currentRow, this.currentCol);
            return true;
        }
        return false;
    }

    /**
     * Looks to see if the knight given its position can make the move given.
     * @param move One of the eight possible moves a knight can make on a chess board.
     * @return <code>false</code> if the move is illegal,
     *         <code>true</code> otherwise.
     */
    public boolean isLegalMove(Move move) {
        if (this.currentRow + move.getMoveRow() > 7 || this.currentRow + move.getMoveRow() < 0 ||
                this.currentCol + move.getMoveCol() > 7 || this.currentCol + move.getMoveCol() < 0 ) // Not legal to move out of the board
            return false;
        else return chessBoard.getSymbol(this.currentRow + move.getMoveRow(), this.currentCol + move.getMoveCol()) != Board.NON_REACHABLE_SYMBOL; // Not allowed to move to same position twice
    }

    /**
     * Looks to see if the knight has any legal moves available.
     * @return <code>false</code> if there are no legal moves available,
     *         <code>true</code> otherwise.
     */
    public boolean legalMoves() {
        Move move;
        for (int i = 0; i < 8; i++) {
            move = new Move(i);
            if (isLegalMove(move)){
                return true;
            }
        }
        return false;
    }

    /**
     * Looks to see if the knight has made a full tour, meaning that it has
     * moved to every position exactly once.
     * @return <code>false</code> if the knight has not made the full tour,
     *         <code>true</code> otherwise.
     */
    public boolean fullTour() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chessBoard.getSymbol(i, j) == Board.REACHABLE_SYMBOL)
                    return false;
            }
        }
        return true;
    }

    /**
     * Gives the current row of the knight.
     * @return the knights current row.
     */
    public int getcurrentRow() {
        return currentRow;
    }
    /**
     * Gives the current column of the knight.
     * @return the knights current column.
     */
    public int getCurrentCol() {
        return currentCol;
    }
}
