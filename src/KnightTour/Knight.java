package KnightTour;

public class Knight extends Board{
    private int currentRow;
    private int currentCol;
    private Board chessBoard;

    public Knight(int initialRow, int initialCol) {
        this.currentRow = initialRow;
        this.currentCol = initialCol;
        this.chessBoard = new Board();
        this.chessBoard.insertMove(this.currentRow, this.currentCol);
        //System.out.println(chessBoard.toString());
    }

    public void moveKnight(Move move) {
        if (isLegalMove(move)) {
            this.currentRow += move.getMoveRow();
            this.currentCol += move.getMoveCol();
            chessBoard.insertMove(this.currentRow, this.currentCol);
            //System.out.println(chessBoard.toString());
        }
    }
    public boolean isLegalMove(Move move) {
        if (this.currentRow + move.getMoveRow() > 7 || this.currentRow + move.getMoveRow() < 0 ||
                this.currentCol + move.getMoveCol() > 7 || this.currentCol + move.getMoveCol() < 0 )
            return false;
        else return chessBoard.getSymbol(this.currentRow + move.getMoveRow(), this.currentCol + move.getMoveCol()) != 'x';
    }

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
    public boolean fullTour() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chessBoard.getSymbol(i,j) == '-')
                    return false;

            }

        }
        return true;
    }
    public int getcurrentRow() {
        return currentRow;
    }

    public int getCurrentCol() {
        return currentCol;
    }
}
