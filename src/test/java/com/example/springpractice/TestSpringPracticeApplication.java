package com.example.springpractice;

import org.springframework.boot.SpringApplication;

public class TestSpringPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.from(SpringPracticeApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
