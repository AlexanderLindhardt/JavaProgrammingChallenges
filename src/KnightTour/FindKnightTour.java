package KnightTour;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindKnightTour {

    public static void main(String[] args) {

        Random rand = new Random();
        int [] firstPos;
        List<Integer> path = new ArrayList<>();
        Knight knight = new Knight(rand.nextInt(8), rand.nextInt(8));
        firstPos = new int[] {knight.getcurrentRow(), knight.getCurrentCol()};

        while (!knight.fullTour()) {
            int moveType = rand.nextInt(8);
            Move move = new Move(moveType);
            boolean madeMove = knight.moveKnight(move);
            if (madeMove)
                path.add(moveType);
            if (!knight.legalMoves() && !knight.fullTour()) {
                knight = new Knight(rand.nextInt(8), rand.nextInt(8));
                firstPos = new int[] {knight.getcurrentRow(), knight.getCurrentCol()};
                path = new ArrayList<>();
            }

        }

        reconstructPath(path, firstPos);

    }
    public static void reconstructPath(List<Integer> path, int[] firstPosition) {


        System.out.println("Number of moves: " + path.size());
        System.out.println("First position: " + firstPosition[0] + ", " + firstPosition[1]);
        Knight knight1 = new Knight(firstPosition[0], firstPosition[1]);
        for (Integer integer : path) {
            Move move = new Move(integer);
            knight1.moveKnight(move);
            System.out.println(knight1.getChessBoard().toString());
        }
    }


}
