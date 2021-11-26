package KnightTour;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * A chess board as a JFrame object that can be drawn and shown.
 * Made to visualize the completed full tour of the knight.
 */
public class chessBoardSwing extends JFrame{
    /** An array with the tiles of a chess board. */
    private final JPanel[][] tiles = new JPanel[8][8];

    /**
     * Constructor of the drawable chess board. First makes the default
     * black and white tiles.
     */
    public chessBoardSwing(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JPanel b = new JPanel();
                Dimension dims = new Dimension(64, 64);
                b.setPreferredSize(dims);
                b.setMinimumSize(dims);
                b.setBorder(BorderFactory.createLineBorder(Color.black));
                if ((i + j + 1) % 2 == 0) {
                    b.setBackground(Color.BLACK);
                } else {
                    b.setBackground(Color.WHITE);
                }
                this.tiles[i][j] = b;
            }
        }
    }

    /**
     * Changes the color of a tile om the chess board.
     * @param row The row of the tile that is re-painted.
     * @param col The column of the tile that is re-painted.
     * @param color The color that the tile will be painted as.
     */
    public void setTile(int row, int col, Color color) {
        this.tiles[row][col].setBackground(color);
    }

    /**
     * Draws the current board of the tiles.
     */
    public void showCurrentBoard() {
        setLayout(new GridLayout(8,8));

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                add(this.tiles[i][j]);
            }
        }
        pack();
        setSize(530,550);//400 width and 500 height
        setVisible(true);//making the frame visible
    }

}
