package com.codershub.learnspring.game;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole marioGame) {
        game = marioGame;
    }

    public void run() {
        System.out.println("i am running bro "+game.toString());
        game.down();
    }
}
