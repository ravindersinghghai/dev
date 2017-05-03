package com.rav.psr;

/**
 * Created by ravinder on 12/4/17.
 */
public class PaperScissorsRock {

    private Player realPlayer;
    private Player computer;
    private int numberOfGames;


    public PaperScissorsRock() {

        // Code to Interface
        realPlayer = new RealPlayer();
        computer = new Computer();

        numberOfGames = 0;
    }

    enum Move {

        ROCK, PAPER, SCISSORS;

        /**
         * Compares this move with another move to determining a tie, a win, or a loss
         *
         * @param otherMove move to compare to
         * @return "Win" if this move beats the other move, "Loose" if this move loses to
         * the other move, and "Tie" if these moves tie.
         */
        public String compareMoves(Move otherMove) {
            // Tie
            if (this == otherMove)
                return "Tie";

            switch (this) {
                case ROCK:
                    return (otherMove == SCISSORS ? "Win" : "Loose");
                case PAPER:
                    return (otherMove == ROCK ? "Win" : "Loose");
                case SCISSORS:
                    return (otherMove == PAPER ? "Win" : "Loose");
            }

            // Should never reach here
            return "Tie";
        }
    }

    public static void main(String[] args) {
        PaperScissorsRock game = new PaperScissorsRock();
        game.startGame();
    }

    public void startGame() {

        // Display this game name message only once when you start the game
        if (numberOfGames == 0)
            System.out.println("ROCK, PAPER, SCISSORS!");

        // Get moves
        Move realPlayerMove = realPlayer.getMove();
        Move computerMove = computer.getMove();
        System.out.println("\nYou played " + realPlayerMove + ".");
        System.out.println("Computer played " + computerMove + ".\n");

        // Compare moves and determine winner
        String compareMoves = realPlayerMove.compareMoves(computerMove);
        switch (compareMoves) {
            case "Tie": // Tie
                System.out.println("Tie!\n");
                break;
            case "Win": // realPlayer wins
                System.out.println(realPlayerMove + " beats " + computerMove + ". You won!\n");
                break;
            case "Loose": // Computer wins
                System.out.println(computerMove + " beats " + realPlayerMove + ". You lost.\n");
                break;
        }
        numberOfGames++;

        if (numberOfGames <= 4) {
            startGame();
        } else {
            System.out.println("You have now played default 5 games.\n" +
                    "Exiting now...\n" +
                    "Have a nice day !!\n");
        }
    }

}
