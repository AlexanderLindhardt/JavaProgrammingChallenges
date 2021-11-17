package Challenge_5_7;

public class PlayRound {
    Player player;
    ComputerPlayer computer;
    int computerScore;
    int playerScore;


    public PlayRound(){
        player = new Player();
        computer = new ComputerPlayer();

        playerScore = 0;
        computerScore = 0;
    }
    public void play() {
        System.out.println("New Round");
        GameData.CHOICES computerChoice = computer.getChoice();
        System.out.println("Computer chooses " + computerChoice);
        GameData.CHOICES playerChoice = player.getChoice();
        System.out.println("Player chooses " + playerChoice);
        GameData.OUTCOMES outcome = getOutcome(playerChoice, computerChoice);
        printOutcome(outcome);
        System.out.println("Total score: player " + playerScore + " - " + computerScore + " computer.");

    }

    private GameData.OUTCOMES getOutcome(GameData.CHOICES playerChoice, GameData.CHOICES computerChoice) {
        if (playerChoice == null) {
            System.exit(0);
        }
        if (playerChoice == computerChoice) {
            return GameData.OUTCOMES.DRAW;
        }
        if (playerChoice == GameData.CHOICES.ROCK) {
            if (computerChoice == GameData.CHOICES.PAPER) {
                computerScore++;
                return GameData.OUTCOMES.LOOSE;
            } else {
                playerScore++;
                return GameData.OUTCOMES.WIN;}
        }
        else if (playerChoice == GameData.CHOICES.PAPER){
            if (computerChoice == GameData.CHOICES.ROCK) {
                playerScore++;
                return GameData.OUTCOMES.WIN;
            } else {
                computerScore++;
                return GameData.OUTCOMES.LOOSE;}
            }


        else {
            if (computerChoice == GameData.CHOICES.ROCK) {
                computerScore++;
                return GameData.OUTCOMES.LOOSE;
            } else {
                playerScore++;
                return GameData.OUTCOMES.WIN;}
        }
    }

    private void printOutcome(GameData.OUTCOMES outcome) {
        switch (outcome) {
            case WIN -> System.out.println("Player won! \n");
            case LOOSE -> System.out.println("Player lost :(\n");
            case DRAW -> System.out.println("It is a draw.\n");
        }
    }

}
