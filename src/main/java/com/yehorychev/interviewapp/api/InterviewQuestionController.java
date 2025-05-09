package com.yehorychev.interviewapp.api;

import com.yehorychev.interviewapp.dto.InterviewQuestionDto;
import com.yehorychev.interviewapp.model.InterviewQuestion;
import com.yehorychev.interviewapp.service.InterviewQuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InterviewQuestionController {

    private final InterviewQuestionService service;

    public InterviewQuestion createInterviewQuestion(InterviewQuestionDto questionDto) {
        return service.create(questionDto);
    }

    public List<InterviewQuestionDto> getAllInterviewQuestions() {
        return service.getAll();
    }
}