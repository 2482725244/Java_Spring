package com.example.helloword;

import com.example.helloword.Bean.Cat;
import com.example.helloword.Bean.Dog;
import com.example.helloword.Bean.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWordApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(HelloWordApplication.class, args);

        Dog dog = (Dog)run.getBean("dog");
        Cat cat = run.getBean(Cat.class);
        Person person = run.getBean(Person.class);


        System.out.println(person);
        System.out.println(cat);
        System.out.println(dog);

    }

}
