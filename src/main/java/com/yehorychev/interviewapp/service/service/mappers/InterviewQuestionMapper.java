package com.yehorychev.interviewapp.service.service.mappers;

import com.yehorychev.interviewapp.dto.dto.InterviewQuestionDto;
import com.yehorychev.interviewapp.model.model.InterviewQuestion;
import org.springframework.stereotype.Service;

@Service
public class InterviewQuestionMapper {

    public InterviewQuestion toInterviewQuestion(InterviewQuestionDto interviewQuestionDto) {
        return new InterviewQuestion(interviewQuestionDto.getQuestion(), interviewQuestionDto.getAnswer());
    }

    public InterviewQuestionDto toInterviewQuestionDto(InterviewQuestion interviewQuestion) {
        return new InterviewQuestionDto(interviewQuestion.getId(), interviewQuestion.getQuestion(), interviewQuestion.getAnswer());
    }
}
