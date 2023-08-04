package com.codershub.learnspring.examplec1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SimpleSpringContextLauncherApplication {
    public static void main (String[] args) {
        var context = new ClassPathXmlApplicationContext("config.xml");
        Arrays.stream(context.getBeanDefinitionNames ()).forEach (System.out::println);

    }

    }