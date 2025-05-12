package com.yehorychev.interviewapp.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
@Slf4j
public class RestControllerEx {

//    @GetMapping("examples") // By default, our application will run on localhost port:8080
    @RequestMapping(path = "users/{id}", method = RequestMethod.GET)
    public String getTest(@PathVariable Long id) {
        log.info("Processing your request in thread: {}", Thread.currentThread().getName());
        return "User ID: " + id;
        // http://localhost:8080/api/v1/test/users/5
    }

    /*@PostMapping
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
    }*/
}
