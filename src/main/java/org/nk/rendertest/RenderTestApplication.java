package org.nk.rendertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Map;


@SpringBootApplication
@RestController
public class RenderTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenderTestApplication.class, args);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/api/echo")
    public Map<String, Object> echoJson(@RequestBody Map<String, Object> payload) {
        String message = payload.get("message").toString();
        int length = message.length();
        return Map.of(
                "status", "received",
                "data" , payload,
                "length", length,
                "timestamp", System.currentTimeMillis()
        );
    }
}
