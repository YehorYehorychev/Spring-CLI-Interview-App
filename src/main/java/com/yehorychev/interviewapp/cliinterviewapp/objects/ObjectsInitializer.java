package com.yehorychev.interviewapp.cliinterviewapp.objects;

import com.yehorychev.interviewapp.cliinterviewapp.cli.CommandLineInterface;
import com.yehorychev.interviewapp.cliinterviewapp.controller.InterviewQuestionController;
import com.yehorychev.interviewapp.cliinterviewapp.dao.InterviewQuestionStorage;
import com.yehorychev.interviewapp.cliinterviewapp.dao.inmemory.InMemoryInterviewQuestionStorage;
import com.yehorychev.interviewapp.cliinterviewapp.initdata.InitDataLoader;
import com.yehorychev.interviewapp.cliinterviewapp.service.InterviewQuestionService;
import com.yehorychev.interviewapp.cliinterviewapp.service.mappers.InterviewQuestionMapper;

public class ObjectsInitializer {

    private final InterviewQuestionStorage interviewQuestionStorage;
    private final InterviewQuestionMapper interviewQuestionMapper;
    private final InterviewQuestionService interviewQuestionService;
    private final InterviewQuestionController interviewQuestionController;
    private final InitDataLoader initDataLoader;
    private final CommandLineInterface commandLineInterface;

    public ObjectsInitializer() {
        this.interviewQuestionStorage = new InMemoryInterviewQuestionStorage();
        this.interviewQuestionMapper = new InterviewQuestionMapper();
        this.interviewQuestionService = new InterviewQuestionService(interviewQuestionMapper, interviewQuestionStorage);
        this.interviewQuestionController = new InterviewQuestionController(interviewQuestionService);
        this.commandLineInterface = new CommandLineInterface(interviewQuestionController);
        this.initDataLoader = new InitDataLoader(interviewQuestionController);
    }

    public void run() {
        commandLineInterface.run();
    }
}
