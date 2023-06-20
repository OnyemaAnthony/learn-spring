package com.codershub.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record  Person(String name, int age){};
record  Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfig {
    @Bean
    public  String name(){
        return  "Anthony";
    }


    @Bean
    public  int age(){
        return  20;
    }

    @Bean
    Person person(){
        Person anthony = new Person("Anthony",20);
        return  anthony;

    }
    @Bean(name = "address2")
    Address address(){
        return new Address("City ","citttty");
    }


}
