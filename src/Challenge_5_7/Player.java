package Challenge_5_7;

import java.util.Locale;
import java.util.Scanner;

public class Player {
    Scanner scanner;

    public Player(){
        scanner = new Scanner(System.in);
    }

    public GameData.CHOICES getChoice() {
        System.out.println("Type your choice: R=Rock, P=Paper or S=Scissors.");
        String choice = scanner.nextLine().toUpperCase();

        return switch (choice) {
            case "R" -> GameData.CHOICES.ROCK;
            case "P" -> GameData.CHOICES.PAPER;
            case "S" -> GameData.CHOICES.SCISSORS;
            default -> null;
        };
    }
}
