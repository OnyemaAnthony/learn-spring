package com.codershub.learnspring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppGamingBasic {
    @Bean
    public GamingConsole game(){
        var game = new PackManGame();
        return  game;
    }
    @Bean
    public  GameRunner gameRunner(GamingConsole game){
        var gameRunner = new  GameRunner(game);
        return  gameRunner;
    }
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(AppGamingBasic.class);
        context.getBean(GamingConsole.class).down();
        context.getBean(GameRunner.class).run();

    }
}
