package com.yehorychev.interviewapp.cliinterviewapp.controller;

import com.yehorychev.interviewapp.cliinterviewapp.dto.InterviewQuestionDto;
import com.yehorychev.interviewapp.cliinterviewapp.model.InterviewQuestion;
import com.yehorychev.interviewapp.cliinterviewapp.service.InterviewQuestionService;

import java.util.List;

public class InterviewQuestionController {

    private final InterviewQuestionService service;

    public InterviewQuestionController(InterviewQuestionService service) {
        this.service = service;
    }

    public InterviewQuestion createInterviewQuestion(InterviewQuestionDto questionDto) {
        return service.create(questionDto);
    }

    public List<InterviewQuestionDto> getAllInterviewQuestions() {
        return service.getAll();
    }
}