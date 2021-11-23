package KnightTour;

public class Move {
    private final int[] horizontal = new int[] {1, 2, 2, 1, -1, -2, -2, -1};
    private final int[] vertical = new int[] {2, 1, -1, -2, -2, -1, 1, 2};
    private int moveRow;
    private int moveCol;

    public Move(int moveType) {
        this.moveRow = horizontal[moveType];
        this.moveCol = vertical[moveType];
    }

    public int getMoveRow() {
        return moveRow;
    }

    public int getMoveCol() {
        return moveCol;
    }
}
