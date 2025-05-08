package com.yehorychev.interviewapp.cliinterviewapp.service;

import com.yehorychev.interviewapp.cliinterviewapp.dao.InterviewQuestionStorage;
import com.yehorychev.interviewapp.cliinterviewapp.dto.InterviewQuestionDto;
import com.yehorychev.interviewapp.cliinterviewapp.model.InterviewQuestion;
import com.yehorychev.interviewapp.cliinterviewapp.service.mappers.InterviewQuestionMapper;

import java.util.List;

public class InterviewQuestionService {

    private final InterviewQuestionMapper interviewQuestionMapper;
    private final InterviewQuestionStorage storage;

    public InterviewQuestionService(InterviewQuestionMapper interviewQuestionMapper, InterviewQuestionStorage storage) {
        this.interviewQuestionMapper = interviewQuestionMapper;
        this.storage = storage;
    }

    public InterviewQuestion create(InterviewQuestionDto questionDto) {
        InterviewQuestion interviewQuestion = interviewQuestionMapper.toInterviewQuestion(questionDto);
        return storage.createInterviewQuestion(interviewQuestion);
    }

    public List<InterviewQuestionDto> getAll() {
        List<InterviewQuestion> questions = storage.getAll();
        return questions.stream()
                .map(interviewQuestionMapper::toInterviewQuestionDto)
                .toList();
    }
}
