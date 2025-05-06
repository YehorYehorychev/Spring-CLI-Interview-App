package com.yehorychev.interviewapp;

import com.yehorychev.interviewapp.service.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewApplication implements CommandLineRunner {
    private final DemoService demoService;

    public InterviewApplication(DemoService demoService) {
        this.demoService = demoService;
    }

    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("================== " +
                InterviewApplication.class.getName() + " is running ==================");
        demoService.processData();
    }
}
