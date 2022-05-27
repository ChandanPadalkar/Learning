package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Resilience4jDemoApplication {

    private UserService userService;

    public Resilience4jDemoApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Resilience4jDemoApplication.class, args);
    }


    @GetMapping("/message")
    public String getMessage() throws Exception {
        return this.userService.getMessage();
    }
}