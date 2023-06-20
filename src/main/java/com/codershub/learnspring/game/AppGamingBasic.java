package com.codershub.learnspring.game;

public class AppGamingBasic {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        GamingConsole superContraGame = new  SuperContraGame();
        GamingConsole packManGame = new PackManGame();
        var gameRunner = new GameRunner(packManGame);
        gameRunner.run();
    }
}
