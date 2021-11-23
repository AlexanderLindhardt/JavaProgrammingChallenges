package KnightTour;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindKnightTour {

    public static void main(String[] args) {
        //Random rand = new Random();
        //Knight knight = new Knight(6,5);
/*
        while (knight.legalMoves()) {
            System.out.println("knight row: " + knight.getcurrentRow());
            System.out.println("knight col: " + knight.getCurrentCol());
            int moveType = rand.nextInt(8);
            Move move = new Move(moveType);
            System.out.println("moveType: " + moveType);
            knight.moveKnight(move);
            System.out.println("knight row: " + knight.getcurrentRow());
            System.out.println("knight col: " + knight.getCurrentCol());

        }

 */
        Random rand = new Random();
        int [] firstPos;
        List<Integer> path = new ArrayList<Integer>();
        Knight knight = new Knight(rand.nextInt(8), rand.nextInt(8));
        firstPos = new int[] {knight.getcurrentRow(), knight.getCurrentCol()};
        while (!knight.fullTour()) {

            int moveType = rand.nextInt(8);
            path.add(moveType);
            Move move = new Move(moveType);

            knight.moveKnight(move);
            if (!knight.legalMoves() && !knight.fullTour()) {
                knight = new Knight(rand.nextInt(8), rand.nextInt(8));
                firstPos = new int[] {knight.getcurrentRow(), knight.getCurrentCol()};
                path= new ArrayList<Integer>();
            }



        }
        System.out.println("Number of moves: " + path.size());
        System.out.println("First position: " + firstPos[0] + ", " + firstPos[1]);
        for (int i = 0; i < path.size(); i++) {
            System.out.println(path.get(i));

        }
/*
        System.out.println("knight row: " + knight.getcurrentRow());
        System.out.println("knight col: " + knight.getCurrentCol());
        System.out.println();
        int moveType = rand.nextInt(8);
        Move move = new Move(5);
        System.out.println("moveType: " + moveType);
        knight.moveKnight(move);

 */
    }


}
