package KnightTour;

import javax.swing.*;
import java.awt.*;

public class swing extends JFrame{
    private Dimension dims = new Dimension(64, 64);
    private JPanel[][] tiles = new JPanel[8][8];

    public swing(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JPanel b = new JPanel();
                b.setPreferredSize(dims);
                b.setMinimumSize(dims);
                if ((i + j + 1) % 2 == 0) {
                    b.setBackground(Color.BLACK);
                } else {
                    b.setBackground(Color.WHITE);
                }
                tiles[i][j] = b;
            }
        }
    }

    public static void main(String[] args) {




        JPanel b = new JPanel();
        b.setPreferredSize(dims);
        b.setMinimumSize(dims);

        b.setBackground(Color.RED);


        tiles[1][2] = b;
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                f.add(tiles[i][j]);
            }
        }
        f.pack();
        f.setSize(530,550);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

    }
}
