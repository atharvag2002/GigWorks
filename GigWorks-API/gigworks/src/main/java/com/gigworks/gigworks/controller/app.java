package com.gigworks.gigworks.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class app {

    @GetMapping("/gigs")
    public Map<String, String> getGigs() {
        return Map.of(
            "status", "success",
            "message", "API ffis working"
        );
    }
}

