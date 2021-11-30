package KnightTour;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A class that finds and visualizes a full knight tour.
 */
public class FindKnightTour {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hej");
        Random rand = new Random();
        // A vector that holds the random initial position of the knight.
        int [] firstPos = new int[]{rand.nextInt(8),rand.nextInt(8)};

        // Create a knight at the initial position.
        Knight knight = new Knight(firstPos[0], firstPos[1]);

        // An array that saves the knight's move, used in order to reconstruct the path later.
        List<Integer> path = new ArrayList<>();

        // Brute-force method.
        while (!knight.fullTour()) { // Do until we find a full knight tour.
            int moveType = rand.nextInt(8); // Make moves randomly
            Move move = new Move(moveType);
            boolean madeMove = knight.moveKnight(move);
            if (madeMove) // Only add the move to the path if we actually made the move, i.e. it was legal.
                path.add(moveType);
            if (!knight.legalMoves() && !knight.fullTour()) { // If we can't make any moves, but it hasn't made a full tour we restart.
                firstPos = new int[]{rand.nextInt(8),rand.nextInt(8)};
                knight = new Knight(firstPos[0], firstPos[1]);
                path = new ArrayList<>();
            }

        }

        // Reconstruct the path and show it my drawing the full tour.
        // Green square is the knight's current position, red squares are already travelled squares that the knight can't go to.
        chessBoardSwing board = new chessBoardSwing();
        Knight knightDemonstrator = new Knight(firstPos[0], firstPos[1]);
        int[] currentPos = new int[2]; // A vector that saves current knight's position.
        int[] nextPos = new int[2]; // A vector that saves the knight's next position.
        int sleepTime = 500;
        board.showCurrentBoard();
        Thread.sleep(sleepTime);

        for (Integer integer : path) {
            currentPos[0] = knightDemonstrator.getcurrentRow();
            currentPos[1] = knightDemonstrator.getCurrentCol();
            board.setTile(currentPos[0], currentPos[1], Color.GREEN);
            board.showCurrentBoard();
            Thread.sleep(sleepTime);

            Move move = new Move(integer);
            knightDemonstrator.moveKnight(move);
            nextPos[0] = knightDemonstrator.getcurrentRow();
            nextPos[1] = knightDemonstrator.getCurrentCol();
            board.setTile(currentPos[0], currentPos[1], Color.RED);
            board.setTile(nextPos[0], nextPos[1], Color.GREEN);
            board.showCurrentBoard();
        }
    }
}
