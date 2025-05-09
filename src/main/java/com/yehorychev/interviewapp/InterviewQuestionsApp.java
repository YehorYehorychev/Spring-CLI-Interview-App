package com.yehorychev.interviewapp;

import com.yehorychev.interviewapp.cli.CommandLineInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class InterviewQuestionsApp implements CommandLineRunner {
    private final CommandLineInterface commandLineInterface;

    public static void main(String[] args) {
        SpringApplication.run(InterviewQuestionsApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        commandLineInterface.run();
    }
}