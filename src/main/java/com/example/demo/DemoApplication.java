package com.example.demo;

import static org.springframework.boot.WebApplicationType.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication springApplication =
            new SpringApplicationBuilder(DemoApplication.class).web(NONE).build();
        springApplication.run(args);
    }

}
