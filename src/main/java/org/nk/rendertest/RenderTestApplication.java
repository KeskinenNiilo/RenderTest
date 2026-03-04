package org.nk.rendertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class RenderTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenderTestApplication.class, args);
    }

    @GetMapping("/api/test")
    public Map<String, String> testConnection() {
        return Map.of(
                "status", "UP",
                "message", "Dockerized app works!",
                "timestamp", String.valueOf(System.currentTimeMillis())
        );
    }
}