package com.yehorychev.interviewapp;

import com.yehorychev.interviewapp.cli.cli.CommandLineInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewQuestionsApp implements CommandLineRunner {
    private final CommandLineInterface commandLineInterface;

    public InterviewQuestionsApp(CommandLineInterface commandLineInterface) {
        this.commandLineInterface = commandLineInterface;
    }

    public static void main(String[] args) {
        SpringApplication.run(InterviewQuestionsApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        commandLineInterface.run();
    }
}