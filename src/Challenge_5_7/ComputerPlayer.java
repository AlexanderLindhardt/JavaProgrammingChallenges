package Challenge_5_7;

import java.util.Random;

public class ComputerPlayer {
    private final Random rand;

    public ComputerPlayer() {
        this.rand = new Random();
    }

    public GameData.CHOICES getChoice(){
        int nOfChoices = 3;
        int choice = 1 + rand.nextInt(nOfChoices);
        return switch (choice) {
            case 1 -> GameData.CHOICES.ROCK;
            case 2 -> GameData.CHOICES.PAPER;
            case 3 -> GameData.CHOICES.SCISSORS;
            default -> null;
        };
    }
}
