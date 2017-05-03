package com.rav.psr;

import java.util.Scanner;

/**
 * Created by ravinder on 12/4/17.
 */
public class RealPlayer implements Player {

    private Scanner inputScanner;


    public RealPlayer() {
        inputScanner = new Scanner(System.in);
    }

    @Override
    public PaperScissorsRock.Move getMove() {

        // Prompt the real player
        System.out.print("Rock, Paper, or Scissors? ");

        // Get the user input. Some basic intelligence is used to distinguish...
        // between valid and invalid inputs from real player.
        String userInput = inputScanner.nextLine();

        if ((null != userInput) && (!userInput.isEmpty())) {
            userInput = userInput.toUpperCase();
            char firstLetter = userInput.charAt(0);
            if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
                // User has entered a valid input
                switch (firstLetter) {
                    case 'R':
                        return PaperScissorsRock.Move.ROCK;
                    case 'P':
                        return PaperScissorsRock.Move.PAPER;
                    case 'S':
                        return PaperScissorsRock.Move.SCISSORS;
                }
            }
        }

        // Real player has not entered a valid input. So...prompt again.
        System.out.print("\nOops! It appears you have not entered valid input. Please try again.\n\n");
        return getMove();
    }

}
