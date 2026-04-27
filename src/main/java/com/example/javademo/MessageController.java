package com.example.javademo;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/api/message")
    public Map<String, String> message() {
        return Map.of("message", "Hello from Java demo");
    }
}
