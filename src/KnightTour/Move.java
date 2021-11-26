package KnightTour;

/**
 * A class that contains the move types that a knight can make on a chess board.
 * See the PNG to understand how the move type corresponds to the move on a board.
 */
public class Move {
    /** An integer that says how many rows the move changes.
     * Positive means downwards and negative means upwards. */
    private final int moveRow;

    /** An integer that says how many columns the move changes.
     * Positive means right and negative means left. */
    private final int moveCol;

    /**
     * Creates a move that changes both row- and column wise.
     * @param moveType Is the type of move that the knight takes, 8 possible,
     *                 see explanation in the PNG.
     */
    public Move(int moveType) {
        int[] horizontal = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
        this.moveCol = horizontal[moveType];

        int[] vertical = new int[]{2, 1, -1, -2, -2, -1, 1, 2};
        this.moveRow = vertical[moveType];
    }


    public int getMoveRow() {
        return moveRow;
    }

    public int getMoveCol() {
        return moveCol;
    }
}
