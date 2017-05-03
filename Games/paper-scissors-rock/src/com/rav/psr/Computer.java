package com.rav.psr;

import java.util.Random;

/**
 * Created by ravinder on 12/4/17.
 */
public class Computer implements Player {

    @Override
    public PaperScissorsRock.Move getMove() {
        PaperScissorsRock.Move[] moves = PaperScissorsRock.Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }

}
