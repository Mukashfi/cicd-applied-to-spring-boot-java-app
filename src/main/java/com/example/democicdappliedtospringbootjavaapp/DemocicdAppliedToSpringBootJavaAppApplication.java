package com.example.democicdappliedtospringbootjavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemocicdAppliedToSpringBootJavaAppApplication {

@GetMapping("/")
public String home(){
    return  "Hello world from D-ZONE!";
}


    public static void main(String[] args) {
        SpringApplication.run(DemocicdAppliedToSpringBootJavaAppApplication.class, args);
    }

}
