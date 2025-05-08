package com.yehorychev.interviewapp.controller.controller;

import com.yehorychev.interviewapp.dto.dto.InterviewQuestionDto;
import com.yehorychev.interviewapp.model.model.InterviewQuestion;
import com.yehorychev.interviewapp.service.service.InterviewQuestionService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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