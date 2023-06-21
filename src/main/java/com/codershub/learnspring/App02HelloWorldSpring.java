package com.codershub.learnspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
     var context =    new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//        System.out.println(context.getBean("age"));
//        System.out.println(context.getBean("person"));
//        System.out.println(context.getBean(Address.class  ));
        System.out.println(context.getBeanDefinitionNames());
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


    }
}
