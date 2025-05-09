package com.yehorychev.interviewapp.service;

import com.yehorychev.interviewapp.dao.InterviewQuestionStorage;
import com.yehorychev.interviewapp.dto.InterviewQuestionDto;
import com.yehorychev.interviewapp.model.InterviewQuestion;
import com.yehorychev.interviewapp.service.mappers.InterviewQuestionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InterviewQuestionService {

    private final InterviewQuestionMapper interviewQuestionMapper;
    private final InterviewQuestionStorage storage;

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