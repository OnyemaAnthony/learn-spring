package com.codershub.learnspring.examplec1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Arrays;
@Component
class ClassA{

}

@Component
@Lazy
class  ClassB{
    private  ClassA classA;

    public  ClassB(ClassA classA){
        System.out.println("Some init Logic Goes here");
        this.classA = classA;
    }
    public  void doSomething(){
        System.out.println("Do something here");
    }

}
@Configuration
 @ComponentScan
 public class SimpleSpringContextLauncherApplication {
    public static void main (String[] args) {
        var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);
        System.out.println("Inilization of Context is completed");
        context.getBean(ClassB.class).doSomething();

    }

    }