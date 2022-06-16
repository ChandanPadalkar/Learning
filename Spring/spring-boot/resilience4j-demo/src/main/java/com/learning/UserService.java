package com.learning;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {

    @Retry(name = "userService", fallbackMethod = "getErrorMessage")
    public String getMessage() throws Exception {
        System.out.println("inside getMessage method: " + LocalDateTime.now());
        throw new Exception("Error in getMessage");
    }

    public String getErrorMessage(Exception e) {
        System.out.println("inside getErrorMessage : " + LocalDateTime.now());
        return "Error in sending message...";
    }
}
