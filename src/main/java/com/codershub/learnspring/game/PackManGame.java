package com.codershub.learnspring.game;

public class PackManGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Packman up");
    }

    @Override
    public void down() {
        System.out.println("Packman down");


    }

    @Override
    public void left() {
        System.out.println("Packman left");


    }

    @Override
    public void right() {
        System.out.println("Packman right");


    }
}
