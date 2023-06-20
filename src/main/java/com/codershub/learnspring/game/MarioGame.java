package com.codershub.learnspring.game;

public class MarioGame implements  GamingConsole{
    public  void up(){
        System.out.println("jump");
    }

    public  void down(){
        System.out.println("Go into a hole");
    }

    public  void left(){
        System.out.println("go back");
    }

    public  void right(){
        System.out.println("accelerate");
    }
}


