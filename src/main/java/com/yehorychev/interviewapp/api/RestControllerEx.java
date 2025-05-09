package com.yehorychev.interviewapp.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllerEx {

    @GetMapping("/api/test") // By default, our application will run on localhost port:8080
    public String getTest() {
        return "GET Response Placeholder";
    }

    @PostMapping
    public String postTest() {
        return "POST Response Placeholder";
    }

    @PutMapping
    public String putTest() {
        return "PUT Response Placeholder";
    }

    @PatchMapping
    public String patchTest() {
        return "PATCH Response Placeholder";
    }

    @DeleteMapping
    public String deleteTest() {
        return "DELETE Response Placeholder";
    }
}
