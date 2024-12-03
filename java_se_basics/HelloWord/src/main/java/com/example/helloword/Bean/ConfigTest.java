package com.example.helloword.Bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTest {

    @Bean
    public Dog dog(){
        return new Dog("wangcai",3);
    }





}
